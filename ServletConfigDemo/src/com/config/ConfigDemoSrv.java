package com.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ConfigDemoSrv extends HttpServlet {
	
	ServletConfig cg = null; 
	
    public ConfigDemoSrv() {
        super();
    }
    
    public void init() {
    	cg = getServletConfig();
    }

   /* public void init(ServletConfig cg) {
		this.cg=cg;
	}*/
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<body bg color = lightgreen><center> <h1> ");
		String s = cg.getInitParameter("Driver");
		out.print(s);
		String s1 = cg.getInitParameter("url");
		out.print("<br>"+s1);
		String s2 = cg.getInitParameter("user");
		out.print("<br>"+s2);
		String s3 = cg.getInitParameter("pwd");
		out.print("<br>"+s3);
		out.print("</h1></center></body>");
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		doGet(req, res);
		
	}

}
