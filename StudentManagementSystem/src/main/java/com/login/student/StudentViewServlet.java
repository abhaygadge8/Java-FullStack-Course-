package com.login.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.login.login.DBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/studentViewServlet")
public class StudentViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		try(Connection con=DBConnection.getConnection()){
			String query = "SELECT * FROM student";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            out.println("<html><head><title>All Student list</title><style>\r\n"
            		+ "  table {\r\n"
            		+ "    border-collapse: collapse;\r\n"
            		+ "    width: 100%; /* or any desired width */\r\n"
            		+ "  }\r\n"
            		+ "  th, td {\r\n"
            		+ "    border: 1px solid black;\r\n"
            		+ "    padding: 8px;\r\n"
            		+ "  }\r\n"
            		+ "  th {\r\n"
            		+ "    background-color: #f2f2f2;\r\n"
            		+ "  }\r\n"
            		+ "</style></head><body>");
            out.println("<h2>All Regsiter Student Detail</h2>");
            out.println("<table border='1' cellpadding='10'><tr><th>First Name</th><th>Last Name</th><th>Class</th><th>Date Of Birth</th></tr>");

            while (rs.next()) {
                out.println("<tr><td>" + rs.getString("firstname") + "</td>"
                        + "<td>" + rs.getString("lastname") + "</td>"
                        + "<td>" + rs.getString("class") + "</td>"
                        + "<td>" + rs.getString("dob") + "</td></tr>");
            }

            out.println("</table></body></html>");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
