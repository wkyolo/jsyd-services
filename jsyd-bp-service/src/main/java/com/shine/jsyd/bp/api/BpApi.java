package com.shine.jsyd.bp.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BpApi {

    @RequestMapping("/")
    public String bpApi(){
        return "建设用地报批微服务接口";
    }

    @RequestMapping("/{id}")
    public String bpApiId(@PathVariable("id") String id){
        return String.format("建设用地报批微服务接口{ %s }", id);
    }
}
