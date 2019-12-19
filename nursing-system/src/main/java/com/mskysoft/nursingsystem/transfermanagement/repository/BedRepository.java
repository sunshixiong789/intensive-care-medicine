package com.mskysoft.nursingsystem.transfermanagement.repository;

import com.mskysoft.nursingsystem.transfermanagement.entity.Bed;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 床位表(Bed)表数据库访问层
 *
 * @author sunshixiong
 * @since 2019-11-07 17:09:01
 */
@Api(tags = "床位表")
@RepositoryRestResource(path = "bed")
public interface BedRepository extends JpaRepository<Bed,Integer> {

}
