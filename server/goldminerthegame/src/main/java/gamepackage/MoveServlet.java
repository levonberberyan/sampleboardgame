package gamepackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
		
		String width = request.getParameter("width");
		String height = request.getParameter("height");
		int widthint = 3;
		int heightint = 3;
		if(width != null && height != null){
			widthint = Integer.parseInt(width);
			heightint = Integer.parseInt(height);
		}
		
		GsonBuilder builder=new GsonBuilder();
		Gson g=builder.create();
		
		MoveEffects moveInfo = MoveHandler.makeMove(yint, xint, widthint, heightint);
		Object gson=g.toJson(moveInfo);
		writer.println(gson);
	}
}
