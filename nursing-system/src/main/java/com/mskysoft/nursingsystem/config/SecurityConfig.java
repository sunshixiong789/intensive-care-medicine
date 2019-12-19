package com.mskysoft.nursingsystem.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * security的单点登录等配置
 *
 * @author sunshixiong
 */
@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  public void configure(HttpSecurity http) throws Exception {
    http
            .authorizeRequests()
            .antMatchers("/login","/**").permitAll()
            .antMatchers(
                    "/v2/api-docs",
                    "/swagger-resources",
                    "/swagger-resources/**",
                    "/configuration/ui",
                    "/configuration/security",
                    "/doc.html/**",
                    "/doc.html",
                    "/webjars/bycdao-ui/**"
            ).permitAll()
            .anyRequest().authenticated()
            .and()
            .csrf().disable();//前后端分离项目关掉跨站请求伪造

  }
}
