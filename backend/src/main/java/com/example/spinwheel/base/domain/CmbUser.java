package com.example.spinwheel.base.domain;

import java.util.Date;

public class CmbUser {
    private Long ID;

    private String userID;

    private String password;

    private String mobile;

    private String email;

    private String loginName;

    private String nickName;

    private String realName;

    private String IDNo;

    private String IDType;

    private String chnType;

    private String flag;

    private String remark;

    private String device;

    private String IP;

    private String lat;

    private String appID;

    private Date createTime;

    private String approver;

    private Date approvalTime;

    private String isHot;

    private String newsTypeID;

    private String autoWellChoseFlag;

    private String userType;

    private String relateProductFlag;

    private String proFlag;

    private Date proTime;

    private Integer certificateType;

    private Integer displayType;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID == null ? null : userID.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIDNo() {
        return IDNo;
    }

    public void setIDNo(String IDNo) {
        this.IDNo = IDNo == null ? null : IDNo.trim();
    }

    public String getIDType() {
        return IDType;
    }

    public void setIDType(String IDType) {
        this.IDType = IDType == null ? null : IDType.trim();
    }

    public String getChnType() {
        return chnType;
    }

    public void setChnType(String chnType) {
        this.chnType = chnType == null ? null : chnType.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP == null ? null : IP.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID == null ? null : appID.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot == null ? null : isHot.trim();
    }

    public String getNewsTypeID() {
        return newsTypeID;
    }

    public void setNewsTypeID(String newsTypeID) {
        this.newsTypeID = newsTypeID == null ? null : newsTypeID.trim();
    }

    public String getAutoWellChoseFlag() {
        return autoWellChoseFlag;
    }

    public void setAutoWellChoseFlag(String autoWellChoseFlag) {
        this.autoWellChoseFlag = autoWellChoseFlag == null ? null : autoWellChoseFlag.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getRelateProductFlag() {
        return relateProductFlag;
    }

    public void setRelateProductFlag(String relateProductFlag) {
        this.relateProductFlag = relateProductFlag == null ? null : relateProductFlag.trim();
    }

    public String getProFlag() {
        return proFlag;
    }

    public void setProFlag(String proFlag) {
        this.proFlag = proFlag == null ? null : proFlag.trim();
    }

    public Date getProTime() {
        return proTime;
    }

    public void setProTime(Date proTime) {
        this.proTime = proTime;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public Integer getDisplayType() {
        return displayType;
    }

    public void setDisplayType(Integer displayType) {
        this.displayType = displayType;
    }
}