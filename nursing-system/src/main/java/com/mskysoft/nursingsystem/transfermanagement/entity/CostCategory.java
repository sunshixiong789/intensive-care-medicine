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
* 费用类别表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "d_cost_category")
@ApiModel(description = "费用类别表")
public class CostCategory {

    @Column(nullable = false,length = 4)
    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 20)
    @ApiModelProperty("费用名称 ")
    @NotNull
    private String name;

    @Column(nullable = false,length = 2)
    @ApiModelProperty("类别 ？？？")
    @NotNull
    private String type;

    @Column(nullable = false,length = 10)
    @ApiModelProperty("代码 用于对照HIS")
    @NotNull
    private String code;


}
