package com.mskysoft.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * 自定义个人信息实现
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/10/23-17:11
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MyUserDetails extends User {

  private static final long serialVersionUID = -1784271158556351854L;
  private Integer userId;

  private String realName;

  private String gender;

  private LocalDateTime birthday;

  private String phone;

  private String mobilePhone;

  private String post;

  private String createBy;

  private String title;

  private Byte photo;

  private Integer hosId;

  private String hospital;

  private Integer deptId;

  private String department;

  public MyUserDetails(String username, String password
          , Collection<? extends GrantedAuthority> authorities) {
    super(username, password, authorities);
  }

  public MyUserDetails(String username, String password, boolean enabled
          , boolean accountNonExpired, boolean credentialsNonExpired
          , boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
    super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
  }
}
