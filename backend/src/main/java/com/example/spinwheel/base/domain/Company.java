package com.example.spinwheel.base.domain;

public class Company {
    private Short companyID;

    private String name_Cn;

    private Boolean isLetgoal;

    private Boolean isTotalScore;

    private Boolean isStandard;

    private Byte asianOrder;

    private Byte overDownOrder;

    private Byte standardOrder;

    private Boolean isHalf;

    private Integer isRun;

    private Integer isSpecial;

    public Short getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Short companyID) {
        this.companyID = companyID;
    }

    public String getName_Cn() {
        return name_Cn;
    }

    public void setName_Cn(String name_Cn) {
        this.name_Cn = name_Cn == null ? null : name_Cn.trim();
    }

    public Boolean getIsLetgoal() {
        return isLetgoal;
    }

    public void setIsLetgoal(Boolean isLetgoal) {
        this.isLetgoal = isLetgoal;
    }

    public Boolean getIsTotalScore() {
        return isTotalScore;
    }

    public void setIsTotalScore(Boolean isTotalScore) {
        this.isTotalScore = isTotalScore;
    }

    public Boolean getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(Boolean isStandard) {
        this.isStandard = isStandard;
    }

    public Byte getAsianOrder() {
        return asianOrder;
    }

    public void setAsianOrder(Byte asianOrder) {
        this.asianOrder = asianOrder;
    }

    public Byte getOverDownOrder() {
        return overDownOrder;
    }

    public void setOverDownOrder(Byte overDownOrder) {
        this.overDownOrder = overDownOrder;
    }

    public Byte getStandardOrder() {
        return standardOrder;
    }

    public void setStandardOrder(Byte standardOrder) {
        this.standardOrder = standardOrder;
    }

    public Boolean getIsHalf() {
        return isHalf;
    }

    public void setIsHalf(Boolean isHalf) {
        this.isHalf = isHalf;
    }

    public Integer getIsRun() {
        return isRun;
    }

    public void setIsRun(Integer isRun) {
        this.isRun = isRun;
    }

    public Integer getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(Integer isSpecial) {
        this.isSpecial = isSpecial;
    }
}