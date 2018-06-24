package com.shine.jsyd.zuul.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;


import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider{

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<SwaggerResource>();
        resources.add(swaggerResource("预审", "/jsyd/ys/v2/api-docs", "2.0"));
        resources.add(swaggerResource("报批", "/jsyd/bp/v2/api-docs", "2.0"));
        resources.add(swaggerResource("农整", "/jsyd/nz/v2/api-docs", "2.0"));
        resources.add(swaggerResource("规划", "/jsyd/gh/v2/api-docs", "2.0"));
        resources.add(swaggerResource("盘活", "/jsyd/ph/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
