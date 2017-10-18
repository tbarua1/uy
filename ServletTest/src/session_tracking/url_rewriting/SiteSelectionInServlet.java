package session_tracking.url_rewriting;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SiteSelectionInServlet
 */
@WebServlet("/SiteSelectionInServlet")
public class SiteSelectionInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Vector<String> sites = new Vector<String>();
	Random random = new Random();

	public void init() throws ServletException {
	sites.addElement("http://www.google.com");
	sites.addElement("http://www.java.sun.com");
	sites.addElement("http://www.rediffmail.com");
	sites.addElement("http://www.yahoo.com");
	sites.addElement("http://www.indiatimes.com");}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SiteSelectionInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int siteIndex = Math.abs(random.nextInt()) % sites.size();
		String site = (String)sites.elementAt(siteIndex);

		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", site);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
