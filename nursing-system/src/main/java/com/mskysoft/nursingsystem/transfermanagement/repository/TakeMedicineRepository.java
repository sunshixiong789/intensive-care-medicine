package com.mskysoft.nursingsystem.transfermanagement.repository;

import com.mskysoft.nursingsystem.transfermanagement.entity.TakeMedicine;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 带药信息
 *
 * @author sunshixiong
 * @since 2019-11-07 17:09:01
 */
@Api(tags = "带药信息")
@RepositoryRestResource(path = "TakeMedicine")
public interface TakeMedicineRepository extends JpaRepository<TakeMedicine,Integer> {

}
