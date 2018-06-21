package com.shine.jsyd.ys.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.*;
import java.util.Date;

@ApiModel(description = "预审基本信息")
public class Ysjbxx {
    @ApiModelProperty(notes = "${ysjbxx.xmguid}", required = true, position = 0)
    @NotNull
    private String xmguid;

    @ApiModelProperty(notes = "项目名称")
    @NotBlank
    @Size(min = 1, max = 200)
    private String xmmc;

    @ApiModelProperty(notes = "县市代码")
    private String xsdm;

    @ApiModelProperty(notes = "指标类型")
    private String zblx;

    @ApiModelProperty(notes = "申请单位")
    private String sqdw;

    @ApiModelProperty(notes = "申请日期")
    private Date sqrq;

    @ApiModelProperty(notes = "项目编号")
    private String xmbh;

    @ApiModelProperty(notes = "项目总面积")
    private Double xmzmj;

    @ApiModelProperty(notes = "农用地面积")
    private Double nydmj;

    @ApiModelProperty(notes = "耕地面积")
    private Double gdmj;

    @ApiModelProperty(notes = "办件库推送状态")
    private int bjkzt;

    public Ysjbxx(String xmguid, String xmmc, String xsdm, String zblx){
        this.xmguid = xmguid;
        this.xmmc = xmmc;
        this.xsdm = xsdm;
        this.zblx = zblx;
    }

    public String getXmguid() {
        return xmguid;
    }

    public void setXmguid(String xmguid) {
        this.xmguid = xmguid;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getXsdm() {
        return xsdm;
    }

    public void setXsdm(String xsdm) {
        this.xsdm = xsdm;
    }

    public String getZblx() {
        return zblx;
    }

    public void setZblx(String zblx) {
        this.zblx = zblx;
    }

    public String getSqdw() {
        return sqdw;
    }

    public void setSqdw(String sqdw) {
        this.sqdw = sqdw;
    }

    public Date getSqrq() {
        return sqrq;
    }

    public void setSqrq(Date sqrq) {
        this.sqrq = sqrq;
    }

    public String getXmbh() {
        return xmbh;
    }

    public void setXmbh(String xmbh) {
        this.xmbh = xmbh;
    }

    public Double getXmzmj() {
        return xmzmj;
    }

    public void setXmzmj(Double xmzmj) {
        this.xmzmj = xmzmj;
    }

    public Double getNydmj() {
        return nydmj;
    }

    public void setNydmj(Double nydmj) {
        this.nydmj = nydmj;
    }

    public Double getGdmj() {
        return gdmj;
    }

    public void setGdmj(Double gdmj) {
        this.gdmj = gdmj;
    }

    public int getBjkzt() {
        return bjkzt;
    }

    public void setBjkzt(int bjkzt) {
        this.bjkzt = bjkzt;
    }
}
