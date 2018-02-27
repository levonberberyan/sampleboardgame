package gamepackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/move")
public class MoveServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons)
	        throws ServletException, IOException{
		PrintWriter writer = new PrintWriter(respons.getWriter());
		String y = request.getParameter("y");
		String x = request.getParameter("x");
		if(x == null || y== null){
			writer.print("Please enter correct x and y");
			return;
		}
		
		int xint = Integer.parseInt(x);
		int yint = Integer.parseInt(y);
		
		
		String moveInfo = MoveHandler.makeMove(yint, xint);
		writer.println(moveInfo);
	}
}
