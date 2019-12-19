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
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


/**
*
* 诊断记录表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_diagnosis")
@ApiModel(description = "诊断记录表")
public class Diagnosis {

    @Column(nullable = false,length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 32)
    @NotNull
    @ApiModelProperty("患者唯一标志 t_patient")
    private String pId;

    @Column(nullable = false,length = 100)
    @NotNull
    @ApiModelProperty("诊断名称 ")
    private String diagnosisName;


    @ApiModelProperty("诊断时间 ")
    private LocalDateTime diagnosisTime;

    @Column(length = 20)
    @ApiModelProperty("诊断医生 ")
    private String doctor;

    @Column(length = 20)
    @ApiModelProperty("诊断医生id ")
    private String doctorId;


}
