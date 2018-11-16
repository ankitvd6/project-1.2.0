package com;
import dBUtility.Dao;
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

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String flat=request.getParameter("flat");
		String wing=request.getParameter("wing");
		String society=request.getParameter("society");
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		int status=0;
		InventoryBean b=new InventoryBean();
		b.setId(id);
		b.setFlat(flat);
		b.setWing(wing);
		b.setSociety(society);
		
		try {
			status=Dao.update(b);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status>0) {
			
			request.getRequestDispatcher("viewAll.jsp").forward(request, response);
		}
		else {
			out.print("Sorry!! Update unsuccessful");
			request.getRequestDispatcher("viewPage.jsp").include(request, response);
		}
		
	}

}
