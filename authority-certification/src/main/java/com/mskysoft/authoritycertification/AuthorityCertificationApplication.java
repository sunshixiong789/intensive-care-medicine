package com.mskysoft.authoritycertification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;

/**
 * 授权系统启动类
 *
 * @author sunshixiong
 */
@SpringBootApplication(exclude = { JmxAutoConfiguration.class})
@EntityScan("com.mskysoft")
public class AuthorityCertificationApplication {

  public static void main(String[] args) {
    SpringApplication.run(AuthorityCertificationApplication.class, args);
  }

}
