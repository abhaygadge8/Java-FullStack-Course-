package com.servlet.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.websocket.Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class sqAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//4 method using cookie
		int square=0;
		Cookie[] cookieJar = request.getCookies();
		for(Cookie c: cookieJar) {
			 if(c.getName().equals("total")) {
				 square = Integer.parseInt(c.getValue()); 
				 square = square*square;
			 }
		}
		
		response.getWriter().println("<h1>The Square is "+square+"</h1>");
	
		
		
		//3 method using Session
//		HttpSession session= request.getSession();
//		int square=(int) session.getAttribute("total");
//		System.out.println(square);
		
		
		
		//using 2 mehtod 
		//int square= Integer.parseInt(request.getParameter("total"));
		
		//using 1 mehtod 
		//int square=(int) request.getAttribute("total");
		
		//this use for 1,2,3 method
		/*square=square*square;
		PrintWriter out=response.getWriter();
		out.println("<h1>Square = "+square+"</h1>");*/
	}

}
