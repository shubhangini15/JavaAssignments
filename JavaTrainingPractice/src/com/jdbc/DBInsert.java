package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DBInsert {
	public static void main(String[] args)  throws Exception{
		
		Connection conn = null;
		Statement st = null;
		int id;
		String name, pwd;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter login id: ");
		id = sc.nextInt();
		System.out.println("Enter username: ");
		name = sc.next();
		System.out.println("Enter password: ");
		pwd = sc.next();
		
		
		// 1. Load & Register JDBC Driver
		Class c1 = Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Get Connection obj
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "1234");
		
		if(conn == null) {
			System.out.println("Connection Failed!");
		}else {
				System.out.println("Connection Successful!");
		}
		
		// 3. Create Statement obj --> sends sql query to database software
		st = conn.createStatement();
		
		/* HardCoded
		 * int i = st.executeUpdate("INSERT into login VALUES (105, 'Gauri', 'g1234')");
		*/
		
		String qry = "INSERT into login VALUES(" +id+", '"+name+"', '"+pwd+ "')";
		System.out.println(qry);
		int i = st.executeUpdate(qry);
		
	}

}
