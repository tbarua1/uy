package logging_filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoggingFilterExample implements Filter{
	private FilterConfig filterConfigObj = null;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String remoteAddress =  arg0.getRemoteAddr();
		  String uri = ((HttpServletRequest) arg0).getRequestURI();
		  String protocol = arg0.getProtocol();

		 // chain.doFilter(request, response);
		  filterConfigObj.getServletContext().log("Logging Filter Servlet called");
		    filterConfigObj.getServletContext().log("**************************");
		  filterConfigObj.getServletContext().log("User Logged ! " +" User IP: "+ remoteAddress +"Resource File: +" +uri +"+Protocol: +" + protocol);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		filterConfigObj=arg0;
		
	}

}
