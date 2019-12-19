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
 * 科室表(Department)实体类
 *
 * @author daiminghang
 * @since 2019-10-11 11:53:50
 */
@Getter
@Setter
@NoArgsConstructor
@TableName(value = "t_department")
@ApiModel(description = "科室表")
public class Department {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty("科室id")
    private Integer id;

    @ApiModelProperty("科室名称")
    private String deptName;

    @ApiModelProperty("标识符")
    private String tag;

    @ApiModelProperty("ICU标识（Y/N）")
    private String icuMarking;

    @ApiModelProperty("科室类别")
    private String deptType;

    @ApiModelProperty("专业类别")
    private String majorType;

    @ApiModelProperty("功能类别")
    private String functionType;

    @ApiModelProperty("楼层位置（物理地址）")
    private String address;

    @ApiModelProperty("上级科室id")
    private Integer parentId;

    @ApiModelProperty("所属医疗机构id")
    private Integer hosId;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("停用标志（1：启用， 0：停用）")
    private String allowing;
    

}