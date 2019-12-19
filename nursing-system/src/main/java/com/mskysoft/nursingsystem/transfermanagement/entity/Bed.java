package com.mskysoft.nursingsystem.transfermanagement.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 * 床位表(Bed)实体类
 *
 * @author sunshixiong
 * @since 2019-11-07 17:09:00
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_bed")
@org.hibernate.annotations.Table(appliesTo = "t_bed",comment = "床位表")
@ApiModel(description = "床位表")
public class Bed {

    @ApiModelProperty("主键")
    @Id
    @GeneratedValue
    @Column(nullable = false,length = 4)
    private Integer id;

    @ApiModelProperty("床位编码")
    @Column(nullable = false,length = 20)
    @NotNull
    private String bedNo;

    @ApiModelProperty("显示名称")
    @Column(nullable = false,length = 30)
    @NotNull
    private String showName;

    @ApiModelProperty("床边视频设备信息")
    @Column(length = 50)
    private String bedVideo;

    @Column(length = 2)
    @ApiModelProperty("病床类型（0:普通病床 1:救护车）")
    private String bedType;

    @Column(length = 20)
    @ApiModelProperty("科室编码")
    private String deptCode;

    @Column(length = 20)
    @ApiModelProperty("医院编码")
    private String hosCode;


}
