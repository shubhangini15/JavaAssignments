package com.sendRedirectMethod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BillSrv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BillSrv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String item = req.getParameter("item");
		int price=Integer.parseInt(req.getParameter("price"));
		int qty =Integer.parseInt(req.getParameter("qty"));
		out.print("<h1 align=center>Final Bill</h1>");
		int bill =price*qty;
		out.println("Bill = "+bill);
		if(bill<10000) {
			out.print("<body bgcolor=lightblue>");
			out.print("<center><table bgcolor=lightgreen>");
			out.print("<tr><td>Item Name:</td><td><input type=text name=name value="+item+ "></input></td></tr>");
			out.print("<tr><td>Final Bill:</td><td><input type=text name=name value="+bill+ "></input></td></tr>");
			out.print("</table></center></body>");
		} else {
			res.sendRedirect("http://localhost:8080/SendRDBill2/BillSrv3?bill="+bill+"&item="+item);
			
		}
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
