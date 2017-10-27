/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceaggregationassociationcomposition;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Manager extends Employee{
    private List<Worker> worker=new ArrayList<>();    
    private int salary;
    private AccessCard card;

    public List<Worker> getWorker() {
        return worker;
    }

    public void setWorker(List<Worker> worker) {
        this.worker = worker;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
