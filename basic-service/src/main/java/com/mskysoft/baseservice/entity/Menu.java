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
 * 菜单信息(Menu)实体类
 *
 * @author sunshixiong
 * @since 2019-10-18 16:46:41
 */
@Getter
@Setter
@NoArgsConstructor
@ApiModel(description = "菜单信息")
@TableName(value = "t_menu")
public class Menu {


  @TableId(type = IdType.AUTO)
  @ApiModelProperty("主键")
  private Integer id;

  @ApiModelProperty("名称")
  private String name;

  @ApiModelProperty("父节点id")
  private Integer parentId;

  @ApiModelProperty("父节点名称")
  private String parentName;

  @ApiModelProperty("所属系统id")
  private Integer systemInfoId;

  @ApiModelProperty("所属系统名称")
  private String systemInfoName;

  @ApiModelProperty("菜单图标")
  private String iconType;

  @ApiModelProperty("菜单地址")
  private String path;

  @ApiModelProperty("权限")
  private String role;

  @ApiModelProperty("排序")
  private String sequence;

  @ApiModelProperty("是否按钮（1：是，0：否）")
  private String buttonIf;

  @ApiModelProperty("是否禁用（1:禁用，0：启用）")
  private String status;

  @ApiModelProperty("是否有子节点（1:有，0：无）")
  private String childrenNode;


}
