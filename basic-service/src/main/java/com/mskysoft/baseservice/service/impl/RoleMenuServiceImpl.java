package com.mskysoft.baseservice.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.RoleMenuDao;
import com.mskysoft.baseservice.entity.RoleMenu;
import com.mskysoft.baseservice.service.RoleMenuService;
import org.springframework.stereotype.Service;

/**
 * (RoleMenu)表服务实现类
 *
 * @author sunshixiong
 * @since 2019-10-24 17:29:26
 */
@Service("roleMenuService")
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuDao
, RoleMenu> implements RoleMenuService {

}