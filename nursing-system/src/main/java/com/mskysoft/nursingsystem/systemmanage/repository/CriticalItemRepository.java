package com.mskysoft.nursingsystem.systemmanage.repository;

import com.mskysoft.nursingsystem.systemmanage.entity.CriticalItem;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 危急值项目配置表
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/13-9:01
 */
@Api(tags = "危急值项目配置表")
@RepositoryRestResource(path = "CriticalItem")
public interface CriticalItemRepository extends JpaRepository<CriticalItem, Integer> {
}
