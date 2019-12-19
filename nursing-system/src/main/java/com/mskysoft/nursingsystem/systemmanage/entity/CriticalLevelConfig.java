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


/**
*
* 危重级别配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "d_critical_level_config")
@ApiModel(description = "危重级别配置表")
public class CriticalLevelConfig {

    @Column(length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 20)
    @ApiModelProperty("危重级别名称 ")
    private String name;

    @Column(length = 10)
    @ApiModelProperty("编码 ")
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
