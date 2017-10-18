/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mobile.monitor.gettersetter.UniversityGetSet;
import mobile.trainer.gettersetter.BatchScheduleTrainer;
import mobile.trainer.gettersetter.EmployeeInfo;
import model.Batchschedule;
import model.Employees;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Tool {

    public static boolean mapUniversity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public EmployeeInfo prepareGetSet(Employees employees) {
        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setDesignation(employees.getDesignation());
        employeeInfo.setDropbox(employees.getDropbox());
        employeeInfo.setDob(employees.getDob());
        employeeInfo.setDoj(employees.getDoj());
        employeeInfo.setDor(employees.getDor());
        employeeInfo.setEid(employees.getEid());
        employeeInfo.setEmail(employees.getEmail());
        employeeInfo.setEname(employees.getEname());
        employeeInfo.setExperence(employees.getExperence());
        employeeInfo.setLocalnum(employees.getLocalnum());
        employeeInfo.setNationality(employees.getNationality());
        employeeInfo.setPassportExpiry(employees.getPassportExpiry());
        employeeInfo.setPassportno(employees.getPassportno());
        employeeInfo.setQulification(employees.getQulification());
        employeeInfo.setSkillset(employees.getSkillset());
        employeeInfo.setSkype(employees.getSkype());
        employeeInfo.setVisaExpiry(employees.getVisaExpiry());
        employeeInfo.setVisaNo(employees.getVisaNo());
        employeeInfo.setWhtasapp(employees.getWhtasapp());
        employeeInfo.setResetToken(employees.getResetToken());
        employeeInfo.setResetDate(employees.getResetDate());
        return employeeInfo;
    }
//List to prepare for trainer
    
    public static List<BatchScheduleTrainer> prepareGetSetSchedule(List employees) {
        List<BatchScheduleTrainer> l = new ArrayList();
        System.out.println("List Size to Retrive " + employees.size());
        for (int i = 0; i < employees.size(); i++) {
            Batchschedule b = (Batchschedule) employees.get(i);
            BatchScheduleTrainer bst = new BatchScheduleTrainer();
            bst.setRemark(b.getRemark());
            bst.setBatchCode(b.getBatch().getBatchcode());
            bst.setCourse(b.getBatch().getCourses().getCname());
            bst.setDivisionName(b.getBatch().getDivision().getDname());
            bst.setEmail(b.getBatch().getEmployeesByTechTrainer().getEname());
            // bst.setSoftSkillEmail(b.getBatch().getEmployeesBySoftSkillTrainer().getEname());
            bst.setEndTime(b.getEtime());
            bst.setStartTime(b.getStime());
            bst.setPhone(b.getBatch().getEmployeesByTechTrainer().getLocalnum());
            //  bst.setSoftSkillPhone(b.getBatch().getEmployeesBySoftSkillTrainer().getLocalnum());
            bst.setScheduleid(b.getSid());
            bst.setSkypeId(b.getBatch().getEmployeesByTechTrainer().getEname());
            // bst.setSoftSkillSkypeId(b.getBatch().getEmployeesBySoftSkillTrainer().getEname());
            bst.setStartDate(b.getSdate());
            bst.setStatus(b.getStatus());
            bst.setWhatsAppNo(b.getBatch().getEmployeesByTechTrainer().getWhtasapp());
            // bst.setSoftSkillWhatsAppNo(b.getBatch().getEmployeesBySoftSkillTrainer().getWhtasapp());
            //bst.setsTrainer(b.getBatch().getEmployeesBySoftSkillTrainer().getEname());
            bst.settTrainer(b.getBatch().getEmployeesByTechTrainer().getEname());
            bst.setUniversity(b.getBatch().getUniversity().getUniversityName());
            l.add(bst);
        }
        return l;
    }

    public static List<UniversityGetSet> prepareGetSetUniversity(List employees) {
        List<UniversityGetSet> l = new ArrayList();
        //System.out.println("List Size to Retrive " + employees.size());
        if(employees.size()>0){
        for (int i = 0; i < employees.size(); i++) {
            
            Batchschedule b = (Batchschedule) employees.get(i);
            UniversityGetSet bst = new UniversityGetSet();
             try{
            bst.setLongitute(b.getBatch().getUniversity().getLng());
            bst.setLatitute(b.getBatch().getUniversity().getLat());
            bst.setRemark(b.getRemark());
            bst.setUniversityName(b.getBatch().getUniversity().getUniversityName());
            bst.setBatchCode(b.getBatch().getBatchcode());
            bst.setCourse(b.getBatch().getCourses().getCname());
            bst.setDivisionName(b.getBatch().getDivision().getDname());
           bst.setEmail(b.getBatch().getEmployeesByTechTrainer().getEname());
            bst.setEndTime(b.getEtime());
            bst.setStartTime(b.getStime());
            bst.setPhone(b.getBatch().getEmployeesByTechTrainer().getLocalnum());
            bst.setScheduleid(b.getSid());
            bst.setSkypeId(b.getBatch().getEmployeesByTechTrainer().getEname());
            bst.setStatus(b.getStatus());
            bst.setWhatsAppNo(b.getBatch().getEmployeesByTechTrainer().getWhtasapp());
            bst.settTrainer(b.getBatch().getEmployeesByTechTrainer().getEname());            
            l.add(bst);
            }catch(Exception e){ 
                System.out.println(b);
                bst.setEmail("No Email");
             bst.setEndTime(new Date());}
        }
        }else{return null;}
        return l;
    }
}
