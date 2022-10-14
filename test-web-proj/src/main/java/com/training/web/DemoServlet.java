package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.driver.OracleDriver;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/demoServlet2")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
			String user="system";
			String pass="system";
			response.setContentType("text/html");
			
			Connection con =DriverManager.getConnection(url,user,pass);
			System.out.println("Connection successful!");
			Statement stmt4=  con.createStatement();
			
			
			String uname=request.getParameter("uname");
			String pwd=request.getParameter("pwd");
			System.out.println(uname);
			String query="select * from Users";
			ResultSet rs2=stmt4.executeQuery(query);
			
			PreparedStatement stmt3=con.prepareStatement("Select * from Users where userName=? and password=?");
			stmt3.setString(1, uname);
			stmt3.setString(2, pwd);
			ResultSet rs1=stmt3.executeQuery();
			
			ArrayList<Users> list=new ArrayList<Users>();			
				while(rs1.next())
				{
					if(rs1.getString(3).equals("Admin"))
						{
						while(rs2.next())
						{
							
							list.add(new Users(rs2.getString(1),rs2.getString(2),rs2.getString(3)));
						}
						request.setAttribute("ArrList", list);   
						}
					else
						{
							list.clear();
							
							list.add(new Users(rs1.getString(1),rs1.getString(2),rs1.getString(3)));
							
								}
							request.setAttribute("ArrList", list);
						}
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
