package com.mskysoft.baseservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mskysoft.baseservice.entity.Department;
import com.mskysoft.baseservice.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;

/**
 * 科室表(Department)表控制层
 *
 * @author daiminghang
 * @since 2019-10-12 17:16:08
 */
@Api(tags = "科室表")
@NoArgsConstructor
@RestController
@RequestMapping("department")
public class DepartmentController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private DepartmentService departmentService;

    /**
     * 分页查询所有数据
     *
     * @param page       分页对象
     * @param department 查询实体
     * @return 所有数据
     */
    @GetMapping
    @RolesAllowed({"write"})
    @ApiOperation("分页查询所有数据")
    public R<IPage<Department>> selectAll(Page<Department> page, Department department) {
        return success(this.departmentService.page(page, new QueryWrapper<>(department)));
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
    public R<Department> selectOne(@PathVariable Integer id) {
        return success(this.departmentService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param department 实体对象
     * @return 新增结果
     */
    @PostMapping
    @ApiOperation("新增数据")
    public R<Boolean> insert(@RequestBody Department department) {
        return success(this.departmentService.save(department));
    }

    /**
     * 修改数据
     *
     * @param department 实体对象
     * @return 修改结果
     */
    @PutMapping
    @ApiOperation("修改数据")
    public R<Boolean> update(@RequestBody Department department) {
        return success(this.departmentService.updateById(department));
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
        return success(this.departmentService.removeById(id));
    }
}
