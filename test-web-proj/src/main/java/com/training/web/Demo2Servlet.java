package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo2Servlet
 */
@WebServlet("/Demo2Servlet")
public class Demo2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
		String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
		String user="system";
		String pass="system";
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		String type=request.getParameter("utype");
		
	
			Connection con =DriverManager.getConnection(url,user,pass);
			Statement stmt4=  con.createStatement();
			PreparedStatement stmt3=con.prepareStatement("insert into Users values(?,?,?)");
			stmt3.setString(1, uname);
			stmt3.setString(2, pwd);
			stmt3.setString(3, type);
			ResultSet rs1=stmt3.executeQuery();
		
		
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		rd.forward(request, response);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
