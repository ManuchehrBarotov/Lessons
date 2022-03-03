

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/initServlet")
public class InitServlet extends HttpServlet {

    public InitServlet() {
   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 PrintWriter pw=response.getWriter();
	 ServletConfig config=	getServletConfig();
	 String string= config.getInitParameter("user");
	 String age= config.getInitParameter("age");
	 Enumeration<String> list = config.getInitParameterNames();
	 pw.print("<html>");
	 pw.print("<h1>"+string);
	 pw.print(" "+age+"</h>");
	 
	 pw.print("</html>");
	 pw.print("</p>");
	 
	
	 while(list.hasMoreElements()) {
		pw.println(config.getInitParameter(list.nextElement()));
		 pw.print("<hr color=green>");
		 
	 }
	 pw.print(getServletContext().getInitParameter("email"));
	 
	 

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
