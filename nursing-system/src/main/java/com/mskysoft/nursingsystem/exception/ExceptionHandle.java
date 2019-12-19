package com.mskysoft.nursingsystem.exception;

import com.mskysoft.commons.exception.CommonException;
import com.mskysoft.commons.result.CommonResult;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常统一处理
 *
 * @author sunshixiong
 * @date 2018/2/2 10:13
 */
@RestControllerAdvice
public class ExceptionHandle {

  @ExceptionHandler
  @ResponseBody
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public CommonResult handle(Exception e) {
    if (e instanceof CommonException) {
      CommonException exception = (CommonException) e;
      return new CommonResult<>(false, exception.getMessage()
              , "", exception.getCode().value());
    }
    if (e instanceof BindingResult) {
      /**
       * 添加处理数据校验的异常处理
       * @author sunshixong
       */
      StringBuilder message = new StringBuilder();
      BindingResult bindingResult = (BindingResult) e;
      bindingResult.getAllErrors().forEach((ObjectError error) -> {
        message.append(error.getDefaultMessage());
        message.append(",");
      });
      return new CommonResult<>(false, message.toString()
              , "", HttpStatus.INTERNAL_SERVER_ERROR.value());
    }
    return new CommonResult<>(false, e.getMessage()
            , "", HttpStatus.INTERNAL_SERVER_ERROR.value());
  }
}
