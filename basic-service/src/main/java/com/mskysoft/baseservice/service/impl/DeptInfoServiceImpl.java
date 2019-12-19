package com.mskysoft.baseservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.DeptInfoDao;
import com.mskysoft.baseservice.entity.DeptInfo;
import com.mskysoft.baseservice.service.DeptInfoService;
import org.springframework.stereotype.Service;

/**
 * description:
 *
 * @author daiminghang
 * @date 2019/10/11 14:49
 */
@Service("DeptInfoService")
public class DeptInfoServiceImpl extends ServiceImpl<DeptInfoDao, DeptInfo> implements DeptInfoService {
}
