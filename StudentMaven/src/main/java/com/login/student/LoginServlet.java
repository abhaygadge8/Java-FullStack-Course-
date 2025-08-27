package com.login.student;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.DBConnection;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try(Connection con=DBConnection.getConnection()){
			PreparedStatement psmt=con.prepareStatement("select * from student where username=? AND password=?");
			psmt.setString(1,username);
			psmt.setString(2, password);
			ResultSet rs=psmt.executeQuery();
			if (rs.next()) {
				response.sendRedirect("studentdashboard.html");
			} else {
                response.getWriter().println("<html><head></head><body><h1>Invalid credentials.</h1> <a href='login.html'>Try again</a></body></html>");
            }	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
