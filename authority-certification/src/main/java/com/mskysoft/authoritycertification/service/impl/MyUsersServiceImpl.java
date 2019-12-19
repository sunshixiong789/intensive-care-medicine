package com.mskysoft.authoritycertification.service.impl;

import com.mskysoft.authoritycertification.dao.MyUsersDao;
import com.mskysoft.authoritycertification.service.MyUsersService;
import com.mskysoft.commons.entity.MyUserDetails;
import com.mskysoft.commons.entity.MyUsers;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 描述：
 * 用户信息表实现类
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/9/27-10:02
 */
@Component
@AllArgsConstructor
public class MyUsersServiceImpl implements UserDetailsService, MyUsersService {

  @Resource
  private MyUsersDao myUsersDao;
  @Autowired
  private PasswordEncoder passwordEncoder;

  @Override
  public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    MyUsers myUsers = myUsersDao.findByUserName(userName);
    List<SimpleGrantedAuthority> list = myUsersDao.findUserRole(userName)
            .stream()
            .map(SimpleGrantedAuthority::new)
            .collect(Collectors.toList());
    MyUserDetails userDetails = new MyUserDetails(userName,
            passwordEncoder.encode(myUsers.getPassWord()), list);
    userDetails.setUserId(myUsers.getUserId());
    userDetails.setRealName(myUsers.getRealName());
    userDetails.setGender(myUsers.getGender());
    userDetails.setBirthday(myUsers.getBirthday());
    userDetails.setPhone(myUsers.getPhone());
    userDetails.setMobilePhone(myUsers.getMobilePhone());
    userDetails.setPost(myUsers.getPost());
    userDetails.setCreateBy(myUsers.getCreateBy());
    userDetails.setTitle(myUsers.getTitle());
    userDetails.setPhoto(myUsers.getPhoto());
    userDetails.setHosId(myUsers.getHosId());
    userDetails.setHospital(myUsers.getHospital());
    userDetails.setDeptId(myUsers.getDeptId());
    userDetails.setDepartment(myUsers.getDepartment());
    return userDetails;
  }
}
