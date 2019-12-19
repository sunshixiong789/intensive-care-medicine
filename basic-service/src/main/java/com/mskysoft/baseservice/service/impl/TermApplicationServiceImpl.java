package com.mskysoft.baseservice.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.TermApplicationDao;
import com.mskysoft.baseservice.entity.TermApplication;
import com.mskysoft.baseservice.service.TermApplicationService;
import org.springframework.stereotype.Service;

/**
 * 术语应用(TermApplication)表服务实现类
 *
 * @author sunshixiong
 * @since 2019-10-09 16:23:42
 */
@Service("termApplicationService")
public class TermApplicationServiceImpl extends
        ServiceImpl<TermApplicationDao, TermApplication> implements TermApplicationService {

}
