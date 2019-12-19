package com.mskysoft.nursingsystem.transfermanagement.service;

import com.mskysoft.nursingsystem.transfermanagement.entity.PatientRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 患者出入科记录表
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/13-15:59
 */
public interface PatientRecordService {

  /**
   * 通过多个参数查询返回数据
   * @param record 对象
   * @param pageable 分页
   * @return page
   */
  Page<PatientRecord> getByParam(PatientRecord record, Pageable pageable);
}
