package com.shine.jsyd.ys.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "测试")
public class Person {

    @ApiModelProperty(notes = "姓名")
    private String name;

    @ApiModelProperty(notes = "性别")
    private String sex;

    @ApiModelProperty(notes = "年龄")
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {

        return name;
    }
}
