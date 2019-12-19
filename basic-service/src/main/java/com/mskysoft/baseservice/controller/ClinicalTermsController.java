package com.mskysoft.baseservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mskysoft.baseservice.entity.ClinicalTerms;
import com.mskysoft.baseservice.service.ClinicalTermsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 临床术语(ClinicalTerms)表控制层
 *
 * @author sunshixiong
 * @since 2019-10-09 14:35:41
 */
@Api(tags = "临床术语")
@RestController
@NoArgsConstructor
@RequestMapping("clinicalTerms")
public class ClinicalTermsController extends ApiController {
  /**
   * 服务对象
   */
  @Resource
  private ClinicalTermsService clinicalTermsService;

  /**
   * 根据parentId获取数据
   *
   * @param id 父类id
   * @return 所有数据
   */
  @ApiOperation("根据parentId获取数据")
  @GetMapping("/parent")
  @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "父级id")})
  public R<List<ClinicalTerms>> selectByParentId(Integer id) {
    if (id == null) {
      id = 0;
    }
    return success(clinicalTermsService.list(new QueryWrapper<ClinicalTerms>()
            .lambda().eq(ClinicalTerms::getParentId, id)));
  }

  @ApiOperation("根据应用侧重值和分类名称获取列表信息")
  @GetMapping("/getByName")
  @ApiImplicitParams({@ApiImplicitParam(name = "focusing", value = "应用侧重值（1：观测项，2：观测值，3观测项与值）")
          , @ApiImplicitParam(name = "name", value = "分类名称")})
  public R<List<ClinicalTerms>> findAllByName(Integer focusing, String name) {

    return success(clinicalTermsService.list(new QueryWrapper<ClinicalTerms>()
            .lambda()
            .eq(focusing != null, ClinicalTerms::getApplicationFocusing, focusing)
            .like(name != null && !"".equals(name), ClinicalTerms::getName, name)
    ));
  }

  /**
   * 分页查询所有数据
   *
   * @param page          分页对象
   * @param clinicalTerms 查询实体
   * @return 所有数据
   */
  @GetMapping
  @ApiOperation("分页查询所有数据")
  public R<IPage<ClinicalTerms>> selectAll(Page<ClinicalTerms> page, ClinicalTerms clinicalTerms) {
    return success(this.clinicalTermsService.page(page, new QueryWrapper<>(clinicalTerms)));
  }

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("{id}")
  @ApiOperation("通过主键查询单条数据")
  @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "id")})
  public R<ClinicalTerms> selectOne(@PathVariable Integer id) {
    return success(this.clinicalTermsService.getById(id));
  }

  /**
   * 新增数据
   *
   * @param clinicalTerms 实体对象
   * @return 新增结果
   */
  @PostMapping
  @ApiOperation("新增数据")
  public R<Boolean> insert(@RequestBody ClinicalTerms clinicalTerms) {
    return success(this.clinicalTermsService.save(clinicalTerms));
  }

  /**
   * 修改数据
   *
   * @param clinicalTerms 实体对象
   * @return 修改结果
   */
  @PutMapping("{id}")
  @ApiOperation("修改数据")
  public R<Boolean> update(@RequestBody ClinicalTerms clinicalTerms, @PathVariable Integer id) {
    clinicalTerms.setId(id);
    clinicalTerms.setCreateTime(null);
    clinicalTerms.setUpdateTime(null);
    return success(this.clinicalTermsService.updateById(clinicalTerms));
  }

  /**
   * 删除数据
   *
   * @param id 主键
   * @return 删除结果
   */
  @DeleteMapping("{id}")
  @ApiOperation("删除数据")
  @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "id")})
  public R<Boolean> delete(@PathVariable Integer id) {
    List list = clinicalTermsService.list(new QueryWrapper<ClinicalTerms>()
            .lambda().eq(ClinicalTerms::getParentId, id));
    if (!list.isEmpty()) {
      return failed("有子节点无法删除");
    }
    return success(this.clinicalTermsService.removeById(id));
  }
}
