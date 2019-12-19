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
* 敷料配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "d_dressing")
@ApiModel(description = "敷料配置表 ")
public class Dressing {

    @Column(nullable = false,length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 50)
    @ApiModelProperty("敷料名称 ")
    @NotNull
    private String name;

    @Column(length = 10)
    @ApiModelProperty("简称 ")
    private String shortName;

    @Column(length = 4)
    @ApiModelProperty("敷料有效期天数 ")
    private Integer validDay;

    @Column(length = 50)
    @ApiModelProperty("说明 ")
    private String remark;


}
