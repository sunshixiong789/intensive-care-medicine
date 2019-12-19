package com.mskysoft.baseservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


/**
 * 医疗机构资料(HosInfo)实体类
 *
 * @author daiminghang
 * @since 2019-10-11 14:21:49
 */
@Getter
@Setter
@NoArgsConstructor
@TableName(value = "t_hos_info")
@ApiModel(description = "医疗机构资料")
public class HosInfo {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("医院id")
    private Integer hosId;

    @JsonProperty("name")
    @ApiModelProperty("状态（Y：可用； N：禁用）")
    private String state;

    @ApiModelProperty("资料名")
    private String infoName;

    @ApiModelProperty("资料类型")
    private String infoType;

    @ApiModelProperty("存储值")
    private String storedValue;

    @ApiModelProperty("编辑时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("编辑用户id")
    private Integer updateBy;

    @ApiModelProperty("备注")
    private String remark;


}
