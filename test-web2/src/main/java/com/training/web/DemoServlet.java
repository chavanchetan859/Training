package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
@WebServlet("/demoServlet")
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
//		
//		String name=request.getParameter("uname");
//		String pwd=request.getParameter("pwd");
//		
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		
////		out.println("<html><body>");
////		out.println("<h2>Hello "+name+" you are logged in</h2>");
////		out.println("</body></html>");
//		request.setAttribute("uname", name);
//		
//		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
//		rd.forward(request, response);
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
			String user="system";
			String pass="system";
			response.setContentType("text/html");
			
			Connection con =DriverManager.getConnection(url,user,pass);
			System.out.println("Connection successful!");
			Statement stmt4=  con.createStatement();
			String query="select * from Course";
			ResultSet rs2=stmt4.executeQuery(query);
			ArrayList<Course> list=new ArrayList<Course>();
			int i=1;
			while(rs2.next())
			{
				//String str=rs2.getString(1);
				list.add(new Course(rs2.getInt("courseId"),rs2.getString("courseName"),rs2.getInt("courseDuration"),rs2.getInt("courseFee")));
				//list.add(rs2.getString(2));
				
			}
			request.setAttribute("ArrList", list);
			
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
