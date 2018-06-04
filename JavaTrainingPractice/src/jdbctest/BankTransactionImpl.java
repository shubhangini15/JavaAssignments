package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BankTransactionImpl implements BankTransaction {
	Connection conn = null;
	Statement stmt = null;
	private int sourceNo;
	private int destinationNo;
	@Override
	public boolean transfer(int sourceNo, int destinationNo){
		
		// Logic to read Account details based on sourceNo & DestinationNo from DB
		this.sourceNo = sourceNo;
		this.destinationNo = destinationNo;
		int sourceBalance = 0;
		int destBalance = 0;

		// take input amount to transfer
		Scanner sc =new Scanner(System.in);
	
		try {
		// Logic to Transfer
		
			String sql1 = "SELECT * FROM bank_information WHERE Account_id='sourceNo'";
			java.sql.ResultSet rs1 = stmt.executeQuery(sql1);
			while(rs1.next()){
				int sourceac  = rs1.getInt("Account_id");
				String sourceACname=rs1.getNString("Account_name");
				 sourceBalance=rs1.getInt("Account_balace");
			}
			rs1.close();
			String sql2 = "SELECT * FROM bank_information WHERE Account_id='destinationNo'  ";
				java.sql.ResultSet rs2 = stmt.executeQuery(sql2);
				while(rs2.next()){
					int destinationac  = rs2.getInt("Account_id");
					String destinationACname=rs2.getNString("Account_name");
					 destBalance=rs2.getInt("Account_balace");
				}
				rs2.close();
				System.out.println("Enter the amount to transfer");
				 int transfer =sc.nextInt();
				 if(sourceBalance > transfer) {
					 destBalance=+transfer;
					 System.out.println("Total Balance in Destination A/C: "+destBalance); 
				 } else {
					 System.out.println("Insufficient balance in source A/C! Please try again with lesser amount.");
				 }
			
		
		} catch(Exception e) {
			System.err.println(e);
		}
		return false;
}
	public void DBConnection() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "1234");
		if(conn == null) {
			System.out.println("Connection Failed!");
		}else {
			System.out.println("Connection Successful!");
		}
	} catch(Exception e) {
		System.err.println(e);
	}
}
}
/*if(Amount < transAmt) {
System.out.println("Insufficient balance");
} else {
System.out.println(transAmt+" : Amount transfered");
}*/