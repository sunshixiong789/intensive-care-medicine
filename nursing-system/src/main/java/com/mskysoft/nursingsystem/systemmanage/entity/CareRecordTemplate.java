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
* 护理记录模板配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_care_record_template")
@ApiModel(description = "护理记录模板配置表")
public class CareRecordTemplate {

    @Column(nullable = false,length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 100)
    @ApiModelProperty("名称 ")
    private String name;

    @Column(length = 1000)
    @ApiModelProperty("内容 ")
    private String content;

    @Column(length = 2)
    @ApiModelProperty("类型 ")
    private String type;

    @Column(length = 2)
    @ApiModelProperty("状态 ")
    private String status;

    @Column(length = 20)
    @ApiModelProperty("快捷键代码 ")
    private String shortcutCode;


}
