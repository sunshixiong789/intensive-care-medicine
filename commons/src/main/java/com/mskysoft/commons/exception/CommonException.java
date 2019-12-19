package com.mskysoft.commons.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * @author sunshixiong
 * @date 2018/2/2 10:28
 */
@Getter
@Setter
@NoArgsConstructor
public class CommonException extends RuntimeException {

  /**
   * http 状态码
   */
  private HttpStatus code;

  public CommonException(HttpStatus code, String message) {
    super(message);
    this.code = code;
  }

}
