package com.mskysoft.baseservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.UserInfoDao;
import com.mskysoft.baseservice.entity.UserInfo;
import com.mskysoft.baseservice.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * (UserInfo)表服务实现类
 *
 * @author daiminghang
 * @since 2019-10-17 17:06:52
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo> implements UserInfoService {

}