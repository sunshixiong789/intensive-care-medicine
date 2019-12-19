package com.mskysoft.nursingsystem.systemmanage.repository;

import com.mskysoft.nursingsystem.systemmanage.entity.Dressing;
import com.mskysoft.nursingsystem.systemmanage.entity.PipeClassify;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 敷料配置表
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/13-9:01
 */
@Api(tags = "管路分类表")
@RepositoryRestResource(path = "PipeClassify")
public interface PipeClassifyRepository extends JpaRepository<PipeClassify, String> {
}
