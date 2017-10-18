package java;


import java.util.List;
import java.model.Batch;
import java.model.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek.Sehgal
 */
public class TestApplication {
    public static void main(String[] args) {
//        Configuration configuration = new Configuration();
//        Configuration configure = configuration.configure();
//        SessionFactory buildSessionFactory = configure.buildSessionFactory();

Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry
                    = new StandardServiceRegistryBuilder()
                            .applySettings(configuration.getProperties()).build();
           SessionFactory buildSessionFactory= configuration.buildSessionFactory(serviceRegistry);

        Session openSession = buildSessionFactory.openSession();
        Transaction beginTransaction = openSession.beginTransaction();
        List list = openSession.createCriteria(Batch.class).list();
        System.out.println("Retrived Record "+list.size());
        //list.forEach((o)->{System.out.println(""+o.toString());});
        list.forEach((o)->{
            //System.out.println("Object - "+o);
        Batch e=(Batch) o;
            Employees employees = e.getEmployeesByTechTrainer();
            System.out.println(employees.getDivision().getDname()+" "+e.getSchedule()+" "+e.getBatchcode()+" "+employees.getEname());
            
        });
        beginTransaction.commit();
        openSession.close();
        buildSessionFactory.close();
        
    }
}
