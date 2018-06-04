package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DBConn {

	
	static ResultSet rs = null;
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement st = null;
		
		// 1. Load & Register JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Get Connection obj
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "1234");
		
		if(conn == null) {
			System.out.println("Connection Failed!");
		}else {
				System.out.println("Connection Successful!");
		}
		// 3. Create Statement obj
		st = conn.createStatement();
		
		try {
			st.execute("Drop table Product");
		} catch(SQLException e){
			System.err.println(e);
		}
		//4. Execute Query --> Non select query--> Use executeUpdate
		
		/*****************************Create Table******************************/
		String sql = "CREATE TABLE Product" 
				+ " (Pid INTEGER not NULL, "
				+ "PName VARCHAR(255),"
				+ "Price INTEGER(10)," 
				+ "PBarcode LONG,"
				+ "PRIMARY KEY (Pid))";
		st.executeUpdate(sql);
		
		/*********Insert into Table************/
		String sqlInsert = "INSERT INTO Product VALUES (101, 'HP', 700, 10110101) ";
		st.executeUpdate(sqlInsert) ;
		sqlInsert = "INSERT INTO Product VALUES (102, 'Dell', 750, 10111111) ";
		st.executeUpdate(sqlInsert) ;
		sqlInsert = "INSERT INTO Product VALUES (103, 'Asus', 690, 10010001) ";
		st.executeUpdate(sqlInsert) ;
		sqlInsert = "INSERT INTO Product VALUES (104, 'Compaq', 720, 101100101) ";
		int i = st.executeUpdate(sqlInsert) ;
		
		if(i==0) {
			System.out.println("Record not inserted");
		} else {
			System.out.println("Record inserted!");
		}
				
	}
	}


