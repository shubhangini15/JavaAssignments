package com.addition;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SumSrv1")
public class SumSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SumSrv() {
        super();
        
        
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.print("<HTML><body bgcolor=cyan><center>");
		out.print("Request Arrived..");
		
		int a = Integer.parseInt(req.getParameter("fvalue"));
		int b= Integer.parseInt(req.getParameter("svalue"));
		int sum = a+b;
		
		out.print("<br>Sum = "+sum);
		
		out.print("</center></body></HTML>");
	}

}
