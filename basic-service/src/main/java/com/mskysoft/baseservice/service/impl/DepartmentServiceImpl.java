package com.mskysoft.baseservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.DepartmentDao;
import com.mskysoft.baseservice.entity.Department;
import com.mskysoft.baseservice.service.DepartmentService;
import org.springframework.stereotype.Service;

/**
 * description:
 *
 * @author daiminghang
 * @date 2019/10/11 13:44
 */
@Service("DepartmentService")
public class DepartmentServiceImpl extends ServiceImpl<DepartmentDao, Department> implements DepartmentService {
}
