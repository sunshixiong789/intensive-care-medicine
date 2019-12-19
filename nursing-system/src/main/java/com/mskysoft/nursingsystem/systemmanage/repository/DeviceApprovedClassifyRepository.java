package com.mskysoft.nursingsystem.systemmanage.repository;

import com.mskysoft.nursingsystem.systemmanage.entity.DeviceApprovedClassify;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 设备核定分类表
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/13-9:01
 */
@Api(tags = "设备核定分类表")
@RepositoryRestResource(path = "DeviceApprovedClassify")
public interface DeviceApprovedClassifyRepository extends JpaRepository<DeviceApprovedClassify, Integer> {
}
