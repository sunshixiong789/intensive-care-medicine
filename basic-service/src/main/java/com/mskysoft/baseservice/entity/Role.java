package com.mskysoft.baseservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


/**
 * 角色表(Role)实体类
 *
 * @author sunshixiong
 * @since 2019-10-21 14:31:50
 */
@Getter
@Setter
@NoArgsConstructor
@ApiModel(description = "角色表")
@TableName(value = "t_role")
public class Role {

  @TableId(type = IdType.AUTO)
  @ApiModelProperty("角色编码")
  private Integer id;

  @ApiModelProperty("角色名称")
  private String roleName;

  @ApiModelProperty("角色描述")
  private String remark;

  @ApiModelProperty("创建时间")
  private LocalDateTime createTime;

  @ApiModelProperty("数据更新时间")
  private LocalDateTime updateTime;

  @ApiModelProperty("所属系统Id")
  private Integer systemInfoId;

  @ApiModelProperty("所属系统名称")
  private String systemInfoName;


}
