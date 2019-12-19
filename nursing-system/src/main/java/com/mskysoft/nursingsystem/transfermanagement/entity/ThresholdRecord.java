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
* 患者阈值记录表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_threshold_record")
@ApiModel(description = "患者阈值记录表")
public class ThresholdRecord {

    @Column(nullable = false,length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 32)
    @NotNull
    @ApiModelProperty("患者唯一标志 ")
    private String pId;

    @Column(length = 10)
    @ApiModelProperty("参数ID ")
    private String paramId;

    @Column(length = 8)
    @ApiModelProperty("生命体征值 ")
    private Double vitalSignValue;

    @Column(length = 2)
    @ApiModelProperty("阈值标志 ")
    private String thresholdFlag;


    @ApiModelProperty("发生时间 ")
    private LocalDateTime occurTime;

    @Column(length = 2)
    @ApiModelProperty("处理标志 ")
    private String handleFlag;


    @ApiModelProperty("处理时间 ")
    private LocalDateTime handleTime;

    @Column(length = 20)
    @ApiModelProperty("操作人员 ")
    private String operName;

    @Column(length = 20)
    @ApiModelProperty("操作人员id ")
    private String operId;


}
