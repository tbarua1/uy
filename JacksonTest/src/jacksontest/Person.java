/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacksontest;

import java.util.Objects;

/**
 *
 * @author uys41
 */
public class Person {
    private Integer pid;
    private String pname;
    private Double psalary;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPsalary() {
        return psalary;
    }

    public void setPsalary(Double psalary) {
        this.psalary = psalary;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.pid);
        hash = 97 * hash + Objects.hashCode(this.pname);
        hash = 97 * hash + Objects.hashCode(this.psalary);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.pname, other.pname)) {
            return false;
        }
        if (!Objects.equals(this.pid, other.pid)) {
            return false;
        }
        if (!Objects.equals(this.psalary, other.psalary)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "pid=" + pid + ", pname=" + pname + ", psalary=" + psalary + '}';
    }

    public Person(Integer pid, String pname, Double psalary) {
        this.pid = pid;
        this.pname = pname;
        this.psalary = psalary;
    }

    public Person() {
    }
    
}
