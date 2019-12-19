package com.mskysoft.commons.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 公共的返回类
 *
 * @author sunshixiong
 * @date 2019/9/29 16:50
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "公共返回对象")
public class CommonResult<T> {
  @ApiModelProperty("数据状态")
  private boolean success;
  @ApiModelProperty("数据消息")
  private String message;
  @ApiModelProperty("数据内容")
  private T data;
  @ApiModelProperty("状态代码")
  private int code;
}
