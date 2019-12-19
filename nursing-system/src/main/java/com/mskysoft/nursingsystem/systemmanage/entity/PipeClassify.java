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
* 管路分类表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "d_pipe_classify")
@ApiModel(description = "管路分类表 ")
public class PipeClassify {

    @Column(nullable = false,length = 32)
    @ApiModelProperty("管路分类唯一标志 代码生成主键classify_id")
    @Id
    @GeneratedValue(generator = "classify_id")
    @GenericGenerator(name = "classify_id", strategy = "uuid")
    private String classifyId;

    @Column(nullable = false,length = 20)
    @ApiModelProperty("名称 ")
    @NotNull
    private String name;

    @Column(length = 10)
    @ApiModelProperty("简称 ")
    private String shortName;

    @Column(nullable = false,length = 2)
    @ApiModelProperty("状态 0：在用(默认)1：停用")
    @NotNull
    private String status;

    @Column(length = 50)
    @ApiModelProperty("说明 ")
    private String remark;


}
