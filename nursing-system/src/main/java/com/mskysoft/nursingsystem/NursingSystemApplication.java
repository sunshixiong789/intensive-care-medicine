package com.mskysoft.nursingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;

/**
 * 主程序启动类
 *
 * @author sunshixiong
 */
@SpringBootApplication(exclude = {MultipartAutoConfiguration.class, JmxAutoConfiguration.class})
public class NursingSystemApplication {

  public static void main(String[] args) {
    SpringApplication.run(NursingSystemApplication.class, args);
  }

}
