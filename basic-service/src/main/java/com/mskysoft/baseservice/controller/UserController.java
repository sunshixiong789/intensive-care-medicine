package com.mskysoft.baseservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mskysoft.baseservice.service.UserService;
import com.mskysoft.commons.entity.MyUsers;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户基本信息表(User)表控制层
 *
 * @author daiminghang
 * @since 2019-10-15 17:16:22
 */
@Api(tags = "用户基本信息表")
@NoArgsConstructor
@RestController
@RequestMapping("user")
public class UserController extends ApiController {

    // 初始密码
    private static final String Initial_Cipher = "123456";

    /**
     * 服务对象
     */
    @Resource
    private UserService userService;


    @PostMapping("roleAdd/{id}")
    @ApiOperation("给用户添加权限")
    public R<Boolean> roleAdd(@PathVariable Integer id, @RequestBody List<Integer> list) {
        return success(userService.roleAdd(id, list));
    }

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param user 查询实体
     * @return 所有数据
     */
    @GetMapping
    @ApiOperation("分页查询所有数据")
    public R<IPage<MyUsers>> selectAll(Page<MyUsers> page, MyUsers user) {
        return success(this.userService.page(page, new QueryWrapper<>(user)));
    }

    /**
     * 根据姓名进行模糊查询
     *
     * @param page     分页对象
     * @param realName 姓名
     * @return 查询数据
     */
    @GetMapping("/name")
    @ApiOperation("根据姓名进行模糊查询")
    @ApiImplicitParams({@ApiImplicitParam(name = "realName", value = "姓名")})
    public R<IPage<MyUsers>> selectByName(Page<MyUsers> page, String realName) {
        QueryWrapper<MyUsers> q = new QueryWrapper<>();
        q.lambda().like(MyUsers::getRealName, realName);
        return success(this.userService.page(page, q));
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
    public R<MyUsers> selectOne(@PathVariable Integer id) {
        return success(this.userService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param user 实体对象
     * @return 新增结果
     */
    @PostMapping
    @ApiOperation("新增数据")
    public R<Boolean> insert(@RequestBody MyUsers user) {
        return success(this.userService.save(user));
    }

    /**
     * 修改数据
     *
     * @param user 实体对象
     * @return 修改结果
     */
    @PutMapping
    @ApiOperation("修改数据")
    public R<Boolean> update(@RequestBody MyUsers user) {
        return success(this.userService.updateById(user));
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
        return success(this.userService.removeById(id));
    }

    /**
     * 根据科室筛选人员信息
     *
     * @param page   分页数据
     * @param deptId 科室id
     * @return 查询结果
     */
    @GetMapping(value = "/deptId")
    @ApiOperation("根据科室筛选人员信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "deptId", value = "科室id")})
    public R<IPage<MyUsers>> selectByDeptId(Page<MyUsers> page, Integer deptId) {
        // 查询条件
        QueryWrapper<MyUsers> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(MyUsers::getDeptId, deptId);
        return success(userService.page(page, queryWrapper));
    }

    /**
     * 获取初始密码
     *
     * @return 初始密码
     */
    @GetMapping(value = "/preliminaryPassword")
    @ApiOperation("获取初始密码")
    public R<String> findPreliminaryPassword() {
        return success(Initial_Cipher);
    }

    /**
     * 根据id值修改用户名和密码
     *
     * @param id       id
     * @param userName 用户名
     * @param passWord 密码
     * @return 修改结果
     */
    @PutMapping(value = "/password")
    @ApiOperation("根据id值修改用户名和密码")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "id"),
            @ApiImplicitParam(name = "userName", value = "用户名"),
            @ApiImplicitParam(name = "passWord", value = "密码")})
    public R<Boolean> updatePassword(Integer id, String userName, String passWord) {
        MyUsers user = new MyUsers();
        user.setUserId(id);
        user.setUserName(userName);
        user.setPassWord(passWord);
        return success(this.userService.updateById(user));
    }
}
