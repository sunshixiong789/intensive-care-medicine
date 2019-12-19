package com.mskysoft.nursingsystem.transfermanagement.repository;

import com.mskysoft.nursingsystem.transfermanagement.entity.CareLevel;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * 护理级别记录表
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/13-11:04
 */
@Api(tags = "护理级别记录表")
@RepositoryRestResource(path = "CareLevel")
public interface CareLevelRepository extends JpaRepository<CareLevel,Integer> {
}
