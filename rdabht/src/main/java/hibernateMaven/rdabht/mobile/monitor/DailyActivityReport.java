/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.monitor;

import com.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mobile.Tool;
import mobile.monitor.gettersetter.UniversityGetSet;

/**
 *
 * @author Abhishek.Sehgal
 */
@WebServlet(name = "DailyActivityReport", urlPatterns = {"/DailyActivityReport"})
public class DailyActivityReport extends HttpServlet {

    private int i = 1;
    private int day, hour, minute, second;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List mapUniversity = Controller.mapUniversity1();
        System.out.println("Retrived Records " + mapUniversity.size());
        List<UniversityGetSet> prepareGetSetUniversity = Tool.prepareGetSetUniversity(mapUniversity);
        System.out.println("Prepared Record " + prepareGetSetUniversity.size());
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DailyActivityReport</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Daily Utilization</h1>");
            out.println("<table border=1><tr>"
                    + "<th>Sr. No</th>"
                    + "<th>Batch Code</th>"
                    + "<th>Division</th>"
                    + "<th>Division</th>"
                    + "<th>Status</th>"
                    + "<th>University</th>"
                    + "<th>Trainer</th>"
                    + "<th>Start Time</th>"
                    + "<th>End Time</th>"
                    + "<th>Untilization</th>"
                    + "</tr>");

            prepareGetSetUniversity.forEach((o) -> {
                out.println("<tr>");
                out.println("<td>" + i++ + "</td>");
                out.println("<td>" + o.getBatchCode() + "</td>");
                out.println("<td>" + o.getCourse() + "</td>");
                out.println("<td>" + o.getDivisionName() + "</td>");
                out.println("<td>" + o.getStatus() + "</td>");
                out.println("<td>" + o.getUniversityName() + "</td>");
                out.println("<td>" + o.gettTrainer() + "</td>");
                out.println("<td>" + o.getEndTime() + "</td>");
                out.println("<td>" + o.getStartTime() + "</td>");
                getUtilization(o.getStartTime(), o.getEndTime());
                out.println("<td>" + getHour() + ":" + getMinute() + "</td>");
                out.println("</tr>");
            });
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void getUtilization(Date start, Date end) {
        int diff = (int) (end.getTime() - start.getTime());
        setDay((((diff / 1000) / 60) / 60) / 24);
        setHour(((diff / 1000) / 60) / 60);
        setMinute((diff / 1000) / 60);
        setSecond(diff / 1000);
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
