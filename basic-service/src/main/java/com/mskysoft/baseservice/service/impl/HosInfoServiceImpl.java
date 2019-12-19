package com.mskysoft.baseservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.HosInfoDao;
import com.mskysoft.baseservice.entity.HosInfo;
import com.mskysoft.baseservice.service.HosInfoService;
import org.springframework.stereotype.Service;

/**
 * description:
 *
 * @author daiminghang
 * @date 2019/10/11 14:26
 */
@Service("HosInfoService")
public class HosInfoServiceImpl extends ServiceImpl<HosInfoDao, HosInfo> implements HosInfoService {
}
