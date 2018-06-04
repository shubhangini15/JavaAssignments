

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/verify")
public class VerifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public VerifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "1234");
			Statement stmt = conn1.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM registration");
			System.out.println("");
			out.print("<h1 align=center> Registered Users </h1>");
			out.print("<body bgcolor=lightblue>");
			out.print("<center><table bgcolor=lightgreen>");
			out.print("<tr><th> Name </th> <th> Age </th> <th> Experience </th> <th> Skill </th> <th> Expected Salary </th> <th> City </th> <th> Address </th>");
			
			while(rs.next()) {
				String name = rs.getString(1);
				int age= rs.getInt(2);
				int exp = rs.getInt(3);
				String skill = rs.getString(4);
				int esal =rs.getInt(5);
				String city = rs.getString(6);
				String address = rs.getString(7);
				
				//out.println(name+"\t"+age+"\t"+exp+"\t"+skill+"\t "+esal+"\t"+city+"\t"+address);

				out.print("<tr><td>"+name+"</td><td>" +age+ "</td><td>"+exp+"</td><td>"+skill+"</td><td>"+esal+"</td><td>"+city+"</td><td>"+address);	
				
		}
			out.print("</table></center></body>");
			out.print("<tr><td colspan=4 align=center></td></tr>");
		}
			catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
