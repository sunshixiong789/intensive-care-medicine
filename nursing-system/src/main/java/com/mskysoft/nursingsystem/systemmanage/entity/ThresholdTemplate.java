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
* 阈值模板配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_threshold_template")
@ApiModel(description = "阈值模板配置表")
public class ThresholdTemplate {

    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 20)
    @ApiModelProperty("模板名称 ")
    @NotNull
    private String name;

    @Column(nullable = false,length = 20)
    @ApiModelProperty("参数ID ")
    @NotNull
    private String paramId;

    @Column(length = 10)
    @ApiModelProperty("临界值低值 ")
    private String lowThreshold;

    @Column(length = 10)
    @ApiModelProperty("临界值高值 ")
    private String highThreshold;

    @Column(length = 10)
    @ApiModelProperty("超界值低值 ")
    private String lowBoundary;

    @Column(length = 10)
    @ApiModelProperty("超界值高值 ")
    private String highBoundary;


}
