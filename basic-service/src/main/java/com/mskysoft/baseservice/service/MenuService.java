package com.mskysoft.baseservice.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.mskysoft.baseservice.dto.MenuTree;
import com.mskysoft.baseservice.dto.TreeData;
import com.mskysoft.baseservice.entity.Menu;

import java.util.List;

/**
 * 菜单信息(Menu)表服务接口
 *
 * @author sunshixiong
 * @since 2019-10-18 16:46:41
 */
public interface MenuService extends IService<Menu> {

  /**
   * 通过系统id获取菜单
   * @param sysId 系统id
   * @return list
   */
  List<MenuTree>  getMenuTree(Integer sysId);

  /**
   * 获取系统id所有权限
   * @param sysId 系统id
   * @return list
   */
  List<TreeData> getMenuAndButtonTree(Integer sysId);
}
