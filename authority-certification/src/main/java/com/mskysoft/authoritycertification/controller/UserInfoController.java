package com.mskysoft.authoritycertification.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * 描述：
 * 用户信息
 *
 * @author sunshixiong
 * @date 2019/7/16-13:55
 */
@RestController
@RequestMapping("/user-info")
public class UserInfoController {

  @GetMapping
  public Principal user(Authentication authentication) {
    return authentication;
  }
}
