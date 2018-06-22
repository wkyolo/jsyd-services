package com.shine.jsyd.ys.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Test")
public class Person {

    @ApiModelProperty(notes = "Name")
    private String name;

    @ApiModelProperty(notes = "Sex")
    private String sex;

    @ApiModelProperty(notes = "Age")
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
