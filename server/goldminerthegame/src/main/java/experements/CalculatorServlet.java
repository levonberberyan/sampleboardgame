package experements;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newtest")
public class CalculatorServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respons)
	        throws ServletException, IOException{
		PrintWriter writer = new PrintWriter(respons.getWriter());
		writer.println("Hello User "  );
		String x = request.getParameter("x");
		if(x == null){
			writer.println("Error "  );
		}
		else{
			int xint = Integer.parseInt(x);
			writer.println(Calculator.square(xint));
		}
		
		
	}
	
}
