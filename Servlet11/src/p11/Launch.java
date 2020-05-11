package p11;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Launch extends HttpServlet 
{
		 String url;
		 String userid;
		 String pass;
		 ServletContext Servcon;


		public void init(ServletConfig config) throws ServletException 
		{
			Servcon=config.getServletContext();
			url=config.getInitParameter("URL");
			userid=config.getInitParameter("USERID");
			pass=config.getInitParameter("PASSWORD");
		
	    }


	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("inside launch servlet");
		System.out.println(url);
		System.out.println(userid);
		System.out.println(pass);
		request.getServletContext().getRequestDispatcher("/Demo").include(request,response);
		
	}

}

