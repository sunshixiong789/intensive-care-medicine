package com.mskysoft.baseservice.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.UserRoleDao;
import com.mskysoft.baseservice.entity.UserRole;
import com.mskysoft.baseservice.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * (UserRole)表服务实现类
 *
 * @author sunshixiong
 * @since 2019-10-22 15:14:28
 */
@Service("userRoleService")
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao
, UserRole> implements UserRoleService {

}