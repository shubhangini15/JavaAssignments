package com.jdbc.datasource;

import com.mysql.cj.jdbc.MysqlDataSource;
import javax.sql.DataSource;

public class MyDataSource {
	
	public static DataSource getMySQLDataSource() {
		MysqlDataSource mysqlDS = null;
		try {
			mysqlDS = new MysqlDataSource();
			mysqlDS.setServerName("localhost");
			mysqlDS.setPortNumber(3306);
			mysqlDS.setDatabaseName("testdb");
			//mysqlDS.setURL("jdbc:mysql://localhost:3306/testdb");
			mysqlDS.setUser("root");
			mysqlDS.setPassword("1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return mysqlDS;
	}
}

