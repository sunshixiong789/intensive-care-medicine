package com.mskysoft.nursingsystem.transfermanagement.repository;

import com.mskysoft.nursingsystem.transfermanagement.entity.SeparateMeasure;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 隔离措施记录表
 *
 * @author sunshixiong
 * @since 2019-11-07 17:09:01
 */
@Api(tags = "隔离措施记录表")
@RepositoryRestResource(path = "SeparateMeasure")
public interface SeparateMeasureRepository extends JpaRepository<SeparateMeasure,Integer> {

}
