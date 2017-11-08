/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceaggregationassociationcomposition;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Project {
    private boolean success;
    private Manager manager;
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Project(Manager manager) {
        this.manager=manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    
    
}
