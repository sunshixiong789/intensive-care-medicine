package com.mskysoft.baseservice.controller;


import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.mskysoft.baseservice.dto.MenuTree;
import com.mskysoft.baseservice.dto.TreeData;
import com.mskysoft.baseservice.entity.Menu;
import com.mskysoft.baseservice.service.MenuService;
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
 * 菜单信息(Menu)表控制层
 *
 * @author sunshixiong
 * @since 2019-10-18 16:46:41
 */
@Api(tags = "菜单信息")
@RestController
@NoArgsConstructor
@RequestMapping("menu")
public class MenuController extends ApiController {
  /**
   * 服务对象
   */
  @Resource
  private MenuService menuService;


  /**
   * 获取权限列表
   *
   * @param sysId 系统id
   * @return list
   */
  @ApiOperation("获取权限列表")
  @ApiImplicitParams({@ApiImplicitParam(name = "sysId", value = "sysId", dataType = "Integer")})
  @GetMapping("/role/{sysId}")
  public R<List<TreeData>> getMenuAndButtonTree(@PathVariable Integer sysId) {
    return success(menuService.getMenuAndButtonTree(sysId));
  }

  /**
   * 通过系统id获取菜单
   *
   * @param sysId 系统id
   * @return List
   */
  @ApiOperation("通过系统id获取菜单")
  @ApiImplicitParams({@ApiImplicitParam(name = "sysId", value = "sysId", dataType = "Integer")})
  @GetMapping("/sysId/{sysId}")
  public R<List<MenuTree>> getMenuTree(@PathVariable Integer sysId) {
    return success(menuService.getMenuTree(sysId));
  }

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @ApiOperation("通过主键查询单条数据")
  @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "id", dataType = "Integer")})
  @GetMapping("{id}")
  public R<Menu> selectOne(@PathVariable Integer id) {
    return success(this.menuService.getById(id));
  }

  /**
   * 新增数据
   *
   * @param menu 实体对象
   * @return 新增结果
   */
  @ApiOperation("新增数据")
  @PostMapping
  public R<Boolean> insert(@RequestBody Menu menu) {
    return success(this.menuService.save(menu));
  }

  /**
   * 修改数据
   *
   * @param menu 实体对象
   * @return 修改结果
   */
  @ApiOperation("修改数据")
  @PutMapping("{id}")
  public R<Boolean> update(@RequestBody Menu menu, @PathVariable Integer id) {
    menu.setId(id);
    return success(this.menuService.updateById(menu));
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
    return success(this.menuService.removeById(id));
  }
}
