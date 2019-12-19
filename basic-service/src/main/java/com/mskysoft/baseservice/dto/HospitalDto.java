package com.mskysoft.baseservice.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * description:
 *
 * @author daiminghang
 * @date 2019/10/17 11:17
 */
@Getter
@Setter
@NoArgsConstructor
@ApiModel(description = "医院dto")
public class HospitalDto {

    @ApiModelProperty("医院id")
    private Integer id;

    @ApiModelProperty("医院名称")
    private String hosName;

    @ApiModelProperty("父医院id")
    private Integer parentId;

    @ApiModelProperty("标识符")
    private String tag;

    @ApiModelProperty("许可证号")
    private String licenseKey;

    @ApiModelProperty("所有制形式")
    private String ownership;

    @ApiModelProperty("医院类别")
    private String hosType;

    @ApiModelProperty("医院级别")
    private String hosGrade;

    @ApiModelProperty("医院等次")
    private String hosClass;

    @ApiModelProperty("经营性质")
    private String businessNature;

    @ApiModelProperty("服务对象")
    private String serviceObject;

    @ApiModelProperty("床位数")
    private Integer bedNumber;

    @ApiModelProperty("邮编")
    private String zipCode;

    @ApiModelProperty("机构地址")
    private String instAddress;

    @ApiModelProperty("是否有孩子节点（0：无，1：有）")
    private String childrenNode;
}
