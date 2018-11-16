package com;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");
	

	
	if(pass.equals("admin")) {
		
		Cookie ck=new Cookie("name",name);
		request.getRequestDispatcher("index2.jsp").forward(request,response);
	}else {
		out.print("Enter correct credentials");
		request.getRequestDispatcher("login.html").forward(request,response);
		
	}
	
		
	}

}
