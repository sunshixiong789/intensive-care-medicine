package com.mskysoft.nursingsystem.systemmanage.repository;

import com.mskysoft.nursingsystem.systemmanage.entity.DeviceClinicCare;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 设备临床护理配置表
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/13-9:01
 */
@Api(tags = "设备临床护理配置表")
@RepositoryRestResource(path = "DeviceClinicCare")
public interface DeviceClinicCareRepository extends JpaRepository<DeviceClinicCare, Integer> {
}
