/*
    It represents Has-A relationship.
    It is a unidirectional association i.e. a one way relationship. For example, department can have students but vice versa is not possible and thus unidirectional in nature.
    In Aggregation, both the entries can survive individually which means ending one entity will not effect the other entity
 */
package aggregation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Aggregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Student s1 = new Student("Tarkeshwar", 1, "CSE");
        Student s2 = new Student("Prabhat", 2, "CSE");
        Student s3 = new Student("Tarun", 1, "EE");
        Student s4 = new Student("Nitin", 2, "EE");
     
        // making a List of 
        // CSE Students.
        List <Student> cse_students = new ArrayList<>();
        cse_students.add(s1);
        cse_students.add(s2);
         
        // making a List of 
        // EE Students
        List <Student> ee_students = new ArrayList<>();
        ee_students.add(s3);
        ee_students.add(s4);
         
        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);
         
        List <Department> departments = new ArrayList<>();
        departments.add(CSE);
        departments.add(EE);
         
        // creating an instance of Institute.
        Institute institute = new Institute("UY Systems", departments);
         
        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());  
    }
    
}
