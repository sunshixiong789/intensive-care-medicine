package com.mskysoft.baseservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mskysoft.baseservice.dto.HospitalDto;
import com.mskysoft.baseservice.entity.Hospital;
import com.mskysoft.baseservice.service.HospitalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 医院表(Hospital)表控制层
 *
 * @author daiminghang
 * @since 2019-10-12 17:13:04
 */
@Api(tags = "医院表")
@NoArgsConstructor
@RestController
@RequestMapping("hospital")
public class HospitalController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private HospitalService hospitalService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param hospital 查询实体
     * @return 所有数据
     */
    @GetMapping
    @ApiOperation("分页查询所有数据")
    public R<IPage<Hospital>> selectAll(Page<Hospital> page, Hospital hospital) {
        return success(this.hospitalService.page(page, new QueryWrapper<>(hospital)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @ApiOperation("通过主键查询单条数据")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "id")})
    public R<Hospital> selectOne(@PathVariable Integer id) {
        return success(this.hospitalService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param hospital 实体对象
     * @return 新增结果
     */
    @PostMapping
    @ApiOperation("新增数据")
    public R<Boolean> insert(@RequestBody Hospital hospital) {
        // 获取父亲id
        Integer parentId = hospital.getParentId();
        if (parentId != 0) {
            // 父亲entity
            Hospital parentHospital = hospitalService.getById(parentId);
            parentHospital.setChildrenNode("1");
            hospitalService.save(parentHospital);
        }
        return success(this.hospitalService.save(hospital));
    }

    /**
     * 修改数据
     *
     * @param hospital 实体对象
     * @return 修改结果
     */
    @PutMapping
    @ApiOperation("修改数据")
    public R<Boolean> update(@RequestBody Hospital hospital) {
        return success(this.hospitalService.updateById(hospital));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除结果
     */
    @DeleteMapping("{id}")
    @ApiOperation("删除数据")
    @ApiImplicitParams({@ApiImplicitParam(name = "id", value = "主键")})
    public R<Boolean> delete(@PathVariable Integer id) {
        List<HospitalDto> list = hospitalService.selectByParentId(id);
        if (list.size() <= 0) {
            return failed("当前医院有子节点，不允许删除！");
        }
        return success(this.hospitalService.deleteById(id));
    }

    /**
     * 根据父医院id查询子医院信息
     *
     * @param parentId 父医院id
     * @return 子医院信息
     */
    @GetMapping("/parent-id")
    @ApiOperation("根据父医院id查询子医院信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "parentId", value = "父医院id")})
    public R<List<HospitalDto>> selectByParentId(Integer parentId) {
        if (parentId == null) {
            parentId = 0;
        }
        return success(hospitalService.selectByParentId(parentId));
    }

    /**
     * 根据名称模糊查询医院信息
     *
     * @param name 名称
     * @return 查询医院信息
     */
    @GetMapping("/name")
    @ApiOperation("根据名称模糊查询医院信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "name", value = "名称")})
    public R<List<HospitalDto>> selectByName(String name) {
        return success(hospitalService.selectByName(name));
    }
}