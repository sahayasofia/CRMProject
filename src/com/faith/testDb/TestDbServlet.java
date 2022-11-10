package com.faith.testDb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//SERVLET implementation class
@WebServlet("/testdbservlet")
public class TestDbServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// setup Connection variables
		String user="root";
		String password="faith";
		String jdbcurl="jdbc:mysql://localhost:3306/demohybernate?serverTimezone=UTC";
		String driverclass="com.mysql.cj.jdbc.Driver";
		
		//get connection 
		try {
			PrintWriter out=resp.getWriter();
			out.println("Connecting to database:"+jdbcurl+"/n");
			//set connection String
			Class.forName(driverclass);
			Connection connection=DriverManager.getConnection(jdbcurl,user,password);
			out.println("SUCCESS!!!!!");
			//close connection
			connection.close();
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new ServletException();
		}
	}
	
	

}