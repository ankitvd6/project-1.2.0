package com;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dBUtility.Dao;
import dBUtility.InventoryBean;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int status=0;
		PrintWriter out=response.getWriter();
		String  flat=request.getParameter("flat");
		String wing=request.getParameter("wing");
		String society=request.getParameter("society");
		
		InventoryBean b=new InventoryBean();
		b.setFlat(flat);
		b.setWing(wing);
		b.setSociety(society);
		
				try {
					status=Dao.save(b);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(status>0) {
					request.getRequestDispatcher("index.html").include(request, response);
					
				}
				else {
					out.println("Sorry! unable to save record");
				}
	}

}
