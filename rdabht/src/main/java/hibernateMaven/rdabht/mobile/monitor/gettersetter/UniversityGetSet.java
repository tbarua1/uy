/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.monitor.gettersetter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Abhishek.Sehgal
 */
public class UniversityGetSet {
   private Date startTime, endTime;
    private String remark, status, batchCode, tTrainer, sTrainer, whatsAppNo, skypeId, phone,
            email, divisionName, course,softSkillEmail,softSkillPhone,softSkillSkypeId,
            softSkillWhatsAppNo,universityName;
    private Integer scheduleid;
    private BigDecimal latitute,longitute;

    @Override
    public String toString() {
        return "UniversityGetSet{" + "startTime=" + startTime + ", endTime=" + endTime + ", remark=" + remark + ", status=" + status + ", batchCode=" + batchCode + ", tTrainer=" + tTrainer + ", sTrainer=" + sTrainer + ", whatsAppNo=" + whatsAppNo + ", skypeId=" + skypeId + ", phone=" + phone + ", email=" + email + ", divisionName=" + divisionName + ", course=" + course + ", softSkillEmail=" + softSkillEmail + ", softSkillPhone=" + softSkillPhone + ", softSkillSkypeId=" + softSkillSkypeId + ", softSkillWhatsAppNo=" + softSkillWhatsAppNo + ", universityName=" + universityName + ", scheduleid=" + scheduleid + ", latitute=" + latitute + ", longitute=" + longitute + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.startTime);
        hash = 79 * hash + Objects.hashCode(this.endTime);
        hash = 79 * hash + Objects.hashCode(this.remark);
        hash = 79 * hash + Objects.hashCode(this.status);
        hash = 79 * hash + Objects.hashCode(this.batchCode);
        hash = 79 * hash + Objects.hashCode(this.tTrainer);
        hash = 79 * hash + Objects.hashCode(this.sTrainer);
        hash = 79 * hash + Objects.hashCode(this.whatsAppNo);
        hash = 79 * hash + Objects.hashCode(this.skypeId);
        hash = 79 * hash + Objects.hashCode(this.phone);
        hash = 79 * hash + Objects.hashCode(this.email);
        hash = 79 * hash + Objects.hashCode(this.divisionName);
        hash = 79 * hash + Objects.hashCode(this.course);
        hash = 79 * hash + Objects.hashCode(this.softSkillEmail);
        hash = 79 * hash + Objects.hashCode(this.softSkillPhone);
        hash = 79 * hash + Objects.hashCode(this.softSkillSkypeId);
        hash = 79 * hash + Objects.hashCode(this.softSkillWhatsAppNo);
        hash = 79 * hash + Objects.hashCode(this.universityName);
        hash = 79 * hash + Objects.hashCode(this.scheduleid);
        hash = 79 * hash + Objects.hashCode(this.latitute);
        hash = 79 * hash + Objects.hashCode(this.longitute);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UniversityGetSet other = (UniversityGetSet) obj;
        if (!Objects.equals(this.remark, other.remark)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.batchCode, other.batchCode)) {
            return false;
        }
        if (!Objects.equals(this.tTrainer, other.tTrainer)) {
            return false;
        }
        if (!Objects.equals(this.sTrainer, other.sTrainer)) {
            return false;
        }
        if (!Objects.equals(this.whatsAppNo, other.whatsAppNo)) {
            return false;
        }
        if (!Objects.equals(this.skypeId, other.skypeId)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.divisionName, other.divisionName)) {
            return false;
        }
        if (!Objects.equals(this.course, other.course)) {
            return false;
        }
        if (!Objects.equals(this.softSkillEmail, other.softSkillEmail)) {
            return false;
        }
        if (!Objects.equals(this.softSkillPhone, other.softSkillPhone)) {
            return false;
        }
        if (!Objects.equals(this.softSkillSkypeId, other.softSkillSkypeId)) {
            return false;
        }
        if (!Objects.equals(this.softSkillWhatsAppNo, other.softSkillWhatsAppNo)) {
            return false;
        }
        if (!Objects.equals(this.universityName, other.universityName)) {
            return false;
        }
        if (!Objects.equals(this.startTime, other.startTime)) {
            return false;
        }
        if (!Objects.equals(this.endTime, other.endTime)) {
            return false;
        }
        if (!Objects.equals(this.scheduleid, other.scheduleid)) {
            return false;
        }
        if (!Objects.equals(this.latitute, other.latitute)) {
            return false;
        }
        if (!Objects.equals(this.longitute, other.longitute)) {
            return false;
        }
        return true;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String gettTrainer() {
        return tTrainer;
    }

    public void settTrainer(String tTrainer) {
        this.tTrainer = tTrainer;
    }

    public String getsTrainer() {
        return sTrainer;
    }

    public void setsTrainer(String sTrainer) {
        this.sTrainer = sTrainer;
    }

    public String getWhatsAppNo() {
        return whatsAppNo;
    }

    public void setWhatsAppNo(String whatsAppNo) {
        this.whatsAppNo = whatsAppNo;
    }

    public String getSkypeId() {
        return skypeId;
    }

    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSoftSkillEmail() {
        return softSkillEmail;
    }

    public void setSoftSkillEmail(String softSkillEmail) {
        this.softSkillEmail = softSkillEmail;
    }

    public String getSoftSkillPhone() {
        return softSkillPhone;
    }

    public void setSoftSkillPhone(String softSkillPhone) {
        this.softSkillPhone = softSkillPhone;
    }

    public String getSoftSkillSkypeId() {
        return softSkillSkypeId;
    }

    public void setSoftSkillSkypeId(String softSkillSkypeId) {
        this.softSkillSkypeId = softSkillSkypeId;
    }

    public String getSoftSkillWhatsAppNo() {
        return softSkillWhatsAppNo;
    }

    public void setSoftSkillWhatsAppNo(String softSkillWhatsAppNo) {
        this.softSkillWhatsAppNo = softSkillWhatsAppNo;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public BigDecimal getLatitute() {
        return latitute;
    }

    public void setLatitute(BigDecimal latitute) {
        this.latitute = latitute;
    }

    public BigDecimal getLongitute() {
        return longitute;
    }

    public void setLongitute(BigDecimal longitute) {
        this.longitute = longitute;
    }

 
}
