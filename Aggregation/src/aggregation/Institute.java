/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

import java.util.List;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Institute {
    String instituteName;
    private List<Department> departments;

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public Institute(String instituteName) {
        this.instituteName = instituteName;
    }

    public Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }
    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Student> students; 
        for(Department dept : departments)
        {
            students = dept.getStudents();
            for(Student s : students)
            { System.out.println(""+s);
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
