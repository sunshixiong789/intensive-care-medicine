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


/**
*
* 带药信息
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_take_medicine")
@ApiModel(description = "带药信息")
public class TakeMedicine {

    @Column(nullable = false,length = 12)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 32)
    @NotNull
    @ApiModelProperty("患者唯一标志 ")
    private String pId;

    @Column(nullable = false,length = 32)
    @NotNull
    @ApiModelProperty("手术唯一标志 ")
    private String operId;

    @Column(length = 50)
    @ApiModelProperty("药名名称 字典")
    private String drug;

    @Column(length = 10)
    @ApiModelProperty("剂量值 ")
    private String doseValue;

    @Column(length = 2)
    @ApiModelProperty("剂量单位 字典")
    private String doseUnit;

    @Column(length = 20)
    @ApiModelProperty("规格")
    private String format;

    @Column(length = 2)
    @ApiModelProperty("用药途径 字典")
    private String medicationWay;

    @Column(length = 2)
    @ApiModelProperty("用法 字典")
    private String usage;

    @Column(length = 2)
    @ApiModelProperty("带药类型 字典，0：入科带药1：术后带药")
    private String drugType;


}
