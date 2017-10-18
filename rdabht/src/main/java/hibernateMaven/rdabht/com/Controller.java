/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.Batchschedule;
import model.Employees;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Controller {

    private static SessionFactory factory;
    private static Batchschedule b = null;

    public static List mapUniversity() {
        Session currentSession = getSessionFactory().openSession();
        Transaction beginTransaction = currentSession.beginTransaction();
        Criteria createCriteria = currentSession.createCriteria(Batchschedule.class);
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.HOUR_OF_DAY, 0);
        instance.set(Calendar.MINUTE, 0);
        Calendar instance1 = Calendar.getInstance();
        instance1.set(Calendar.HOUR_OF_DAY, 23);
        instance1.set(Calendar.MINUTE, 59);
        Date time = instance.getTime();
        Date time1 = instance1.getTime();
        System.out.println(time1 + " Date - " + time);
        createCriteria.add(Restrictions.between("sdate", time, time1));
        beginTransaction.commit();
        //currentSession.close();
        List list = createCriteria.list();
        if (list.size() < 1) {
            return null;
        } else {
            return list;
        }
    }

    public static List mapUniversity1() {
        Session currentSession = getSessionFactory().openSession();
        Transaction beginTransaction = currentSession.beginTransaction();
        Criteria createCriteria = currentSession.createCriteria(Batchschedule.class);
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.HOUR_OF_DAY, 0);
        instance.set(Calendar.MINUTE, 0);
        Calendar instance1 = Calendar.getInstance();
        instance1.set(Calendar.HOUR_OF_DAY, 23);
        instance1.set(Calendar.MINUTE, 59);
        Date time = instance.getTime();
        Date time1 = instance1.getTime();
        System.out.println(time1 + " Date - " + time);
        createCriteria.add(Restrictions.between("sdate", time, time1));
        createCriteria.setProjection(Projections.projectionList().add(Projections.groupProperty("batch")));
        beginTransaction.commit();
        //currentSession.close();
        List list = createCriteria.list();
        if (list.size() < 1) {
            return null;
        } else {
            return list;
        }
    }

    private Controller() {
    }

    public static SessionFactory getSessionFactory() {
        if (factory == null) {
            System.out.println("Null Factory");
//            Configuration configuration = new Configuration();
//            Configuration configure = configuration.configure();
//            return configure.buildSessionFactory();
  Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry
                    = new StandardServiceRegistryBuilder()
                            .applySettings(configuration.getProperties()).build();
            return configuration.buildSessionFactory(serviceRegistry);
          
        }
        return factory;
    }

    public static Object loginTrainer(String username, String password) throws IOException {
        Session currentSession = getSessionFactory().openSession();
        Transaction beginTransaction = currentSession.beginTransaction();
        Criteria createCriteria = currentSession.createCriteria(Employees.class);
        createCriteria.add(Restrictions.eq("skype", username));
        createCriteria.add(Restrictions.eq("password", password));
        // createCriteria.add(Restrictions.eq("status_id", "Working"));
        List list = createCriteria.list();
        beginTransaction.commit();
        //currentSession.close();
        if (list.size() < 1) {
            return null;
        } else {
            return list.get(0);
        }
    }

    public static String updateSchedule(Integer ScheduleId, String status) {
        Session currentSession = getSessionFactory().openSession();
        Transaction beginTransaction = currentSession.beginTransaction();
        Batchschedule get = (Batchschedule) currentSession.get(Batchschedule.class, ScheduleId);
        get.setStatus(status);
        currentSession.update(get);
        beginTransaction.commit();
        //currentSession.close();
        return "done";
    }
// to Display records for trainer
    public static List getBatchSchedule4Trainer(String skype) throws IOException {
       
        System.out.println("Looking for skype id= "+skype);
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.HOUR_OF_DAY, 0);
        instance.set(Calendar.MINUTE, 0);
        Calendar instance1 = Calendar.getInstance();
        instance1.set(Calendar.HOUR_OF_DAY, 23);
        instance1.set(Calendar.MINUTE, 59);
        Date time = instance.getTime();
        Date time1 = instance1.getTime();
        Session currentSession = getSessionFactory().openSession();
        List l = new ArrayList();
        Transaction beginTransaction = currentSession.beginTransaction();
        Criteria createCriteria = currentSession.createCriteria(Batchschedule.class);
        createCriteria.add(Restrictions.ge("sdate", time));
        createCriteria.add(Restrictions.le("sdate", time1));
        //createCriteria.add(Restrictions.eq("status", "started"));
       // createCriteria.add(Restrictions.eq("status", "scheduled"));
        List list = createCriteria.list();
        System.out.println("List Size " + list.size());
        beginTransaction.commit();
        // currentSession.close();
        if (list.size() < 1) {
            return null;
        } else {

            try {
               // System.out.println("i am in else condition");
                list.forEach((o) -> {
                    b = (Batchschedule) o;
                     System.out.println(b.getBatch().getEmployeesByTechTrainer().getSkype()+" "+b);
                    if (b.getBatch().getEmployeesByTechTrainer().getSkype().equalsIgnoreCase(skype)) {
                        l.add(b);
                    }
                });
            } catch (Exception e) {
                System.out.println("Error" + b);
            }
            return l;
        }
    }
    public static List getBatchSchedule4Trainer1(String skype) throws IOException {
       
        System.out.println("Looking for skype id= "+skype);
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.HOUR_OF_DAY, 0);
        instance.set(Calendar.MINUTE, 0);
        Calendar instance1 = Calendar.getInstance();
        instance1.set(Calendar.HOUR_OF_DAY, 23);
        instance1.set(Calendar.MINUTE, 59);
        Date time = instance.getTime();
        Date time1 = instance1.getTime();
        Session currentSession = getSessionFactory().openSession();
        List l = new ArrayList();
        Transaction beginTransaction = currentSession.beginTransaction();
        Criteria createCriteria = currentSession.createCriteria(Batchschedule.class);
        createCriteria.add(Restrictions.ge("sdate", time));
        createCriteria.add(Restrictions.le("sdate", time1));
        //createCriteria.add(Restrictions.eq("status", "started"));
       // createCriteria.add(Restrictions.eq("status", "scheduled"));
        List list = createCriteria.list();
        System.out.println("List Size " + list.size());
        beginTransaction.commit();
        // currentSession.close();
        if (list.size() < 1) {
            return null;
        } else {

            try {
               // System.out.println("i am in else condition");
                list.forEach((o) -> {
                    b = (Batchschedule) o;
                     System.out.println(b.getBatch().getEmployeesByTechTrainer().getSkype()+" "+b);
                    if (b.getBatch().getEmployeesByTechTrainer().getSkype().equalsIgnoreCase(skype)) {
                        l.add(b);
                    }
                });
            } catch (Exception e) {
                System.out.println("Error" + b);
            }
            return l;
        }
    }
}
