package com.mskysoft.nursingsystem.systemmanage.repository;

import com.mskysoft.nursingsystem.systemmanage.entity.SeparateMeasureConfig;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 隔离措施配置表
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/13-9:01
 */
@Api(tags = "隔离措施配置表")
@RepositoryRestResource(path = "SeparateMeasureConfig")
public interface SeparateMeasureConfigRepository extends JpaRepository<SeparateMeasureConfig, Integer> {
}
