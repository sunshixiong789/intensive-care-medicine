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
* 隔离措施配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "d_separate_measure")
@ApiModel(description = "隔离措施配置表")
public class SeparateMeasureConfig {

    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 20)
    @ApiModelProperty("预防控制名称 ")
    @NotNull
    private String name;

    @Column(nullable = false,length = 10)
    @ApiModelProperty("编码（唯一） ")
    @NotNull
    private String code;

    @Column(length = 20)
    @ApiModelProperty("英文名称 ")
    private String enName;

    @Column(length = 10)
    @ApiModelProperty("缩写 ")
    private String shortName;


    @ApiModelProperty("图标 ")
    @Column(name = "icon",columnDefinition = "longblob")
    private Byte icon;

    @Column(length = 50)
    @ApiModelProperty("说明 ")
    private String remark;


}
