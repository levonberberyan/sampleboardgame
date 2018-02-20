package Hasvark;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/makeres")
public class CalculatorServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons)
	        throws ServletException, IOException{
		PrintWriter writer = new PrintWriter(respons.getWriter());
		String lenght = request.getParameter("lenght");
		String height = request.getParameter("height");
		if(lenght == null && height == null){
			writer.println("Please Insert Value");
		}
		else{
			int lenghtint = Integer.parseInt(lenght);
			int heightint = Integer.parseInt(height);
			writer.println(Calculator.makeres(lenghtint, heightint));
		}
	}
}
