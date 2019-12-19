package com.mskysoft.authoritycertification.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录控制器
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/22-10:55
 */
@Controller
@RequestMapping(value = "login")
public class LoginController {

  @GetMapping
  public String login() {
    return "/login";
  }
}
