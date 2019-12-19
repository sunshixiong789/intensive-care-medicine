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
import java.time.LocalDateTime;


/**
*
* 生命体征配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_vital_sign")
@ApiModel(description = "生命体征配置表")
public class VitalSign {

    @Column(length = 32)
    @ApiModelProperty("生命体征唯一标志 ")
    @Id
    @GeneratedValue(generator = "vital_id")
    @GenericGenerator(name = "vital_id", strategy = "uuid")
    private String vitalId;

    @Column(length = 20)
    @ApiModelProperty("参数名称 ")
    private String name;

    @Column(length = 20)
    @ApiModelProperty("编码 ")
    private String code;

    @Column(length = 10)
    @ApiModelProperty("单位 ")
    private String unit;

    @Column(length = 20)
    @ApiModelProperty("对照码 ")
    private String loincId;

    @Column(length = 20)
    @ApiModelProperty("参数类型 ")
    private String type;

    @Column(length = 20)
    @ApiModelProperty("参数关键字 ")
    private String keyValue;

    @Column(length = 10)
    @ApiModelProperty("颜色代码 ")
    private String color;


    @ApiModelProperty("图标 ")
    private LocalDateTime icon;

    @Column(length = 4)
    @ApiModelProperty("曲线宽度 ")
    private Integer width;

    @Column(length = 4)
    @ApiModelProperty("曲线连线 时间间隔 ")
    private Integer timeInterval;

    @Column(length = 4)
    @ApiModelProperty("精度位数 ")
    private Integer precisionBit;

    @Column(length = 4)
    @ApiModelProperty("显示顺序 ")
    private Integer showOrder;

    @Column(length = 50)
    @ApiModelProperty("设备型号 ")
    private String deviceModel;

    @Column(length = 2)
    @ApiModelProperty("默认显示 ")
    private String display;

    @Column(length = 20 )
    @ApiModelProperty("极值应用 ")
    private String extremeValue;

    @Column(length = 50)
    @ApiModelProperty("参数说明 ")
    private String remark;


}
