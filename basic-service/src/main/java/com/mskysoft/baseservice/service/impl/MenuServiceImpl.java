package com.mskysoft.baseservice.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.mskysoft.baseservice.dao.MenuDao;
import com.mskysoft.baseservice.dto.MenuTree;
import com.mskysoft.baseservice.dto.TreeData;
import com.mskysoft.baseservice.entity.Menu;
import com.mskysoft.baseservice.service.MenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 菜单信息(Menu)表服务实现类
 *
 * @author sunshixiong
 * @since 2019-10-18 16:46:41
 */
@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuDao
        , Menu> implements MenuService {

  @Override
  public List<MenuTree> getMenuTree(Integer sysId) {
    List<Menu> list = this.list(new QueryWrapper<Menu>().lambda()
            .eq(Menu::getSystemInfoId, sysId)
            .eq(Menu::getButtonIf, "0")
            .orderByAsc(Menu::getSequence));

    return buildMenuTree(0, list);
  }

  @Override
  public List<TreeData> getMenuAndButtonTree(Integer sysId) {
    List<Menu> list = this.list(new QueryWrapper<Menu>().lambda()
            .eq(Menu::getSystemInfoId, sysId)
            .orderByAsc(Menu::getSequence));

    return buildTree(0, list);
  }

  public static List<MenuTree> buildMenuTree(Integer parentId, List<Menu> list) {
    List<MenuTree> treeList = Lists.newArrayList();
    for (Menu menu : list) {
      if (parentId.equals(menu.getParentId())) {
        MenuTree menuTree = new MenuTree();
        BeanUtils.copyProperties(menu, menuTree);
        menuTree.setChildren(buildMenuTree(menu.getId(), list));
        treeList.add(menuTree);
      }
    }
    return treeList;
  }

  public static List<TreeData> buildTree(Integer parentId, List<Menu> list) {
    List<TreeData> treeList = Lists.newArrayList();
    for (Menu menu : list) {
      if (parentId.equals(menu.getParentId())) {
        TreeData menuTree = new TreeData();
        menuTree.setKey(menu.getId().toString());
        menuTree.setTitle(menu.getName());
        menuTree.setIsLeaf("0".equals(menu.getChildrenNode()));
        menuTree.setChildren(buildTree(menu.getId(), list));
        treeList.add(menuTree);
      }
    }
    return treeList;
  }
}

