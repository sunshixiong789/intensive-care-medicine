package com.mskysoft.authoritycertification.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author sunshixiong
 * @date 2019/7/6 10:11
 */
@EnableWebSecurity
@Configuration
@Order(1)
@EnableGlobalMethodSecurity(securedEnabled = true, jsr250Enabled = true, prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  /**
   * 配置这个bean会在做AuthorizationServerConfigurer配置的时候使用
   *
   * @throws Exception no
   */
  @Bean
  @Override
  public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
            .formLogin()
            .loginPage("/login")
            .and()
            .logout().logoutUrl("/system-logout").logoutSuccessUrl("/login")
            .invalidateHttpSession(true).deleteCookies("JSESSIONID")
            .and()
            .authorizeRequests()
            .antMatchers("/**/*.js", "/**/*.css", "/**/*.png", "/**/*.jpg", "/**/fonts/**").permitAll()
            .antMatchers("/index/**", "/assets/**", "/static/**").permitAll()
            .antMatchers("/login", "/logout", "/oauth/authorize", "/oauth/token", "/oauth/**", "/user/name").permitAll()
            .anyRequest().authenticated()
            .and().csrf().disable();
  }
}
