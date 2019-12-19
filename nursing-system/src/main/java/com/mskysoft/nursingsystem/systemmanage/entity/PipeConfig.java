package com.mskysoft.nursingsystem.systemmanage.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
*
* 管路配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_pipe_config")
@ApiModel(description = "管路配置表")
public class PipeConfig {

    @Id
    @GeneratedValue(generator = "pipe_id")
    @GenericGenerator(name = "pipe_id", strategy = "uuid")
    @ApiModelProperty("管路唯一标志 代码生成主键pipe_id")
    private String pipeId;

    @Column(nullable = false,length = 30)
    @ApiModelProperty("名称 ")
    private String name;

    @Column(length = 30)
    @ApiModelProperty("长度 ")
    private String length;

    @Column(length = 30)
    @ApiModelProperty("材质 ")
    private String material;

    @Column(length = 30)
    @ApiModelProperty("厂家 ")
    private String factory;

    @Column(length = 30)
    @ApiModelProperty("型号 ")
    private String model;

    @Column(length = 30)
    @ApiModelProperty("置管位置 ")
    private String position;

    @Column(length = 4)
    @ApiModelProperty("置入天数 最长有效天数")
    private Integer validDays;

    @Column(length = 2)
    @ApiModelProperty("危险程度 0：高危1：中危2：低危")
    private String dangerLevel;

    @Column(length = 2)
    @ApiModelProperty("气囊压力 0：记录1：不记录")
    private String airbagPressure;

    @Column(length = 2)
    @ApiModelProperty("观察项 0：记录1：不记录")
    private String observeItem;

    @Column(length = 2)
    @ApiModelProperty("出量 0：记录1：不记录")
    private String output;

    @Column(length = 2)
    @ApiModelProperty("敷料 0：记录1：不记录")
    private String dressing;

    @Column(length = 2)
    @ApiModelProperty("刻度 0：记录1：不记录")
    private String scale;

    @Column(nullable = false,length = 32)
    @NotNull
    @ApiModelProperty("管路分类classify_id t_pipe_classify")
    private String pipeType;

    @Column(length = 2)
    @ApiModelProperty("默认显示 0：显示 1：不显示")
    private String display;

    @Column(nullable = false,length = 2)
    @NotNull
    @ApiModelProperty("状态 0：在用(默认)1：停用")
    private String status;


}
