/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.jdbc.may17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDemoJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaFullStackCourse","root","root");
		Statement statement=connection.createStatement();
		boolean isCreate=statement.execute("Create table user(name Varchar(30),roll int(10))");
		System.out.println(isCreate);
		boolean isinsert=statement.execute("Insert into Teachers (first_name, last_name) VALUES ('Omkar', 'Bhandare'),('Gaurav', 'chauvan')");
		System.out.println(isinsert);
		boolean isupdate=statement.execute("Update Teachers Set first_name='Garry',last_name='chavan' where teacher_id=4");
		System.out.println(isupdate);
		boolean isdelete= statement.execute("DELETE from teachers where Teacher_id in (2,5,7,8)");
		System.out.println(isdelete);
		ResultSet rs=statement.executeQuery("SELECT * FROM Teachers");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		rs.close();
		statement.close();
		connection.close();

	}

}
