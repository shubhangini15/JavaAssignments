package com.sendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BillSrv3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BillSrv3() {
        super();
        
    }


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String item = req.getParameter("item");
		int bill = Integer.parseInt(req.getParameter("bill"));
		float fbill = bill-(bill/100)*30;
		out.print("<h1 align=center> Final bill after discount</h1>");
		out.print("<body bgcolor=lightblue>");
		out.print("<center><table bgcolor=lightgreen>");
		out.print("<tr><td>Item Name:</td><td><input type=text name=name value=" +item+ "></input></td></tr>");
		out.print("<tr><td>Final Bill:</td><td><input type=text name=name value=" +fbill+ "></input></td></tr>");
		out.print("</table></center></body>");
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}