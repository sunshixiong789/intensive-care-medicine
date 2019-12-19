package com.mskysoft.nursingsystem.transfermanagement.repository;

import com.mskysoft.nursingsystem.transfermanagement.entity.CostCategory;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 费用类别
 *
 * @author sunshixiong
 * @since 2019-11-07 17:09:01
 */
@Api(tags = "费用类别")
@RepositoryRestResource(path = "CostCategory")
public interface CostCategoryRepository extends JpaRepository<CostCategory,Integer> {

}
