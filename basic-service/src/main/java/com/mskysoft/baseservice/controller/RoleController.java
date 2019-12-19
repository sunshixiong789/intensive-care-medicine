package com.mskysoft.baseservice.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mskysoft.baseservice.entity.Role;
import com.mskysoft.baseservice.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
 * 角色表(Role)表控制层
 *
 * @author sunshixiong
 * @since 2019-10-21 14:28:28
 */
@Api(tags = "角色表")
@RestController
@RequestMapping("role")
public class RoleController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    @PostMapping("/menuAdd/{id}")
    @ApiOperation("角色添加权限")
    public R<Boolean> menuAdd(@PathVariable Integer id, @RequestBody List<Integer> list){

        return success(roleService.menuAdd(id,list));
    }
    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param role 查询实体
     * @return 所有数据
     */
    @GetMapping
    @ApiOperation("分页查询所有数据")
    public R<IPage<Role>> selectAll(Page<Role> page, Role role) {
        return success(this.roleService.page(page, new QueryWrapper<>(role)));
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
    public R<Role> selectOne(@PathVariable Integer id) {
        return success(this.roleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param role 实体对象
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping
    public R<Boolean> insert(@RequestBody Role role) {
        return success(this.roleService.save(role));
    }

    /**
     * 修改数据
     *
     * @param role 实体对象
     * @return 修改结果
     */
    @ApiOperation("修改数据")
    @PutMapping("{id}")
    public R<Boolean> update(@RequestBody Role role,@PathVariable Integer id) {
        role.setId(id);
        return success(this.roleService.updateById(role));
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
        return success(this.roleService.removeById(id));
    }
}
