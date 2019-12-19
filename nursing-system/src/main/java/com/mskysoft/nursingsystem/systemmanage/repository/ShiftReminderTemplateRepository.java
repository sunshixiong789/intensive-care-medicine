package com.mskysoft.nursingsystem.systemmanage.repository;

import com.mskysoft.nursingsystem.systemmanage.entity.ShiftReminderTemplate;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 交班提醒模板配置表
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/13-9:01
 */
@Api(tags = "交班提醒模板配置表")
@RepositoryRestResource(path = "ShiftReminderTemplate")
public interface ShiftReminderTemplateRepository extends JpaRepository<ShiftReminderTemplate, Integer> {
}
