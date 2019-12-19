package com.mskysoft.baseservice.interceptor;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 对返回格式做统一拦截
 *
 * @author sunshixiong
 */
/*@RestControllerAdvice*/
/*public class ResponseResultHandler implements ResponseBodyAdvice<Object> {


  @Override
  public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
    return true;
  }

  @Override
  public Object beforeBodyWrite(Object body, MethodParameter returnType
          , MediaType selectedContentType
          , Class<? extends HttpMessageConverter<?>> selectedConverterType
          , ServerHttpRequest request
          , ServerHttpResponse response) {

    return null;
  }
}*/
