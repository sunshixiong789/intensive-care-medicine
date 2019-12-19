package com.mskysoft.authoritycertification.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * swagger-ui配置
 *
 * @author sunshixiong
 * @date 2019/9/24-17:17
 */
/*@Configuration*/
@EnableSwagger2WebMvc
@ConditionalOnProperty(value = {"enable"}, prefix = "swagger2", havingValue = "true")
public class Swagger2Config {

  private static final String AUTH = "Authorization";

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.mskysoft.baseservice.controller"))
            .paths(PathSelectors.any())
            .build()
            .securitySchemes(securitySchemes())
            .securityContexts(securityContexts());
  }

  private static ApiInfo apiInfo() {
    return new ApiInfoBuilder()
            .title("基础服务接口")
            .description("swagger-bootstrap-ui")
            .termsOfServiceUrl("http://localhost:8801/")
            .contact(new Contact("sunshixiong", "http://localhost:8801/doc.html", "sunshixiong@m-skysoft.com"))
            .version("1.0")
            .build();
  }

  private static List<ApiKey> securitySchemes() {
    return newArrayList(
            new ApiKey(AUTH, AUTH, "header"));
  }

  private static List<SecurityContext> securityContexts() {
    return newArrayList(
            SecurityContext.builder()
                    .securityReferences(defaultAuth())
                    .forPaths(PathSelectors.regex("^(?!auth).*$"))
                    .build()
    );
  }

  private static List<SecurityReference> defaultAuth() {
    AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
    AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
    authorizationScopes[0] = authorizationScope;
    return newArrayList(
            new SecurityReference(AUTH, authorizationScopes));
  }

}
