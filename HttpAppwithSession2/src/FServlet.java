

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/furl")
public class FServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException, NumberFormatException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String address = req.getParameter("addres");
		int age = Integer.parseInt(req.getParameter("age"));
		HttpSession ses = req.getSession(true);
		ses.setAttribute("name",name);
		ses.setAttribute("address", address);
		ses.setAttribute("age", age);
		
		out.print("<body bgcolor = lightblue><center>");
		out.print("<form action=\"surl\" method=\"get\"><table bgcolor=brown>");
		out.print("<tr><td> Experience: </td> <td><input type=text name=exp placeholder=\"eg:1 or 2\"/></tr>");
		out.print("<tr><td> Skillset: </td>");
		out.print("<td> <select name=skill>");
		out.print("<option value=java> java </option>");
		out.print("<option value=.Net> .Net </option>");
		out.print("<option value=oracle> Oracle </option>");
		out.print("<option value=Webservices> Webservices </option>");
		out.print("<tr><td colspan=2 align=center><input type=submit value=Continue /></td></tr>");
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}