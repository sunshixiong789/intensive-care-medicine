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
* 危急值项目配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "d_critical_item")
@ApiModel(description = "危急值项目配置表")
public class CriticalItem {

    @Column(nullable = false,length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 30)
    @ApiModelProperty("项目分类 ")
    @NotNull
    private String itemClassify;

    @Column(nullable = false,length = 30)
    @ApiModelProperty("项目名称 ")
    @NotNull
    private String itemName;

    @Column(nullable = false,length = 15)
    @ApiModelProperty("项目编码 ")
    @NotNull
    private String itemCode;

    @Column(length = 50)
    @ApiModelProperty("样本类型 ")
    private String sampleType;

    @Column(length = 50)
    @ApiModelProperty("正常值范围 ")
    private String normalRange;

    @Column(length = 2)
    @ApiModelProperty("性别 ")
    private String gender;

    @Column(length = 10)
    @ApiModelProperty("年龄单位 ")
    private String ageUnit;

    @Column(length = 4)
    @ApiModelProperty("年龄下限 ")
    private Integer ageLow;

    @Column(length = 4)
    @ApiModelProperty("年龄上限 ")
    private Integer ageHigh;

    @Column(length = 2)
    @ApiModelProperty("值类型 ")
    private String valueType;

    @Column(length = 8)
    @ApiModelProperty("值下限 ")
    private Double lowestValue;

    @Column(length = 8)
    @ApiModelProperty("值上限 ")
    private Double highestValue;

    @Column(length = 20)
    @ApiModelProperty("文本值 ")
    private String textValue;

    @Column(length = 30)
    @ApiModelProperty("危急值范围 ")
    private String criticalRange;

    @Column(length = 15)
    @ApiModelProperty("单位 ")
    private String unit;

    @Column(length = 50)
    @ApiModelProperty("警告 ")
    private String warn;

    @Column(length = 50)
    @ApiModelProperty("说明 ")
    private String remark;


}
