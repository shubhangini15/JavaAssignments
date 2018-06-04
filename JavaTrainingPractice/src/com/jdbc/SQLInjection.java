package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SQLInjection {
	
	public static void main(String[] args) throws Exception {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String name, pwd;
	
	//Scanner obj
	
	Scanner sc = new Scanner(System.in);
	System.out.println("");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "1234");
	
	if(conn == null) {
		System.out.println("Connection Failed!");
	}else {
			System.out.println("Connection Successful!");
	}
	// 3. Create Statement obj
	stmt = conn.createStatement();
	String qry = "SELECT * FROM login where logid = 'Ricky' and pwd = 'r1234'";
	System.out.println(qry);
	
	rs = stmt.executeQuery(qry);
	
	if(rs.next()) {
		System.out.println("Valid Credentials! Loging Successful");
	} else {
		System.out.println("Invalid Credentials! Loging again.");
	}
	
	
	
}
}