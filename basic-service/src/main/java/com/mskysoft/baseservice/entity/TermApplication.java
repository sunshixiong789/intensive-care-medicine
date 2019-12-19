package com.mskysoft.baseservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * 术语应用(TermApplication)实体类
 *
 * @author sunshixiong
 * @since 2019-10-09 14:24:07
 */
@Getter
@Setter
@NoArgsConstructor
@ApiModel(description = "术语应用")
@TableName(value = "d_term_application")
public class TermApplication {


  @TableId(type = IdType.AUTO)
  private Integer id;

  @ApiModelProperty("临床术语id")
  private Integer clinicalTermsId;

  @ApiModelProperty("临床术语名称")
  private String clinicalTermsName;

  @ApiModelProperty("临床观测值")
  private String value;

  @ApiModelProperty("编码")
  private String code;

  @ApiModelProperty("序号")
  private Integer order;

  @ApiModelProperty("默认标识")
  private String identification;


}
