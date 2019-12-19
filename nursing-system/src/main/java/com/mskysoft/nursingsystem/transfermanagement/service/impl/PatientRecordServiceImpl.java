package com.mskysoft.nursingsystem.transfermanagement.service.impl;

import com.mskysoft.nursingsystem.transfermanagement.entity.PatientRecord;
import com.mskysoft.nursingsystem.transfermanagement.repository.PatientRecordRepository;
import com.mskysoft.nursingsystem.transfermanagement.service.PatientRecordService;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 患者出入科记录表
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/13-16:07
 */
@Service("patientRecordService")
@NoArgsConstructor
public class PatientRecordServiceImpl implements PatientRecordService {

  @Resource
  private PatientRecordRepository recordRepository;

  @Override
  public Page<PatientRecord> getByParam(PatientRecord record, Pageable pageable) {
    ExampleMatcher matcher = ExampleMatcher.matching().withIgnorePaths("outReason");
    Example<PatientRecord> example = Example.of(record, matcher);

    return recordRepository.findAll(example, pageable);
  }
}
