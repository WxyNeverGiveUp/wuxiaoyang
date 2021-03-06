package com.pandawork.nenu.oa.common.dto.business;

import javax.persistence.Column;
import javax.xml.crypto.Data;
import java.sql.Date;

/**
 * 申请新协议学生信息详情
 * User: fujia
 * Date: 2016/7/12
 * Time: 14:27
 */
public class NewProtocolInfoDto {
    //学生基本信息id
    private Integer id;

    //学籍表id
    private Integer statusInfoId;

    //姓名
    private String name;

    //身份证号
    private String idNumber;

    //学号
    private String studentNumber;

    //考生号
    private String candidateNumber;

    //所在年级
    private Integer grade;

    //师范生类别代码
    private Integer normalStuCode;

    //师范生类别
    private String normalStu;

    //培养方式代码
    private Integer trainingModeCode;

    //培养方式
    private String trainingMode;

    //申请原因
    private Integer protocolType;

    //所在院系、分院
    private String college;

    //生源所在地代码
    private Integer originPlaceCode;

    //生源所在地
    private String originPlace;

    //生源地类型
    private Integer originPlaceClass;

    //生源地类型名称
    private String originPlaceClassName;

    //手机号码
    private String cellphone;

    //手机号码(备用)
    private String cellphoneBak;

    //定向委培单位地址
    private String weipeiUnitLocation;

    //定向委培单位
    private String weipeiUnit;

    //已有协议编号
    private String agreementNumber;

    //是否为当前状态 1是0否
    private Integer currentStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNormalStu() {
        return normalStu;
    }

    public void setNormalStu(String normalStu) {
        this.normalStu = normalStu;
    }

    public String getTrainingMode() {
        return trainingMode;
    }

    public void setTrainingMode(String trainingMode) {
        this.trainingMode = trainingMode;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    public void setWeipeiUnitLocation(String weipeiUnitLocation) {
        this.weipeiUnitLocation = weipeiUnitLocation;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCandidateNumber() {
        return candidateNumber;
    }

    public void setCandidateNumber(String candidateNumber) {
        this.candidateNumber = candidateNumber;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getNormalStuCode() {
        return normalStuCode;
    }

    public void setNormalStuCode(Integer normalStuCode) {
        this.normalStuCode = normalStuCode;
    }

    public Integer getTrainingModeCode() {
        return trainingModeCode;
    }

    public void setTrainingModeCode(Integer trainingModeCode) {
        this.trainingModeCode = trainingModeCode;
    }

    public Integer getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
    }

    public Integer getOriginPlaceCode() {
        return originPlaceCode;
    }

    public void setOriginPlaceCode(Integer originPlaceCode) {
        this.originPlaceCode = originPlaceCode;
    }

    public Integer getOriginPlaceClass() {
        return originPlaceClass;
    }

    public void setOriginPlaceClass(Integer originPlaceClass) {
        this.originPlaceClass = originPlaceClass;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getCellphoneBak() {
        return cellphoneBak;
    }

    public void setCellphoneBak(String cellphoneBak) {
        this.cellphoneBak = cellphoneBak;
    }

    public String getWeipeiUnit() {
        return weipeiUnit;
    }

    public void setWeipeiUnit(String weipeiUnit) {
        this.weipeiUnit = weipeiUnit;
    }

    public String getWeipeiUnitLocation() {
        return weipeiUnitLocation;
    }

    public Integer getStatusInfoId() {
        return statusInfoId;
    }

    public void setStatusInfoId(Integer statusInfoId) {
        this.statusInfoId = statusInfoId;
    }

    public String getOriginPlaceClassName() {
        return originPlaceClassName;
    }

    public void setOriginPlaceClassName(String originPlaceClassName) {
        this.originPlaceClassName = originPlaceClassName;
    }

    public String getAgreementNumber() {
        return agreementNumber;
    }

    public void setAgreementNumber(String agreementNumber) {
        this.agreementNumber = agreementNumber;
    }

    public Integer getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Integer currentStatus) {
        this.currentStatus = currentStatus;
    }
}

