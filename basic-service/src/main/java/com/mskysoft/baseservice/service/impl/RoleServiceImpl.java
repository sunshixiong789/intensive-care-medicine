package com.mskysoft.baseservice.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.RoleDao;
import com.mskysoft.baseservice.entity.Role;
import com.mskysoft.baseservice.entity.RoleMenu;
import com.mskysoft.baseservice.service.RoleMenuService;
import com.mskysoft.baseservice.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 角色表(Role)表服务实现类
 *
 * @author sunshixiong
 * @since 2019-10-21 14:28:28
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleDao
        , Role> implements RoleService {

  @Resource
  private RoleMenuService roleMenuService;

  @Override
  public Boolean menuAdd(Integer id, List<Integer> list) {
    if (list.isEmpty()) {
      return false;
    }
    List<RoleMenu> userRoleList = list.stream()
            .map(integer -> new RoleMenu(null, id, integer))
            .collect(Collectors.toList());

    return roleMenuService.saveBatch(userRoleList);
  }
}
