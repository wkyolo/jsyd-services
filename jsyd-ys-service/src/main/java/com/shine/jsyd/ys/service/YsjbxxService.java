package com.shine.jsyd.ys.service;

import com.shine.jsyd.ys.model.Ysjbxx;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class YsjbxxService {

    private List<Ysjbxx> ysjbxxes;

    @PostConstruct
    void init() {
        this.ysjbxxes = new ArrayList<Ysjbxx>();
        Ysjbxx jbxxOne = new Ysjbxx("330603171712059000001","哥谭市预审项目一","330621","A");
        ysjbxxes.add(jbxxOne);
        Ysjbxx jbxxTwo = new Ysjbxx("330603171712059000002","纽约市预审项目二","330622","B");
        ysjbxxes.add(jbxxTwo);
        Ysjbxx jbxxThree = new Ysjbxx("330603171712059000003","底特律预审项目三","330623","C");
        ysjbxxes.add(jbxxThree);

    }

    public List<Ysjbxx> getAllYsjbxx() { return this.ysjbxxes; }
}
