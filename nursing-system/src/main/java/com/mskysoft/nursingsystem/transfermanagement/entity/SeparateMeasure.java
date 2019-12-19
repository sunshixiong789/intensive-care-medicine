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
* 隔离措施记录表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_separate_measure")
@ApiModel(description = "隔离措施记录表")
public class SeparateMeasure {

    @Column(nullable = false,length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 32)
    @NotNull
    @ApiModelProperty("患者唯一标志 t_patient")
    private String pId;

    @Column(nullable = false,length = 2)
    @NotNull
    @ApiModelProperty("预防控制ID d_separate_measure")
    private String separateMeasure;


    @ApiModelProperty("记录时间 ")
    private LocalDateTime operTime;

    @Column(nullable = false,length = 20)
    @NotNull
    @ApiModelProperty("操作人员 ")
    private String operName;

    @Column(nullable = false,length = 20)
    @NotNull
    @ApiModelProperty("操作人员id ")
    private String operId;


}
