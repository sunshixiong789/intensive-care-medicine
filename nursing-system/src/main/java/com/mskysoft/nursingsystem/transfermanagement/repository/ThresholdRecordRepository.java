package com.mskysoft.nursingsystem.transfermanagement.repository;

import com.mskysoft.nursingsystem.transfermanagement.entity.ThresholdRecord;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 患者阈值记录表
 *
 * @author sunshixiong
 * @since 2019-11-07 17:09:01
 */
@Api(tags = "患者阈值记录表")
@RepositoryRestResource(path = "ThresholdRecord")
public interface ThresholdRecordRepository extends JpaRepository<ThresholdRecord,Integer> {

}
