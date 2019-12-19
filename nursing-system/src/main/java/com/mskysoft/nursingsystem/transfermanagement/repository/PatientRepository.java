package com.mskysoft.nursingsystem.transfermanagement.repository;

import com.mskysoft.nursingsystem.transfermanagement.entity.Patient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * 患者信息表(Patient)表数据库访问层
 *
 * @author sunshixiong
 * @since 2019-11-07 14:47:37
 */
@Api(tags = {"患者信息"})
@RepositoryRestResource(path = "patient")
public interface PatientRepository extends JpaRepository<Patient, String> {

  /**
   * 通过姓名查找
   * @param name 姓名
   * @return list
   */
  @RestResource(path = "names")
  @ApiOperation("通过姓名查找")
  List<Patient> findByName(String name);

}
