package com.mskysoft.authoritycertification.properties;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 描述：
 * client（客户端）配置
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/9/26-15:05
 */
@Component
@Data
@NoArgsConstructor
@ConfigurationProperties(prefix = "myclient")
public class MyClientProperties {
  /**
   * 客户端
   */
  private String client;
  /**
   * 客户端密码
   */
  private String secret;
  /**
   * token刷新时间
   */
  private String refreshTime;
  /**
   * jwt加密秘钥
   */
  private String jwtKey;
  /**
   * 重定向地址
   */
  private String[] redirectUris;

}
