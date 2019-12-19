package com.mskysoft.nursingsystem.transfermanagement.repository;

import com.mskysoft.nursingsystem.transfermanagement.entity.Operation;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 手术信息表
 *
 * @author sunshixiong
 * @since 2019-11-07 17:09:01
 */
@Api(tags = "手术信息表")
@RepositoryRestResource(path = "Operation")
public interface OperationRepository extends JpaRepository<Operation,String> {

}
