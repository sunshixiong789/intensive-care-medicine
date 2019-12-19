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
import java.time.LocalDateTime;


/**
*
* 视频配置表
* @author sunshixiong
* @since 2019-11-07 17:09:00
*/
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_video")
@ApiModel(description = "视频配置表")
public class Video {

    @Column(length = 32)
    @ApiModelProperty("视频唯一标志 ")
    @Id
    @GeneratedValue(generator = "video_d")
    @GenericGenerator(name = "video_id", strategy = "uuid")
    private String videoId;

    @Column(nullable = false,length = 10)
    @ApiModelProperty("Ip地址 ")
    @NotNull
    private String ip;

    @Column(nullable = false,length = 20)
    @ApiModelProperty("用户名 ")
    @NotNull
    private String userName;

    @Column(nullable = false,length = 50)
    @ApiModelProperty("密码 ")
    @NotNull
    private String password;

    @Column(length = 10)
    @ApiModelProperty("端口号 ")
    private String port;


    @ApiModelProperty("记录时间 ")
    private LocalDateTime recordTime;

    @Column(length = 2)
    @ApiModelProperty("类型 ")
    private String type;

    @Column(length = 2)
    @ApiModelProperty("视频码流信息 ")
    private String streamType;


}
