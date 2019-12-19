package com.mskysoft.nursingsystem.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;





/**
 * swagger-ui配置
 *
 * @author sunshixiong
 * @date 2019/9/24-17:17
 */
@Configuration
@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)
@ConditionalOnProperty(value = {"enable"}, prefix = "swagger2", havingValue = "true")
public class Swagger2Config {
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build();
  }

 /* private static final String AUTH = "Authorization";

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.mskysoft.nursingsystem.controller"))
            .paths(PathSelectors.any())
            .build()
            .securitySchemes(securitySchemes())
            .securityContexts(securityContexts());
  }

  private static ApiInfo apiInfo() {
    return new ApiInfoBuilder()
            .title("护理系统接口中心")
            .description("swagger-bootstrap-ui")
            .termsOfServiceUrl("http://localhost:8802/")
            .contact(new Contact("sunshixiong", "http://localhost:8802/", "sunshixiong@m-skysoft.com"))
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
*/
}

