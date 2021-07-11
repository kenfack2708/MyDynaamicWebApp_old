package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String yourName = request.getParameter("yourName");
		String Jahr = request.getParameter("Jahr");
		String Gehalt = request.getParameter("Gehalt");
		
		

        double bonuspercentage ;
        if (Double.parseDouble(Jahr)<=3) {
        	bonuspercentage = 0.05;
        }else if (Double.parseDouble(Jahr)<=5){
        	bonuspercentage = 0.1;        	
        }else if (Double.parseDouble(Jahr)<=8){
        	bonuspercentage = 0.15;
        }else if (Double.parseDouble(Jahr)<=10){
        	bonuspercentage = 0.20;
        }else if (Double.parseDouble(Jahr)<=15){
        	bonuspercentage = 0.25;
        }else if (Double.parseDouble(Jahr)<=20){
        	bonuspercentage = 0.30;
        }else bonuspercentage = 0.35;
        
		double bonus = Double.parseDouble(Gehalt)*bonuspercentage;
		
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hi " + yourName + " dein Bonus lautet " + bonus +" Euro</h1>");
		writer.close();
		// TODO Auto-generated method stub
	}

}
