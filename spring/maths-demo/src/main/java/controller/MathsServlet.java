package controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MathsServlet
 */
@WebServlet({ "/MathsServlet", "/ms" })
public class MathsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MathsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}



	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no1=Integer.parseInt(request.getParameter("no1"));
		int no2=Integer.parseInt(request.getParameter("no2"));
		String btn=request.getParameter("btn");
		int result=0;
		
		switch(btn) {
		case "Add":
			result=no1+no2;
			break;
		case "Subtract":
			result=no1-no2;
			break;
		case "Multiply":
			result=no1*no2;
			break;
		}
		PrintWriter out = response.getWriter();
		out.print(result);
	}

}
