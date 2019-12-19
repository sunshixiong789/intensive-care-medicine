package com.mskysoft.baseservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mskysoft.baseservice.dto.HospitalDto;
import com.mskysoft.baseservice.entity.Hospital;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * description:
 *
 * @author daiminghang
 * @date 2019/10/10 16:05
 */
public interface HospitalDao extends BaseMapper<Hospital> {

    /**
     * 根据父医院id查询子医院信息
     *
     * @param parentId 父医院id
     * @return 子医院信息
     */
    @Select("SELECT " +
            "  h.id AS id, h.hos_name AS hosName, h.parent_id AS parentId, h.tag AS tag,\n" +
            "  h.license_key AS licenseKey, h.ownership AS ownership, h.hos_type AS hosType,\n" +
            "  h.hos_grade AS hosGrade, h.hos_class AS hosClass, h.business_nature AS businessNature,\n" +
            "  h.service_object AS serviceObject, h.bed_number AS bedNumber, h.inst_address AS instAddress,\n" +
            "  h.zip_code AS zipCode, h.children_node AS childrenNode \n" +
            "FROM\n" +
            "  t_hospital h \n" +
            "WHERE\n" +
            "  h.parent_id = #{parentId}")
    List<HospitalDto> selectByParentId(Integer parentId);

    /**
     * 根据名称模糊查询医院信息
     *
     * @param name 名称
     * @return 查询医院信息
     */
    @Select("SELECT " +
            "  h.id AS id, h.hos_name AS hosName, h.parent_id AS parentId, h.tag AS tag,\n" +
            "  h.license_key AS licenseKey, h.ownership AS ownership, h.hos_type AS hosType,\n" +
            "  h.hos_grade AS hosGrade, h.hos_class AS hosClass, h.business_nature AS businessNature,\n" +
            "  h.service_object AS serviceObject, h.bed_number AS bedNumber, h.inst_address AS instAddress,\n" +
            "  h.zip_code AS zipCode, h.children_node AS childrenNode \n" +
            "FROM\n" +
            "  t_hospital h \n" +
            "WHERE\n" +
            "  h.hos_name like #{name}")
    List<HospitalDto> selectByName(String name);
}
