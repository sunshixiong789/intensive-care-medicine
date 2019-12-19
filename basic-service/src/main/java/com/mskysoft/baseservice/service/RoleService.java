package com.mskysoft.baseservice.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.mskysoft.baseservice.entity.Role;

import java.util.List;

/**
 * 角色表(Role)表服务接口
 *
 * @author sunshixiong
 * @since 2019-10-21 14:28:28
 */
public interface RoleService extends IService<Role> {

  /**
   * 角色添加权限
   * @param id 角色id
   * @param list 菜单列表
   * @return 结果
   */
  public Boolean menuAdd(Integer id,  List<Integer> list);
}
