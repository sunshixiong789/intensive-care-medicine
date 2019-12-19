package com.mskysoft.baseservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mskysoft.baseservice.dao.HospitalDao;
import com.mskysoft.baseservice.dto.HospitalDto;
import com.mskysoft.baseservice.entity.Hospital;
import com.mskysoft.baseservice.service.HospitalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 *
 * @author daiminghang
 * @date 2019/10/10 16:08
 */
@Service("HospitalService")
public class HospitalServiceImpl extends ServiceImpl<HospitalDao, Hospital> implements HospitalService {

    @Resource
    private HospitalDao hospitalDao;

    /**
     * 根据父医院id查询子医院信息
     *
     * @param parentId 父医院id
     * @return 子医院信息
     */
    @Override
    public List<HospitalDto> selectByParentId(Integer parentId) {
        return hospitalDao.selectByParentId(parentId);
    }

    /**
     * 根据名称模糊查询医院信息
     *
     * @param name 名称
     * @return 查询医院信息
     */
    @Override
    public List<HospitalDto> selectByName(String name) {
        return hospitalDao.selectByName(name);
    }

    /**
     * 根据id删除医院信息
     *
     * @param id 主键
     * @return 删除结果
     */
    @Override
    public boolean deleteById(Integer id) {
        Hospital hospital = hospitalDao.selectById(id);
        if (hospital.getId() != null) {
            // 父医院id
            Integer parentId = hospital.getParentId();
            // 查询条件
            QueryWrapper<Hospital> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("parent_id", parentId);
            // 查询该父医院的子医院信息
            List<Hospital> childrenHospitals = hospitalDao.selectList(queryWrapper);
            // 如果该父医院只有一个子医院，则修改父医院的children_node值
            if (childrenHospitals.size() <= 1) {
                Hospital parentHospital = new Hospital();
                parentHospital.setId(parentId);
                parentHospital.setChildrenNode("0");
                hospitalDao.updateById(parentHospital);
            }
            // 删除该医院信息
            hospitalDao.deleteById(id);
            return true;
        }
        return false;
    }
}
