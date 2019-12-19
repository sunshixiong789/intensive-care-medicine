package com.mskysoft.nursingsystem.transfermanagement.repository;

import com.mskysoft.nursingsystem.transfermanagement.entity.Height;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 身高记录表
 *
 * @author sunshixiong
 * @since 2019-11-07 17:09:01
 */
@Api(tags = "身高记录表")
@RepositoryRestResource(path = "Height")
public interface HeightRepository extends JpaRepository<Height,Integer> {

}
