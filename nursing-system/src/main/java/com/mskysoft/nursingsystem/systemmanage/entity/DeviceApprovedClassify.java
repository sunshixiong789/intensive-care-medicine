package com.mskysoft.nursingsystem.systemmanage.entity;

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
* 设备核定分类表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_device_approved_classify")
@ApiModel(description = "设备核定分类表")
public class DeviceApprovedClassify {

    @Column(nullable = false,length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 32)
    @ApiModelProperty("设备唯一标志 ")
    @NotNull
    private String deviceId;

    @Column(nullable = false,length = 20)
    @ApiModelProperty("设备名称 ")
    @NotNull
    private String name;

    @Column(length = 10)
    @ApiModelProperty("设备简称 ")
    private String shortName;

    @Column(length = 10)
    @ApiModelProperty("设备分类 ")
    private String classify;

    @Column(length = 30)
    @ApiModelProperty("品牌 ")
    private String brand;

    @Column(length = 30)
    @ApiModelProperty("型号 ")
    private String model;

    @Column(length = 30)
    @ApiModelProperty("模式 ")
    private String mode;


}
