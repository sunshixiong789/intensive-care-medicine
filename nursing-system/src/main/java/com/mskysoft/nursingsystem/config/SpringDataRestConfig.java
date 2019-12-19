package com.mskysoft.nursingsystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

/**
 * spring data rest 配置暴露id
 *
 * @author sunshixiong（1285913468@qq.com）
 * @date 2019/11/11-15:02
 */
@Configuration
public class SpringDataRestConfig implements RepositoryRestConfigurer {

  @Autowired
  private EntityManager entityManager;

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    config.exposeIdsFor(entityManager.getMetamodel().getEntities()
            .stream()
            .map(Type::getJavaType)
            .toArray(Class[]::new));
  }
}
