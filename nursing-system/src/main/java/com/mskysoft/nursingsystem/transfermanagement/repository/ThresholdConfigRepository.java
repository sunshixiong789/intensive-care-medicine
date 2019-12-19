package com.mskysoft.nursingsystem.transfermanagement.repository;

import com.mskysoft.nursingsystem.transfermanagement.entity.ThresholdConfig;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 患者阈值配置表
 *
 * @author sunshixiong
 * @since 2019-11-07 17:09:01
 */
@Api(tags = "患者阈值配置表")
@RepositoryRestResource(path = "ThresholdConfig")
public interface ThresholdConfigRepository extends JpaRepository<ThresholdConfig,Integer> {

}
