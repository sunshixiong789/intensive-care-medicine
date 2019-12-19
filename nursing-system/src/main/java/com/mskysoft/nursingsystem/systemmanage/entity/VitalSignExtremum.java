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
import java.time.LocalDateTime;


/**
*
* 生命体征极值配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_vital_sign_extremum")
@ApiModel(description = "生命体征极值配置表")
public class VitalSignExtremum {

    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 10)
    @ApiModelProperty("参数ID ")
    private String vitalId;

    @Column(length = 5)
    @ApiModelProperty("极值判断条件 ")
    private String conditionStatus;


    @ApiModelProperty("极值显示图标 ")
    @Column(name = "icon",columnDefinition = "longblob")
    private Byte icon;

    @Column(length = 10)
    @ApiModelProperty("极值显示值 ")
    private String display;


}
