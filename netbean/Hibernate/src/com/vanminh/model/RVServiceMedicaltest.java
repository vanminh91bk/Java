package com.vanminh.model;
// Generated Jun 3, 2016 3:57:44 PM by Hibernate Tools 4.3.1

import com.vanminh.persistence.HibernateUtil;
import java.util.Date;
import org.hibernate.Session;

/**
 * HisRvLisMedicaltestLpId generated by hbm2java
 */
public class RVServiceMedicaltest implements java.io.Serializable {
    private long RVserviceMedicalTestID;
    private Date created;
    private Integer createdby;
    private String value;
    private String name;
    private String patientTypeID;
    private Date birthday;
    private Character genderID;
    private String address2;
    private String assuranceID;
    private String status;
    private String statusLis;
    private Date actdate;
    private String hisLisCode;
    private String hisLisCodeline;
    private Integer patienthistoryID;
    private Integer serviceID;
    private Integer serviceMedicalTestID;
    private Integer serviceMedicalTestLineID;
    private Integer roomID;
    private String room;
    private String roomValue;
    private Character isInpatient;
    private Integer medicaltestID;
    private Character isEmergency;
    private Integer diseaseDiagnosticID;
    private String fromDepartment;
    private Integer fromDepartmentID;
    private Integer departmentID;
    private String diseaseiagnostic;
    private Integer checkupUserID;
    private String checkupUserName;
    private Integer serviceMedictestgroupID;

    public RVServiceMedicaltest() {
    }

    public long getRVserviceMedicalTestID() {
        return RVserviceMedicalTestID;
    }

    public void setRVserviceMedicalTestID(long RVserviceMedicalTestID) {
        this.RVserviceMedicalTestID = RVserviceMedicalTestID;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientTypeID() {
        return patientTypeID;
    }

    public void setPatientTypeID(String patientTypeID) {
        this.patientTypeID = patientTypeID;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Character getGenderID() {
        return genderID;
    }

    public void setGenderID(Character genderID) {
        this.genderID = genderID;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAssuranceID() {
        return assuranceID;
    }

    public void setAssuranceID(String assuranceID) {
        this.assuranceID = assuranceID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusLis() {
        return statusLis;
    }

    public void setStatusLis(String statusLis) {
        this.statusLis = statusLis;
    }

    public Date getActdate() {
        return actdate;
    }

    public void setActdate(Date actdate) {
        this.actdate = actdate;
    }

    public String getHisLisCode() {
        return hisLisCode;
    }

    public void setHisLisCode(String hisLisCode) {
        this.hisLisCode = hisLisCode;
    }

    public String getHisLisCodeline() {
        return hisLisCodeline;
    }

    public void setHisLisCodeline(String hisLisCodeline) {
        this.hisLisCodeline = hisLisCodeline;
    }

    public Integer getPatienthistoryID() {
        return patienthistoryID;
    }

    public void setPatienthistoryID(Integer patienthistoryID) {
        this.patienthistoryID = patienthistoryID;
    }

    public Integer getServiceID() {
        return serviceID;
    }

    public void setServiceID(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public Integer getServiceMedicalTestID() {
        return serviceMedicalTestID;
    }

    public void setServiceMedicalTestID(Integer serviceMedicalTestID) {
        this.serviceMedicalTestID = serviceMedicalTestID;
    }

    public Integer getServiceMedicalTestLineID() {
        return serviceMedicalTestLineID;
    }

    public void setServiceMedicalTestLineID(Integer serviceMedicalTestLineID) {
        this.serviceMedicalTestLineID = serviceMedicalTestLineID;
    }

    public Integer getRoomID() {
        return roomID;
    }

    public void setRoomID(Integer roomID) {
        this.roomID = roomID;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomValue() {
        return roomValue;
    }

    public void setRoomValue(String roomValue) {
        this.roomValue = roomValue;
    }

    public Character getIsInpatient() {
        return isInpatient;
    }

    public void setIsInpatient(Character isInpatient) {
        this.isInpatient = isInpatient;
    }

    public Integer getMedicaltestID() {
        return medicaltestID;
    }

    public void setMedicaltestID(Integer medicaltestID) {
        this.medicaltestID = medicaltestID;
    }

    public Character getIsEmergency() {
        return isEmergency;
    }

    public void setIsEmergency(Character isEmergency) {
        this.isEmergency = isEmergency;
    }

    public Integer getDiseaseDiagnosticID() {
        return diseaseDiagnosticID;
    }

    public void setDiseaseDiagnosticID(Integer diseaseDiagnosticID) {
        this.diseaseDiagnosticID = diseaseDiagnosticID;
    }

    public String getFromDepartment() {
        return fromDepartment;
    }

    public void setFromDepartment(String fromDepartment) {
        this.fromDepartment = fromDepartment;
    }

    public Integer getFromDepartmentID() {
        return fromDepartmentID;
    }

    public void setFromDepartmentID(Integer fromDepartmentID) {
        this.fromDepartmentID = fromDepartmentID;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getDiseaseiagnostic() {
        return diseaseiagnostic;
    }

    public void setDiseaseiagnostic(String diseaseiagnostic) {
        this.diseaseiagnostic = diseaseiagnostic;
    }

    public Integer getCheckupUserID() {
        return checkupUserID;
    }

    public void setCheckupUserID(Integer checkupUserID) {
        this.checkupUserID = checkupUserID;
    }

    public String getCheckupUserName() {
        return checkupUserName;
    }

    public void setCheckupUserName(String checkupUserName) {
        this.checkupUserName = checkupUserName;
    }

    public Integer getServiceMedictestgroupID() {
        return serviceMedictestgroupID;
    }

    public void setServiceMedictestgroupID(Integer serviceMedictestgroupID) {
        this.serviceMedictestgroupID = serviceMedictestgroupID;
    }

   
}