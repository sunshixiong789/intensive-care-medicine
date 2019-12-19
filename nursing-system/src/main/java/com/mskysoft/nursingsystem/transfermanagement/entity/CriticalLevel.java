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
* 危重级别记录表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_critical_level")
@ApiModel(description = "危重级别记录表")
public class CriticalLevel {

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
    @ApiModelProperty("危重级别ID d_critical_level")
    private String criticalLevel;


    @ApiModelProperty("记录时间 ")
    private LocalDateTime operTime;

    @Column(nullable = false,length = 20)
    @ApiModelProperty("操作人员 ")
    @NotNull
    private String operName;

    @Column(nullable = false,length = 20)
    @ApiModelProperty("操作人员id ")
    @NotNull
    private String operId;


}
