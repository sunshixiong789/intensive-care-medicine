package com.mskysoft.nursingsystem.transfermanagement.repository;

import com.mskysoft.nursingsystem.transfermanagement.entity.CriticalLevel;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 危重级别记录表
 *
 * @author sunshixiong
 * @since 2019-11-07 17:09:01
 */
@Api(tags = "危重级别记录表")
@RepositoryRestResource(path = "CriticalLevel")
public interface CriticalLevelRepository extends JpaRepository<CriticalLevel,Integer> {

}
