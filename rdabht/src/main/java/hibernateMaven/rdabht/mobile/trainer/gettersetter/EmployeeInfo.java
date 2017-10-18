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
public class EmployeeInfo {
     private Integer eid;
     private String ename;
     private String emppic;
     private String designation;
     private String whtasapp;
     private String localnum;
     private String skype;
     private String dropbox;
     private String email;
     private Date dob;
     private String password;
     private String passportno;
     private Date passportExpiry;
     private String visaNo;
     private Date visaExpiry;
     private Date doj;
     private Date dor;
     private int statusId;
     private String experence;
     private String nationality;
     private String qulification;
     private String skillset;
     private String resetToken;
     private Date resetDate;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmppic() {
        return emppic;
    }

    public void setEmppic(String emppic) {
        this.emppic = emppic;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getWhtasapp() {
        return whtasapp;
    }

    public void setWhtasapp(String whtasapp) {
        this.whtasapp = whtasapp;
    }

    public String getLocalnum() {
        return localnum;
    }

    public void setLocalnum(String localnum) {
        this.localnum = localnum;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getDropbox() {
        return dropbox;
    }

    public void setDropbox(String dropbox) {
        this.dropbox = dropbox;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassportno() {
        return passportno;
    }

    public void setPassportno(String passportno) {
        this.passportno = passportno;
    }

    public Date getPassportExpiry() {
        return passportExpiry;
    }

    public void setPassportExpiry(Date passportExpiry) {
        this.passportExpiry = passportExpiry;
    }

    public String getVisaNo() {
        return visaNo;
    }

    public void setVisaNo(String visaNo) {
        this.visaNo = visaNo;
    }

    public Date getVisaExpiry() {
        return visaExpiry;
    }

    public void setVisaExpiry(Date visaExpiry) {
        this.visaExpiry = visaExpiry;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Date getDor() {
        return dor;
    }

    public void setDor(Date dor) {
        this.dor = dor;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getExperence() {
        return experence;
    }

    public void setExperence(String experence) {
        this.experence = experence;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getQulification() {
        return qulification;
    }

    public void setQulification(String qulification) {
        this.qulification = qulification;
    }

    public String getSkillset() {
        return skillset;
    }

    public void setSkillset(String skillset) {
        this.skillset = skillset;
    }

    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public Date getResetDate() {
        return resetDate;
    }

    public void setResetDate(Date resetDate) {
        this.resetDate = resetDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.eid);
        hash = 47 * hash + Objects.hashCode(this.ename);
        hash = 47 * hash + Objects.hashCode(this.emppic);
        hash = 47 * hash + Objects.hashCode(this.designation);
        hash = 47 * hash + Objects.hashCode(this.whtasapp);
        hash = 47 * hash + Objects.hashCode(this.localnum);
        hash = 47 * hash + Objects.hashCode(this.skype);
        hash = 47 * hash + Objects.hashCode(this.dropbox);
        hash = 47 * hash + Objects.hashCode(this.email);
        hash = 47 * hash + Objects.hashCode(this.dob);
        hash = 47 * hash + Objects.hashCode(this.password);
        hash = 47 * hash + Objects.hashCode(this.passportno);
        hash = 47 * hash + Objects.hashCode(this.passportExpiry);
        hash = 47 * hash + Objects.hashCode(this.visaNo);
        hash = 47 * hash + Objects.hashCode(this.visaExpiry);
        hash = 47 * hash + Objects.hashCode(this.doj);
        hash = 47 * hash + Objects.hashCode(this.dor);
        hash = 47 * hash + this.statusId;
        hash = 47 * hash + Objects.hashCode(this.experence);
        hash = 47 * hash + Objects.hashCode(this.nationality);
        hash = 47 * hash + Objects.hashCode(this.qulification);
        hash = 47 * hash + Objects.hashCode(this.skillset);
        hash = 47 * hash + Objects.hashCode(this.resetToken);
        hash = 47 * hash + Objects.hashCode(this.resetDate);
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
        final EmployeeInfo other = (EmployeeInfo) obj;
        if (this.statusId != other.statusId) {
            return false;
        }
        if (!Objects.equals(this.ename, other.ename)) {
            return false;
        }
        if (!Objects.equals(this.emppic, other.emppic)) {
            return false;
        }
        if (!Objects.equals(this.designation, other.designation)) {
            return false;
        }
        if (!Objects.equals(this.whtasapp, other.whtasapp)) {
            return false;
        }
        if (!Objects.equals(this.localnum, other.localnum)) {
            return false;
        }
        if (!Objects.equals(this.skype, other.skype)) {
            return false;
        }
        if (!Objects.equals(this.dropbox, other.dropbox)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.passportno, other.passportno)) {
            return false;
        }
        if (!Objects.equals(this.visaNo, other.visaNo)) {
            return false;
        }
        if (!Objects.equals(this.experence, other.experence)) {
            return false;
        }
        if (!Objects.equals(this.nationality, other.nationality)) {
            return false;
        }
        if (!Objects.equals(this.qulification, other.qulification)) {
            return false;
        }
        if (!Objects.equals(this.skillset, other.skillset)) {
            return false;
        }
        if (!Objects.equals(this.resetToken, other.resetToken)) {
            return false;
        }
        if (!Objects.equals(this.eid, other.eid)) {
            return false;
        }
        if (!Objects.equals(this.dob, other.dob)) {
            return false;
        }
        if (!Objects.equals(this.passportExpiry, other.passportExpiry)) {
            return false;
        }
        if (!Objects.equals(this.visaExpiry, other.visaExpiry)) {
            return false;
        }
        if (!Objects.equals(this.doj, other.doj)) {
            return false;
        }
        if (!Objects.equals(this.dor, other.dor)) {
            return false;
        }
        if (!Objects.equals(this.resetDate, other.resetDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" + "eid=" + eid + ", ename=" + ename + ", emppic=" + emppic + ", designation=" + designation + ", whtasapp=" + whtasapp + ", localnum=" + localnum + ", skype=" + skype + ", dropbox=" + dropbox + ", email=" + email + ", dob=" + dob + ", password=" + password + ", passportno=" + passportno + ", passportExpiry=" + passportExpiry + ", visaNo=" + visaNo + ", visaExpiry=" + visaExpiry + ", doj=" + doj + ", dor=" + dor + ", statusId=" + statusId + ", experence=" + experence + ", nationality=" + nationality + ", qulification=" + qulification + ", skillset=" + skillset + ", resetToken=" + resetToken + ", resetDate=" + resetDate + '}';
    }
         
}
