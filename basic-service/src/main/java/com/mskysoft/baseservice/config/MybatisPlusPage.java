package com.mskysoft.baseservice.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：
 * mybatis-plus分页配置
 *
 * @author sunshixiong
 * @date 2019/9/24-17:17
 */
@Configuration
public class MybatisPlusPage {

  /**
   * 分页插件
   */
  @Bean
  public PaginationInterceptor paginationInterceptor() {
    return new PaginationInterceptor();
  }
}
