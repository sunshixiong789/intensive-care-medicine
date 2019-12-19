package com.mskysoft.baseservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * (Hospital)实体类
 *
 * @author daiminghang
 * @since 2019-10-10 09:34:50
 */
@Getter
@Setter
@NoArgsConstructor
@TableName(value = "t_hospital")
@ApiModel(description = "医院")
public class Hospital {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty("医院id")
    private Integer id;

    @ApiModelProperty("医院名称")
    private String hosName;

    @ApiModelProperty("父医院id")
    private Integer parentId;

    @ApiModelProperty("地址省")
    private String addressProvince;

    @ApiModelProperty("地址市")
    private String addressCity;

    @ApiModelProperty("地址县")
    private String addressCountry;

    @ApiModelProperty("地址村")
    private String addressVillage;

    @ApiModelProperty("地址门牌号")
    private String addressDoor;

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

    @ApiModelProperty("行政区划代码")
    private String regionCode;

    @ApiModelProperty("联系电话类别")
    private String contactClass;

    @ApiModelProperty("联系电话代码")
    private String contactClassCode;

    @ApiModelProperty("联系电话号码")
    private String contactPhoneNumber;

    @ApiModelProperty("电子邮件地址")
    private String mail;

    @ApiModelProperty("机构名称")
    private String institutionName;

    @ApiModelProperty("机构组织代码")
    private String instOrgnizeCode;

    @ApiModelProperty("机构负责人")
    private String instPrincipal;

    @ApiModelProperty("机构地址")
    private String instAddress;

    @ApiModelProperty("科室名称")
    private String departmentName;

    @ApiModelProperty("机构角色")
    private String instRole;

    @ApiModelProperty("机构角色代码")
    private String instRoleCode;

    @ApiModelProperty("传真")
    private String fax;

    @ApiModelProperty("经度")
    private String longitude;

    @ApiModelProperty("纬度")
    private String latitude;

    @ApiModelProperty("组织机构id")
    private Integer deptId;

    @ApiModelProperty("组织机构父id")
    private Integer deptPid;

    @ApiModelProperty("电子邮件smtp")
    private String mailSmtp;

    @ApiModelProperty("电邮密码")
    private String mailPass;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("序号，上下级关系")
    private String xh;

    @ApiModelProperty("是否有孩子节点（0：无，1：有）")
    private String childrenNode;

}