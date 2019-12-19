package com.mskysoft.baseservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;

/**
 * 基础服务模块——主程序启动类
 *
 * @author sunshixiong
 */
@SpringBootApplication(exclude = {MultipartAutoConfiguration.class, JmxAutoConfiguration.class})
@MapperScan("com.mskysoft.baseservice.dao")
public class BaseServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(BaseServiceApplication.class, args);
  }

}
