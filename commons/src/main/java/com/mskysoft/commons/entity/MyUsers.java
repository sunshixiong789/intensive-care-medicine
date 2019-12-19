package com.mskysoft.commons.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * 用户基本信息表(MyUsers)实体类
 *
 * @author sunshixiong
 * @since 2019-09-26 17:59:06
 */
@Entity
@Getter
@Setter
@Table(name = "t_user")
@TableName(value = "t_user")
@ApiModel(description = "用户基本信息表")
public class MyUsers {

  @Id
  @TableId(type = IdType.AUTO)
  
  @ApiModelProperty("用户ID")
  private Integer userId;

  @ApiModelProperty("用户姓名")
  @Column(unique = true)
  private String userName;

  @ApiModelProperty("密码")
  private String passWord;

  @ApiModelProperty("真实姓名")
  private String realName;

  @ApiModelProperty("性别")
  private String gender;

  @ApiModelProperty("出生日期")
  private LocalDateTime birthday;

  @ApiModelProperty("固定电话")
  private String phone;

  @ApiModelProperty("移动电话")
  private String mobilePhone;

  @ApiModelProperty("职务")
  private String post;

  @ApiModelProperty("用户状态（D：DELETE  U：Using）")
  private String status;

  @ApiModelProperty("用户来源（H：HIS  C：CIS   R：iRescues  T：TeleMed）")
  private String createBy;

  @ApiModelProperty("用户类型（C：FACenter  H：FAHospital  L：FALocale " +
          "  D：DoctorStation  N：Not for iRescues 类型可组合CH：FACenter和FAHospital 以此类推'）")
  private String userType;

  @ApiModelProperty("职称")
  private String title;

  @ApiModelProperty("身份证号码")
  private String identityCard;

  @ApiModelProperty("头像图片")
  @Column(name = "photo",columnDefinition = "longblob")
  private Byte photo;

  @ApiModelProperty("标识符")
  private String tag;

  @ApiModelProperty("所属医院id")
  private Integer hosId;

  @ApiModelProperty("所属医院")
  private String hospital;

  @ApiModelProperty("所属科室id")
  private Integer deptId;

  @ApiModelProperty("所属科室")
  private String department;

  @ApiModelProperty("国籍")
  private String nationality;

  @ApiModelProperty("资格证书编码")
  private String qualificationCertificate;

  @ApiModelProperty("主要执业机构名")
  private String organizationName;

  @ApiModelProperty("职业证书编码")
  private String vocationalCertificate;

  @ApiModelProperty("注册业名称")
  private String registryName;

  @ApiModelProperty("注册批注日期")
  private LocalDateTime registryTime;

  @ApiModelProperty("执业类别名称")
  private String practiceType;

  @ApiModelProperty("执业范围名称")
  private String practiceRange;

  @ApiModelProperty("地址")
  private String address;
}

