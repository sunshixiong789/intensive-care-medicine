package com.mskysoft.nursingsystem.transfermanagement.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


/**
*
* 患者出入科记录表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_patient_record")
@ApiModel(description = "患者出入科记录表")
public class PatientRecord {

    @Column(nullable = false,length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 32)
    @NotNull
    @NotBlank(message = "患者唯一标志不能为空")
    @ApiModelProperty("患者唯一标志 ")
    private String pId;


    @ApiModelProperty("入ICU时间 YYYY-MM-DD HH:MM")
    private LocalDateTime comeTime;

    @Column(length = 2)
    @ApiModelProperty("入ICU方式 字典")
    private String comeType;

    @Column(length = 2)
    @ApiModelProperty("运送方式 字典")
    private String transportWay;

    @Column(length = 50)
    @ApiModelProperty("非计划转入原因 ")
    private String unplanTransferReason;

    @Column(length = 10)
    @ApiModelProperty("转入科室 字典")
    private String transferDept;

    @Column(length = 20)
    @ApiModelProperty("操作人员 ")
    private String operName;

    @Column(length = 20)
    @ApiModelProperty("操作人员id ")
    private String operId;


    @ApiModelProperty("出ICU时间 YYYY-MM-DD HH:MM")
    private LocalDateTime outTime;

    @Column(length = 2)
    @ApiModelProperty("出ICU方式 字典")
    private String outTye;

    @Column(length = 10)
    @ApiModelProperty("转出科室 字典")
    private String transferOutDept;

    @Column(length = 20)
    @ApiModelProperty("操作人员 ")
    private String operOutName;

    @Column(length = 20)
    @ApiModelProperty("操作人员id ")
    private String operOutId;

    @Column(length = 100)
    @ApiModelProperty("出科诊断 ")
    private String outDiagnosis;

    @Column(length = 200)
    @ApiModelProperty("出科原因或备注 ")
    private String outReason;

    @Column(length = 20)
    @ApiModelProperty("主管医生 ")
    private String doctor;

    @Column(length = 20)
    @ApiModelProperty("主管护士 ")
    private String nurse;


}
