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
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 患者信息表(Patient)实体类
 *
 * @author sunshixiong
 * @since 2019-11-07 14:47:37
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "t_patient")
@ApiModel(description = "患者信息表")
public class Patient implements Serializable {

  private static final long serialVersionUID = 6041033601355858766L;

  @Id
  @GeneratedValue(generator = "id")
  @GenericGenerator(name = "id", strategy = "uuid")
  private String id;

  @Column(nullable = false,length = 30)
  @NotNull
  @ApiModelProperty("姓名")
  private String name;

  @Column(length = 20)
  @ApiModelProperty("床位编码")
  private String bedNo;

  @Column(length = 2)
  @ApiModelProperty("性别")
  private String gender;

  @ApiModelProperty("出生日期")
  private LocalDateTime birthday;

  @ApiModelProperty("证件类型（字典，0：身份证，1：护照）")
  private String certType;

  @ApiModelProperty("证件号")
  private String certNo;

  @ApiModelProperty("患者状态（字典，0：在科，1：出科）")
  private String status;

  @ApiModelProperty("科室")
  private String dept;

  @ApiModelProperty("医院")
  private String hos;

  @ApiModelProperty("住院号")
  private String inhospitalNo;

  @ApiModelProperty("登记号")
  private String registerNo;

  @ApiModelProperty("病历号")
  private String caseNo;

  @ApiModelProperty("医疗卡号")
  private String medicalCardNo;

  @ApiModelProperty("患者id号")
  private String hisPId;

  @ApiModelProperty("区域医疗编号")
  private String regionMedicalNo;

  @ApiModelProperty("就诊次数")
  private String visitNo;

  @ApiModelProperty("入院时间")
  private LocalDateTime hospitalTime;

  @ApiModelProperty("入院诊断")
  private String hospitalDiagnosis;

  @ApiModelProperty("本次入科时间")
  private LocalDateTime icuTime;

  @ApiModelProperty("入科诊断")
  private String icuDiagnosis;

  @ApiModelProperty("费用类型")
  private String costType;

  @ApiModelProperty("abo血型")
  private String aboBloodType;

  @ApiModelProperty("rh血型")
  private String rhBloodType;

  @ApiModelProperty("既往病史")
  private String medcialHospital;

  @ApiModelProperty("遗传病史")
  private String geneticHistory;

  @ApiModelProperty("过敏史")
  private String allergies;

  @ApiModelProperty("过敏源")
  private String allergen;

  @ApiModelProperty("过敏药物")
  private String allergyDrug;

  @ApiModelProperty("地址")
  private String address;

  @ApiModelProperty("联系人姓名")
  private String contactName;

  @ApiModelProperty("联系人电话")
  private String contactPhone;

  @ApiModelProperty("联系人关系")
  private String contactRelation;

  @ApiModelProperty("联系人地址")
  private String contactAddress;

  @ApiModelProperty("出生地")
  private String birthPlace;

  @ApiModelProperty("国家")
  private String country;

  @ApiModelProperty("民族")
  private String nation;

  @ApiModelProperty("工作单位")
  private String company;

  @ApiModelProperty("工作单位地址")
  private String companyAddress;

  @ApiModelProperty("电话")
  private String phone;

  @ApiModelProperty("主诉")
  private String chiefComplaint;


}
