/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.trainer;

import com.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mobile.Tool;
import mobile.trainer.gettersetter.BatchScheduleTrainer;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Abhishek.Sehgal
 */
@WebServlet(name = "GetBatchSchedule", urlPatterns = {"/GetBatchSchedule"})
public class GetBatchSchedule extends HttpServlet {

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
        String parameter = request.getParameter("skype");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            List batchSchedule4Trainer = Controller.getBatchSchedule4Trainer(parameter);
            System.out.println("Retrieved Records are "+batchSchedule4Trainer.size());
            if (batchSchedule4Trainer.size() > 0) {
                List<BatchScheduleTrainer> prepareGetSetSchedule = Tool.prepareGetSetSchedule(batchSchedule4Trainer);
                String writeValueAsString = new ObjectMapper().writeValueAsString(prepareGetSetSchedule);
                out.println(writeValueAsString);
            } else {
                out.println("0");
            }

//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet GetBatchSchedule at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
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

}
