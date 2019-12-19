package com.mskysoft.baseservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.UserDao;
import com.mskysoft.baseservice.entity.UserRole;
import com.mskysoft.baseservice.service.UserRoleService;
import com.mskysoft.baseservice.service.UserService;
import com.mskysoft.commons.entity.MyUsers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户基本信息表(User)表服务实现类
 *
 * @author daiminghang
 * @since 2019-10-15 17:16:22
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, MyUsers> implements UserService {

  @Resource
  private UserRoleService userRoleService;

  @Override
  public Boolean roleAdd(Integer id, List<Integer> list) {
    if (list.isEmpty()) {
      return false;
    }
    List<UserRole> userRoleList = list.stream()
            .map(integer -> new UserRole(null, id, integer))
            .collect(Collectors.toList());

    return userRoleService.saveBatch(userRoleList);
  }
}
