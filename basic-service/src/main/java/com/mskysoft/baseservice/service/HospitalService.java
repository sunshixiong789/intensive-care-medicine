package com.mskysoft.baseservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mskysoft.baseservice.dto.HospitalDto;
import com.mskysoft.baseservice.entity.Hospital;

import java.util.List;

/**
 * description:
 *
 * @author daiminghang
 * @date 2019/10/10 16:06
 */
public interface HospitalService extends IService<Hospital> {

    /**
     * 根据父医院id查询子医院信息
     *
     * @param parentId 父医院id
     * @return 子医院信息
     */
    List<HospitalDto> selectByParentId(Integer parentId);

    /**
     * 根据名称模糊查询医院信息
     *
     * @param name 名称
     * @return 查询医院信息
     */
    List<HospitalDto> selectByName(String name);

    /**
     * 根据id删除医院信息
     *
     * @param id 主键
     * @return 删除结果
     */
    boolean deleteById(Integer id);
}
