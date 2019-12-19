package com.mskysoft.baseservice.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.Date;


/**
 * (DeptInfo)实体类
 *
 * @author daiminghang
 * @since 2019-10-11 14:44:20
 */
@Getter
@Setter
@NoArgsConstructor
@TableName(value = "t_dept_info")
@ApiModel(description = "科室资料表")
public class DeptInfo {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty("id")
    private Integer id;
    
    @ApiModelProperty("科室id")
    private Integer deptId;
    
    @ApiModelProperty("状态（Y：可用； N：禁用）")
    private String state;
    
    @ApiModelProperty("资料名")
    private String infoName;
    
    @ApiModelProperty("资料类型")
    private String infoType;
    
    @ApiModelProperty("存储值")
    private String storedValue;
    
    @ApiModelProperty("编辑时间")
    private Date updateTime;
    
    @ApiModelProperty("编辑用户id")
    private Integer updateBy;
    
    @ApiModelProperty("备注")
    private String remark;
    

}