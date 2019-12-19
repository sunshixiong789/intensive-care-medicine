package com.mskysoft.nursingsystem.systemmanage.repository;

import com.mskysoft.nursingsystem.systemmanage.entity.VitalSignExtremum;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 生命体征极值配置表
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/13-9:01
 */
@Api(tags = "生命体征极值配置表")
@RepositoryRestResource(path = "VitalSignExtremum")
public interface VitalSignExtremumRepository extends JpaRepository<VitalSignExtremum, Integer> {
}
