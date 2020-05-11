package p10;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Launch extends HttpServlet 
{
		


		 String url;
		 String userid;
		 String pass;


		public void init(ServletConfig config) throws ServletException 
		{
			url=config.getInitParameter("URL");
			userid=config.getInitParameter("USERID");
			pass=config.getInitParameter("PASSWORD");
		
	    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println(url);
		System.out.println(userid);
		System.out.println(pass);
		
	}

}
