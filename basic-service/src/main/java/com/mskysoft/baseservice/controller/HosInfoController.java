package com.mskysoft.baseservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mskysoft.baseservice.entity.HosInfo;
import com.mskysoft.baseservice.service.HosInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 医疗机构资料(HosInfo)表控制层
 *
 * @author daiminghang
 * @since 2019-10-12 17:16:03
 */
@Api(tags = "医疗机构资料")
@NoArgsConstructor
@RestController
@RequestMapping("hosInfo")
public class HosInfoController extends ApiController {

    /**
     * 服务对象
     */
    @Resource
    private HosInfoService hosInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page    分页对象
     * @param hosInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    @ApiOperation("分页查询所有数据")
    public R<IPage<HosInfo>> selectAll(Page<HosInfo> page, HosInfo hosInfo) {
        return success(this.hosInfoService.page(page, new QueryWrapper<>(hosInfo)));
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
    public R<HosInfo> selectOne(@PathVariable Integer id) {
        return success(this.hosInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param hosInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    @ApiOperation("新增数据")
    public R<Boolean> insert(@RequestBody HosInfo hosInfo) {
        return success(this.hosInfoService.save(hosInfo));
    }

    /**
     * 修改数据
     *
     * @param hosInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    @ApiOperation("修改数据")
    public R<Boolean> update(@RequestBody HosInfo hosInfo) {
        return success(this.hosInfoService.updateById(hosInfo));
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
        return success(this.hosInfoService.removeById(id));
    }

    /**
     * 根据名称模糊查询机构资料
     *
     * @param page 分页数据
     * @param name 名称
     * @return 查询到的分页数据
     */
    @GetMapping("/name")
    @ApiOperation("根据名称模糊查询机构资料")
    @ApiImplicitParams({@ApiImplicitParam(name = "name", value = "名称")})
    public R<IPage<HosInfo>> selectByName(Page<HosInfo> page, String name) {
        // 查询条件
        QueryWrapper<HosInfo> hosInfoQueryWrapper = new QueryWrapper<>();
        hosInfoQueryWrapper.lambda().like(HosInfo::getInfoName, name);
        return success(hosInfoService.page(page, hosInfoQueryWrapper));
    }
}