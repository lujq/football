package com.example.spinwheel.base.domain;

public class SubSclass {
    private Integer subSclassID;

    private Integer sclassid;

    private Boolean isHaveScore;

    private Integer sortNumber;

    private Integer curr_round;

    private Integer count_round;

    private Boolean isCurrentSclass;

    private String subSclassName;

    private String subName_Js;

    private String includeSeason;

    private Boolean isAnalyScore;

    private Boolean isZu;

    private String currentSeason;

    private String ref_orderSeason;

    private Integer ref_orderSubId;

    private Boolean isPrimary;

    public Integer getSubSclassID() {
        return subSclassID;
    }

    public void setSubSclassID(Integer subSclassID) {
        this.subSclassID = subSclassID;
    }

    public Integer getSclassid() {
        return sclassid;
    }

    public void setSclassid(Integer sclassid) {
        this.sclassid = sclassid;
    }

    public Boolean getIsHaveScore() {
        return isHaveScore;
    }

    public void setIsHaveScore(Boolean isHaveScore) {
        this.isHaveScore = isHaveScore;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Integer getCurr_round() {
        return curr_round;
    }

    public void setCurr_round(Integer curr_round) {
        this.curr_round = curr_round;
    }

    public Integer getCount_round() {
        return count_round;
    }

    public void setCount_round(Integer count_round) {
        this.count_round = count_round;
    }

    public Boolean getIsCurrentSclass() {
        return isCurrentSclass;
    }

    public void setIsCurrentSclass(Boolean isCurrentSclass) {
        this.isCurrentSclass = isCurrentSclass;
    }

    public String getSubSclassName() {
        return subSclassName;
    }

    public void setSubSclassName(String subSclassName) {
        this.subSclassName = subSclassName == null ? null : subSclassName.trim();
    }

    public String getSubName_Js() {
        return subName_Js;
    }

    public void setSubName_Js(String subName_Js) {
        this.subName_Js = subName_Js == null ? null : subName_Js.trim();
    }

    public String getIncludeSeason() {
        return includeSeason;
    }

    public void setIncludeSeason(String includeSeason) {
        this.includeSeason = includeSeason == null ? null : includeSeason.trim();
    }

    public Boolean getIsAnalyScore() {
        return isAnalyScore;
    }

    public void setIsAnalyScore(Boolean isAnalyScore) {
        this.isAnalyScore = isAnalyScore;
    }

    public Boolean getIsZu() {
        return isZu;
    }

    public void setIsZu(Boolean isZu) {
        this.isZu = isZu;
    }

    public String getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(String currentSeason) {
        this.currentSeason = currentSeason == null ? null : currentSeason.trim();
    }

    public String getRef_orderSeason() {
        return ref_orderSeason;
    }

    public void setRef_orderSeason(String ref_orderSeason) {
        this.ref_orderSeason = ref_orderSeason == null ? null : ref_orderSeason.trim();
    }

    public Integer getRef_orderSubId() {
        return ref_orderSubId;
    }

    public void setRef_orderSubId(Integer ref_orderSubId) {
        this.ref_orderSubId = ref_orderSubId;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }
}