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
		String y = request.getParameter("y");
		String x = request.getParameter("x");
		int xint = Integer.parseInt(x);
		int yint = Integer.parseInt(y);
		
		PrintWriter writer = new PrintWriter(respons.getWriter());
		String moveInfo = CellSaver.makeMove(yint, xint);
		writer.println(moveInfo);
	}
}
