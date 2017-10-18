/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.trainer.gettersetter;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Abhishek.Sehgal
 */
public class BatchScheduleTrainer {

    private Date startDate, startTime, endTime;
    private String remark, status, batchCode, tTrainer, sTrainer, whatsAppNo, skypeId, phone,university,
            email, divisionName, course,softSkillEmail,softSkillPhone,softSkillSkypeId,softSkillWhatsAppNo;
    private Integer scheduleid;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
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

    @Override
    public String toString() {
        return "BatchScheduleTrainer{" + "startDate=" + startDate + ", startTime=" + startTime + ", endTime=" + endTime + ", remark=" + remark + ", status=" + status + ", batchCode=" + batchCode + ", tTrainer=" + tTrainer + ", sTrainer=" + sTrainer + ", whatsAppNo=" + whatsAppNo + ", skypeId=" + skypeId + ", phone=" + phone + ", email=" + email + ", divisionName=" + divisionName + ", course=" + course + ", scheduleid=" + scheduleid + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.startDate);
        hash = 37 * hash + Objects.hashCode(this.startTime);
        hash = 37 * hash + Objects.hashCode(this.endTime);
        hash = 37 * hash + Objects.hashCode(this.remark);
        hash = 37 * hash + Objects.hashCode(this.status);
        hash = 37 * hash + Objects.hashCode(this.batchCode);
        hash = 37 * hash + Objects.hashCode(this.tTrainer);
        hash = 37 * hash + Objects.hashCode(this.sTrainer);
        hash = 37 * hash + Objects.hashCode(this.whatsAppNo);
        hash = 37 * hash + Objects.hashCode(this.skypeId);
        hash = 37 * hash + Objects.hashCode(this.phone);
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.divisionName);
        hash = 37 * hash + Objects.hashCode(this.course);
        hash = 37 * hash + Objects.hashCode(this.scheduleid);
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
        final BatchScheduleTrainer other = (BatchScheduleTrainer) obj;
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
        if (!Objects.equals(this.startDate, other.startDate)) {
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
        return true;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }


}
