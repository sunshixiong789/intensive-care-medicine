package com.mskysoft.baseservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mskysoft.commons.entity.MyUsers;

import java.util.List;

/**
 * 用户基本信息表(User)表服务接口
 *
 * @author daiminghang
 * @since 2019-10-15 17:16:22
 */
public interface UserService extends IService<MyUsers> {

  /**
   * 给用户添加权限
   * @param id id
   * @param list list
   * @return boolean
   */
  Boolean roleAdd(Integer id, List<Integer> list);

}
