package com.connectionpool;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmpSrv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn = null;
	Statement stmt =null;
       
   
    public EmpSrv1() {
        super();
    }
    
    public void init() {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "1234");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html><body bgcolor=tomato><center>");
		out.print("<h1>Employee Info</h1><hr>");
		out.print("<table border=1><th>EmpId</th><th>EmpName</th><th>EmpDept</b></th>");
		out.print("<tr><br>");
		
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from employee");
			while(rs.next()) {
				out.print("<tr><td>"+rs.getInt(1)+"</td><td> "+rs.getString(2)+"</td><td> "+rs.getString(3)+"</td></tr>");	
				//out.print("<br>");	
			}
			
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.close();
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}
	
	public void destroy() {
		try {
			if(conn!= null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
