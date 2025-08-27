package com.servlet.add;

import java.io.IOException;

import javax.websocket.Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int total=Integer.parseInt(request.getParameter("num1"));
		total=total+Integer.parseInt(request.getParameter("num2"));
		
		//4 method using Cookie
		Cookie coockie = new Cookie("total", total+"");
		response.addCookie(coockie);
		response.sendRedirect("sq");
		
		//3 using session 
//		HttpSession session=request.getSession();
//		session.setAttribute("total",total);
//		response.sendRedirect("sq");
		
		//2 using url  
		//response.sendRedirect("sq?total="+total);
	
		//1 using dispachter method  
		//request.setAttribute("total",total);
//		RequestDispatcher rd=request.getRequestDispatcher("sq");
//		rd.forward(request, response);
		
		
		//int a=Integer.parseInt(request.getParameter("num1"));
		//int b=Integer.parseInt(request.getParameter("num2"));
		//PrintWriter out=response.getWriter();
		//out.println("<h1> sum of "+a+" and "+b+" is "+(a+b)+"</h1>");
	}

}
