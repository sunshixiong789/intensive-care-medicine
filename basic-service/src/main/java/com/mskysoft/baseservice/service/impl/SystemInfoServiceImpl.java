package com.mskysoft.baseservice.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.SystemInfoDao;
import com.mskysoft.baseservice.entity.SystemInfo;
import com.mskysoft.baseservice.service.SystemInfoService;
import org.springframework.stereotype.Service;

/**
 * 系统信息表(SystemInfo)表服务实现类
 *
 * @author sunshixiong
 * @since 2019-10-18 16:26:11
 */
@Service("systemInfoService")
public class SystemInfoServiceImpl extends ServiceImpl<SystemInfoDao
, SystemInfo> implements SystemInfoService {

}