package chatusingthreat.server;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class DatabaseHandeling {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/salesreport";
    static final String BLANK_URL = "jdbc:mysql://localhost";
    String DATABASE_NAME = "abacus";
    String CREATE_TABLE = "CREATE TABLE enroll(enroll INTEGER NOT NULL, u_id VARCHAR(20),password VARCHAR(20),class_teacher VARCHAR(20),gender VARCHAR(1), student_name VARCHAR(20),father_name VARCHAR(20),mother_name CHAR(20),school_name VARCHAR(40), pincode INTEGER, state VARCHAR(20),country VARCHAR(20),district VARCHAR(20),city VARCHAR(20),area VARCHAR(20),lavel INTEGER, student_class INTEGER, phone_student VARCHAR(15),photo_student BLOB, photo_parent BLOB, phone_parent VARCHAR(15),email_student VARCHAR(15), email_parent VARCHAR(15), enroll_date DATE, dob DATE, PRIMARY KEY (enroll));";
    static final String USER = "root";
    static final String PASS = "aaaAAA123";
    static Connection conn = null;
    static Statement stmt = null;
    boolean queryStatus;
    static ResultSet executeQuery;

    public DatabaseHandeling() {

    }

    public Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        } catch (Exception  ex) {
            Logger.getLogger(DatabaseHandeling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static synchronized Connection getConnection1() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        } catch (Exception  ex) {
            Logger.getLogger(DatabaseHandeling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static synchronized ResultSet getResult1(String Query) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Retriving records from the table...");
            stmt = conn.createStatement();
            System.out.println("Statement Created ");
            executeQuery = stmt.executeQuery(Query);
            System.out.println("Query Executed" + executeQuery);
        } catch (Exception ex) {
            Logger.getLogger(DatabaseHandeling.class.getName()).log(Level.SEVERE, null, ex);
        }
        return executeQuery;

    }

    public ResultSet getResultSet(String Query) {
        try {
            //STEP 4: Execute a query
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver initialised");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection created");
            stmt = conn.createStatement();
            System.out.println("Statement Created");
            executeQuery = stmt.executeQuery(Query);
            System.out.println("Query Executed");
        } catch (Exception ex) {
            Logger.getLogger(DatabaseHandeling.class.getName()).log(Level.SEVERE, null, ex);
        }

        return executeQuery;
    }

    public boolean createDatabase(String database) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseHandeling.class.getName()).log(Level.SEVERE, null, ex);
        }

        //STEP 3: Open a connection
        System.out.println("Connecting to a selected database...");
        try {
            conn = DriverManager.getConnection(BLANK_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Creating table...");
            stmt = conn.createStatement();
            queryStatus = stmt.execute("create database " + database + ";");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHandeling.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    System.out.println("STMT Close SQL Exception " + ex.getMessage());
                }
                stmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("Connection Cloase " + ex.getLocalizedMessage());
                }
                conn = null;
            }
        }
        return queryStatus;

    }

    public boolean updateQuery(String sql) {
        try {
            //STEP 4: Execute a query
            System.out.println("Inserting records into the table...");
            conn = new DatabaseHandeling().getConnection();
            stmt = conn.createStatement();
            queryStatus = stmt.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHandeling.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    System.out.println("STMT Close SQL Exception " + ex.getMessage());
                }
                stmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("Connection Cloase " + ex.getLocalizedMessage());
                }
                conn = null;
            }
        }
        return queryStatus;

    }

    public String getDate() {
        Date date = new Date();
        SimpleDateFormat ft1 = new SimpleDateFormat("yyyyMMddHHmmss");
        return ft1.format(date);
    }
}
