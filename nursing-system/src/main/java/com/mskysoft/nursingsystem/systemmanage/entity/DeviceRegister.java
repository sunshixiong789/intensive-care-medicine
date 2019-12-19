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
* 设备登记配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_device_register")
@ApiModel(description = "设备登记配置表")
public class DeviceRegister {

    @Column(nullable = false,length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 32)
    @ApiModelProperty("设备唯一标志 ")
    @NotNull
    private String deviceId;

    @Column(nullable = false,length = 30)
    @ApiModelProperty("设备名称 ")
    @NotNull
    private String name;

    @Column(nullable = false,length = 32)
    @ApiModelProperty("设备编号 ")
    @NotNull
    private String serialNo;

    @Column(length = 32)
    @ApiModelProperty("设备核定分类ID ")
    private String classifyId;

    @Column(length = 4)
    @ApiModelProperty("核定时长 ")
    private Integer approvedDuration;

    @Column(length = 4)
    @ApiModelProperty("初始核定时长 ")
    private Integer initDuration;

    @Column(length = 4)
    @ApiModelProperty("核定次数 ")
    private Integer approvedFrequency;

    @Column(length = 4)
    @ApiModelProperty("初始核定次数 ")
    private Integer initFrequency;

    @Column(length = 20)
    @ApiModelProperty("默认绑定床位 ")
    private String bedNo;


}
