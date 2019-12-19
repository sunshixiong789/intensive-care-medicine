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
 * 系统信息表(SystemInfo)实体类
 *
 * @author sunshixiong
 * @since 2019-10-18 16:26:11
 */
@Getter
@Setter
@NoArgsConstructor
@ApiModel(description = "系统信息表")
@TableName(value = "t_system_info")
public class SystemInfo {

  @TableId(type = IdType.AUTO)
  @ApiModelProperty("id")
  private Integer id;

  @ApiModelProperty("系统编码")
  private String systemCode;

  @ApiModelProperty("系统名称")
  private String systemName;

  @ApiModelProperty("系统简称")
  private String systemNameShort;

  @ApiModelProperty("系统地址")
  private String systemUrl;

  @ApiModelProperty("别名")
  private String alias;

  @ApiModelProperty("系统状态")
  private String status;


}
