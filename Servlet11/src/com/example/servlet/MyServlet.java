package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		String url = ctx.getInitParameter("URL");
		String userid = ctx.getInitParameter("USERID");
		String passwd = ctx.getInitParameter("PASSWORD");
		
		PrintWriter out = resp.getWriter();
		out.println(url+"<br>");
		out.println(userid+"<br>");
		out.println(passwd+"<br>");
	}
}
