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
* 交班提醒模板配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_shift_reminder_template")
@ApiModel(description = "交班提醒模板配置表")
public class ShiftReminderTemplate {

    @ApiModelProperty("自增主键 ")
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false,length = 100)
    @ApiModelProperty("名称 ")
    @NotNull
    private String name;

    @Column(length = 2)
    @ApiModelProperty("类型 ")
    private String type;

    @Column(length = 2)
    @ApiModelProperty("状态 ")
    private String status;

    @Column(nullable = false,length = 100)
    @ApiModelProperty("描述 ")
    @NotNull
    private String explain;

    @Column(length = 4)
    @ApiModelProperty("显示顺序 ")
    private Integer showOrder;


}
