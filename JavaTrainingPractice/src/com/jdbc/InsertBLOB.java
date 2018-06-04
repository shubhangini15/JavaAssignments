package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertBLOB {

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String filePath = "C:\\Users\\Nehal\\Pictures\\testImage\\pic3.png";
		File f = new File(filePath);
		FileInputStream fis = new FileInputStream(f);
		
		// 1. Load & Register JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Get Connection obj
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "1234");
		
		if(conn == null) {
			System.out.println("Connection Failed!");
		}else {
				System.out.println("Connection Successful!");
		}
		
		//3. Execute Query --> Non select query--> Use executeUpdate
		
				
		// 4. Create PreparedStatement obj and prepare pre-compiled query
				pstmt = conn.prepareStatement("INSERT INTO Image values (?,?)");
				
				//5. Set inputs into placeholders
				pstmt.setInt(1, 102);
				pstmt.setBinaryStream(2, fis, (int)f.length());
				
				int count = pstmt.executeUpdate();
				
				if(count != 0) {
					System.out.println(count+" image inserted.");
				} else {
					System.out.println("No rows inserted.");
				}
		
	}

}
