package gamepackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
		 
@WebServlet("/test")
public class GameServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons)
	        throws ServletException, IOException
	    {
			String x = request.getParameter("x");
			String y = request.getParameter("y");
			PrintWriter writer = new PrintWriter(respons.getWriter());
			if (x != null && y!= null){
				int xint = Integer.parseInt(x);
				int yint = Integer.parseInt(y);
				if(CellSaver.isValid(xint, yint)== true){
					char Letter  = CellSaver.getCell(xint, yint);
					writer.println(Letter);
				}
				else{
					writer.print("Your cordinats are incorrect");
				}
			} 
			else{
				writer.println("Please Insert x and y");
			}
	    }
}

