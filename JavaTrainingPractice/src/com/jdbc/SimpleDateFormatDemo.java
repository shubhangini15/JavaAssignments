package com.jdbc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormatDemo {
	
	public static void main(String[] args) throws ParseException {
		
		String str = "20-Mar-2018";
		
		//Using SimpleDateFormat parse the text->date
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		
		/***********************Text to Date*************************/
		Date d1 = sdf.parse(str); //parsing takes str obj to util date format
		System.out.println("Util Date obj: "+d1);
		
		//Convert util date obj to sql date obj
		long ms = d1.getTime();
		java.sql.Date sdate = new java.sql.Date(ms);
		System.out.println("Sql Date obj: "+sdate);
		
		/**********************Date to Text ***********************/
		Date d2 = sdate;
		String str1 = sdf.format(d2); //format takes util date obj
		System.out.println("String type: "+str1);
		
		
		
	}

}
