package com.mskysoft.baseservice.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.ClinicalTermsDao;
import com.mskysoft.baseservice.entity.ClinicalTerms;
import com.mskysoft.baseservice.service.ClinicalTermsService;
import org.springframework.stereotype.Service;

/**
 * 临床术语(ClinicalTerms)表服务实现类
 *
 * @author sunshixiong
 * @since 2019-10-09 14:35:41
 */
@Service("clinicalTermsService")
public class ClinicalTermsServiceImpl extends
        ServiceImpl<ClinicalTermsDao, ClinicalTerms> implements ClinicalTermsService {

}
