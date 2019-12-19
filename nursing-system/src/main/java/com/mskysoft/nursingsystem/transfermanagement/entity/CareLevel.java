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
* 护理级别记录表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_care_level")
@ApiModel(description = "护理级别记录表")
public class CareLevel {

    @Column(nullable = false,length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 32)
    @ApiModelProperty("患者唯一标志 t_patient")
    @NotNull
    private String pId;

    @Column(nullable = false,length = 2)
    @NotNull
    @ApiModelProperty("护理级别ID 1 特级护理（默认）2 一级护理1 特级护理（默认）2 一级护理 3 二级护理 4 三级护理")
    private String careLevel;


    @ApiModelProperty("记录时间 ")
    private LocalDateTime operTime;

    @Column(nullable = false,length = 20)
    @NotNull
    @ApiModelProperty("操作人员 ")
    private String operName;


}
