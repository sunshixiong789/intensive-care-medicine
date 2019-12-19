package com.mskysoft.nursingsystem.transfermanagement.controller;

import com.mskysoft.nursingsystem.transfermanagement.entity.PatientRecord;
import com.mskysoft.nursingsystem.transfermanagement.service.PatientRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 患者出入科记录表
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/13-16:16
 */
@Api(tags = "患者出入科记录表")
@NoArgsConstructor
@RestController
@RequestMapping("PatientRecord")
public class PatientRecordController {

  @Resource
  private PatientRecordService recordService;

  /**
   * 通过实例参数模糊查询返回数据
   *
   * @param record   实例
   * @param pageable 分页
   * @return page
   */
  @ApiOperation(value = "通过实例参数查询")
  @GetMapping("param")
  public Page<PatientRecord> getByParam(PatientRecord record, @PageableDefault(size = 20, sort = "comeTime"
          , direction = Sort.Direction.ASC) Pageable pageable) {
    return recordService.getByParam(record, pageable);
  }
}
