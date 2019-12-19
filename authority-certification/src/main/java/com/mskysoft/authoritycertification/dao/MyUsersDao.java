package com.mskysoft.authoritycertification.dao;

import com.mskysoft.commons.entity.MyUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * 描述：
 * 用户基础数据
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/9/26-17:19
 */
public interface MyUsersDao extends JpaRepository<MyUsers, Integer> {

  /**
   * 通过用户名称查找
   *
   * @param userName 用户姓名
   * @return MyUsers
   */
  MyUsers findByUserName(String userName);

  /**
   * 获取用户权限
   * @param userName 用户名
   * @return list
   */
  @Query(value = "select distinct m.role from t_role r " +
          "left join m_user_role ur on (r.id = ur.role_id) " +
          "left join t_user u on (u.user_id = ur.user_id) " +
          "left join m_role_menu rm on (rm.role_id = r.id) " +
          "left join t_menu m on (m.id = rm.menu_id) where u.user_name = ?1 " +
          "and m.role is not null and m.role <> ''", nativeQuery = true)
  List<String> findUserRole(String userName);

}
