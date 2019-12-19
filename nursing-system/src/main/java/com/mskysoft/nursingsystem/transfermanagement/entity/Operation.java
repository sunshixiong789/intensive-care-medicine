package com.mskysoft.nursingsystem.transfermanagement.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;


/**
 * 手术信息表
 *
 * @author sunshixiong
 * @since 2019-11-07 17:09:00
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_operation")
@ApiModel(description = "手术信息表")
public class Operation {

  @Column(nullable = false, length = 32)
  @ApiModelProperty("手术oper_id，数据唯一标识 每次手术生成一个，需代码生成主键oper_id")
  @Id
  @GeneratedValue(generator = "oper_id")
  @GenericGenerator(name = "oper_id", strategy = "uuid")
  private String operId;

  @Column(nullable = false, length = 32)
  @NotBlank(message = "患者Id不能为空")
  @ApiModelProperty("患者唯一标志 ")
  private String pId;

  @Column(length = 50)
  @ApiModelProperty("手术名称 字典？？？")
  private String operName;

  @Column(length = 2)
  @ApiModelProperty("手术类型 字典,0：择期,1：急诊")
  private String operType;

  @Column(length = 10)
  @ApiModelProperty("申请科室 字典")
  private String applyDept;

  @Column(length = 2)
  @ApiModelProperty("手术等级 字典")
  private String operGrade;

  @Column(length = 2)
  @ApiModelProperty("切口等级 字典")
  private String incisionLevel;

  @Column(length = 10)
  @ApiModelProperty("手术科室 字典")
  private String operDept;

  @Column(length = 20)
  @ApiModelProperty("主刀医生 ")
  private String doctor;

  @Column(length = 20)
  @ApiModelProperty("主刀医生id ")
  private String doctorId;

  @Column(length = 2)
  @ApiModelProperty("麻醉方式 字典")
  private String hocusWay;


  @ApiModelProperty("手术开始时间 ")
  private LocalDateTime startTime;


  @ApiModelProperty("手术结束时间 ")
  private LocalDateTime overTime;


  @ApiModelProperty("苏醒结束时间 ")
  private LocalDateTime wakeTime;


}
