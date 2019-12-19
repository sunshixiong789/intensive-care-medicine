package com.mskysoft.baseservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


/**
 * 临床术语(ClinicalTerms)实体类
 *
 * @author sunshixiong
 * @since 2019-10-09 14:24:04
 */
@Getter
@Setter
@NoArgsConstructor
@ApiModel(description = "临床术语")
@TableName(value = "d_clinical_terms")
public class ClinicalTerms {


  @TableId(type = IdType.AUTO)
  private Integer id;

  @ApiModelProperty("术语名称")
  private String name;

  @ApiModelProperty("父节点id（当为0时，没有父节点）")
  private Integer parentId;

  @ApiModelProperty("父节点名称")
  private String parentName;


  @ApiModelProperty("编码")
  private String code;

  @ApiModelProperty("同义词")
  private String thesaurus;

  @ApiModelProperty("ws数据集")
  private String dsWs;

  @ApiModelProperty("SNOMED CT数据集")
  private String dsSct;

  @ApiModelProperty("LOINC数据集")
  private String dsLoinc;

  @ApiModelProperty("ICD-10数据集")
  private String dsIcd;

  @ApiModelProperty("ICD-9-CM数据集")
  private String dsIcdCm;

  @ApiModelProperty("规划模块（也就是临床术语顶层）")
  private String planningModule;

  @ApiModelProperty("应用侧重（1：观测项，2：观测值，3观测项与值）")
  private String applicationFocusing;

  @ApiModelProperty("是否激活（1：激活，0：未激活）")
  private String status;

  @ApiModelProperty("数据生成时间")
  private LocalDateTime createTime;

  @ApiModelProperty("数据更新时间")
  private LocalDateTime updateTime;

  @ApiModelProperty("是否有孩子节点(0：无，1：有)")
  private String childrenNode;
}
