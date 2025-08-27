package com.login.student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.login.login.DBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/signupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String studyClass=request.getParameter("class");
		String dateofBirth=request.getParameter("dateofbirth");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		//adding data to database
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement psmt=con.prepareStatement("Insert into student values (?,?,?,?,?,?)");
			psmt.setString(1,firstname);
			psmt.setString(2,lastname);
			psmt.setString(3,studyClass);
			psmt.setString(4,dateofBirth);
			psmt.setString(5,username);
			psmt.setString(6, password);
			psmt.executeUpdate();
			con.close();
			response.sendRedirect("login.html");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
	}

}
