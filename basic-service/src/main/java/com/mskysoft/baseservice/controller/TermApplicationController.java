package com.mskysoft.baseservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mskysoft.baseservice.entity.TermApplication;
import com.mskysoft.baseservice.service.TermApplicationService;
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

/**
 * 术语应用(TermApplication)表控制层
 *
 * @author sunshixiong
 * @since 2019-10-09 16:23:42
 */
@Api(tags = "术语应用")
@NoArgsConstructor
@RestController
@RequestMapping("termApplication")
public class TermApplicationController extends ApiController {
  /**
   * 服务对象
   */
  @Resource
  private TermApplicationService termApplicationService;

  /**
   * 分页查询所有数据
   *
   * @param page            分页对象
   * @param termApplication 查询实体
   * @return 所有数据
   */
  @GetMapping
  @ApiOperation("分页查询所有数据")
  public R<IPage<TermApplication>> selectAll(Page<TermApplication> page, TermApplication termApplication) {
    return success(this.termApplicationService.page(page, new QueryWrapper<>(termApplication)));
  }

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @ApiOperation("通过主键查询单条数据")
  @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "id")})
  @GetMapping("{id}")
  public R<TermApplication> selectOne(@PathVariable Integer id) {
    return success(this.termApplicationService.getById(id));
  }

  /**
   * 新增数据
   *
   * @param termApplication 实体对象
   * @return 新增结果
   */
  @ApiOperation("新增数据")
  @PostMapping
  public R<Boolean> insert(@RequestBody TermApplication termApplication) {
    return success(this.termApplicationService.save(termApplication));
  }

  /**
   * 修改数据
   *
   * @param termApplication 实体对象
   * @return 修改结果
   */
  @ApiOperation("修改数据")
  @PutMapping("{id}")
  public R<Boolean> update(@RequestBody TermApplication termApplication,@PathVariable Integer id) {
    termApplication.setId(id);
    return success(this.termApplicationService.updateById(termApplication));
  }

  /**
   * 删除数据
   *
   * @param id 主键结合
   * @return 删除结果
   */
  @ApiOperation("删除数据")
  @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "id")})
  @DeleteMapping("{id}")
  public R<Boolean> delete(@PathVariable Integer id) {
    return success(this.termApplicationService.removeById(id));
  }
}
