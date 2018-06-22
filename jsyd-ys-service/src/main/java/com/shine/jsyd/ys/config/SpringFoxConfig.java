package com.shine.jsyd.ys.config;

//import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
@PropertySource(value = "classpath:swagger.properties")
public class SpringFoxConfig {

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                //.apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.shine.jsyd.ys"))
                .paths(PathSelectors.any())
                //.paths(PathSelectors.ant("/v2/**"))
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "标题：建设用地预审微服务API接口",
                "描述：建设用地预审业务相关接口说明",
                "1.0.0",
                "TERMS OF SERVICE URL",
                new Contact("Zhuo Wenjun", "", "wangmeinan@gmail.com"),
                "MIT Licence",
                "LICENCE URL",
                Collections.<VendorExtension>emptyList()
        );
    }
}
