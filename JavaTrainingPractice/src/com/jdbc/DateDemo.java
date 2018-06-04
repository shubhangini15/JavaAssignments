package com.jdbc;

import java.util.Date;


public class DateDemo {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("Using java.util.Date--> "+d1);
		
		long millisec = d1.getTime();
		
		java.sql.Date sd = new java.sql.Date(millisec);
		System.out.println("Using java.sql.Date--> "+sd);
	}

}
