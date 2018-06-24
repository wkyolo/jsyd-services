package com.shine.jsyd.ys.controller;

import com.shine.jsyd.ys.model.Ysjbxx;
import com.shine.jsyd.ys.service.YsjbxxService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")//RequestMapping 没有会导致SWAGGER-UI出错
@Api(description = "预审业务API接口", tags = "YS")
public class YsjbxxController {

    private YsjbxxService ysjbxxService;

    @Autowired
    public void setYsjbxxService(YsjbxxService ysjbxxService){ this.ysjbxxService = ysjbxxService; }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ApiOperation("返回所有预审项目")
    public List<Ysjbxx> getAllYsjbxx(){ return ysjbxxService.getAllYsjbxx(); }


    @RequestMapping(method = RequestMethod.GET, path = "/jbxx", produces = "text/plain")
    @ApiOperation("预审业务概况")
    public String getYsjbxx(){
        return "建设用地预审微服务--基本信息接口";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = "text/plain")
    @ApiOperation("预审子业务基本信息")
    public String getYsjbxxId(@ApiParam("业务ID") @PathVariable("id") String id){
        return String.format("建设用地预审微服务接口{ %s }", id);
    }

}
