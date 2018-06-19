package com.shine.jsyd.ys.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YsApi {
    @RequestMapping("/ys")
    public String ysApi(){
        return "建设用地预审微服务接口";
    }

    @RequestMapping("/ys/{id}")
    public String ysApiId(@PathVariable("id") String id){
        return String.format("建设用地预审微服务接口{ %s }", id);
    }

}
