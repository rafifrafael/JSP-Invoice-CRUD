package com.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InvoiceFood
 */
public class InvoiceFood extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String name = request.getParameter("name");
		//float cost = Float.parseFloat(request.getParameter("cost"));
		String checkedFood[] = request.getParameterValues("checkedfood");
		
		
		for(String f: checkedFood) {
			out.println(name);
			out.println(f);
		}
		
		out.println("teettetet");
		
		
		
	}

}
