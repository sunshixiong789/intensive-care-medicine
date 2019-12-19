package com.mskysoft.baseservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mskysoft.baseservice.entity.DeptInfo;
import com.mskysoft.baseservice.service.DeptInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 科室资料表(DeptInfo)表控制层
 *
 * @author daiminghang
 * @since 2019-10-12 17:16:07
 */
@Api(tags = "科室资料表")
@NoArgsConstructor
@RestController
@RequestMapping("deptInfo")
public class DeptInfoController extends ApiController {

    /**
     * 服务对象
     */
    @Resource
    private DeptInfoService deptInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param deptInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    @ApiOperation("分页查询所有数据")
    public R<IPage<DeptInfo>> selectAll(Page<DeptInfo> page, DeptInfo deptInfo) {
        return success(this.deptInfoService.page(page, new QueryWrapper<>(deptInfo)));
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
    public R<DeptInfo> selectOne(@PathVariable Integer id) {
        return success(this.deptInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param deptInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    @ApiOperation("新增数据")
    public R<Boolean> insert(@RequestBody DeptInfo deptInfo) {
        return success(this.deptInfoService.save(deptInfo));
    }

    /**
     * 修改数据
     *
     * @param deptInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    @ApiOperation("修改数据")
    public R<Boolean> update(@RequestBody DeptInfo deptInfo) {
        return success(this.deptInfoService.updateById(deptInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除结果
     */
    @DeleteMapping("{id}")
    @ApiOperation("删除数据")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "主键")})
    public R<Boolean> delete(@PathVariable Integer id) {
        return success(this.deptInfoService.removeById(id));
    }

    /**
     * 根据名称模糊查询部门资料
     *
     * @param page 分页数据
     * @param name 名称
     * @return 查询到的分页数据
     */
    @GetMapping("/name")
    @ApiOperation("根据名称模糊查询部门资料")
    @ApiImplicitParams({@ApiImplicitParam(name = "name", value = "名称")})
    public R<IPage<DeptInfo>> selectByName(Page<DeptInfo> page, String name) {
        // 查询条件
        QueryWrapper<DeptInfo> deptInfoQueryWrapper = new QueryWrapper<>();
        deptInfoQueryWrapper.lambda().like(DeptInfo::getInfoName, name);
        return success(deptInfoService.page(page, deptInfoQueryWrapper));
    }
}