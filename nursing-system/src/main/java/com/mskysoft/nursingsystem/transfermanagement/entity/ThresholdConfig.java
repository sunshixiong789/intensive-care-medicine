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
* 患者阈值配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_threshold_config")
@ApiModel(description = "患者阈值配置表")
public class ThresholdConfig {

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
    @ApiModelProperty("临界值低值 ")
    private Double lowThreshold;

    @Column(length = 8)
    @ApiModelProperty("临界值高值 ")
    private Double highThreshold;

    @Column(length = 8)
    @ApiModelProperty("超界值低值 ")
    private Double lowBoundaryValue;

    @Column(length = 8)
    @ApiModelProperty("超界值高值 ")
    private Double highBoundaryValue;


}
