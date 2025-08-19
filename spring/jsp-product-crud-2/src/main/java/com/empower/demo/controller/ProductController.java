package com.empower.demo.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.empower.demo.config.MyConfiguration;
import com.empower.demo.model.Product;
import com.empower.demo.model.ProductDao;
import com.empower.demo.model.ProductDaoImpl;

/**
 * Servlet implementation class ProductController
 */
@WebServlet({ "/ProductController", "/pc" })
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String btn=request.getParameter("btn");
		Long id;
		String name="";
		String category="";
		Double price=0.0;
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		ProductDao pdao=ctx.getBean(ProductDaoImpl.class);
		int no=0;
		switch(btn) {
		case "Add":
			id=Long.parseLong(request.getParameter("id"));
			name=request.getParameter("name");
			category=request.getParameter("category");
			price=Double.parseDouble(request.getParameter("price"));
			no=pdao.create(new Product(id, name, category, price));
			System.out.println(no+" row inserted!");
			break;
		case "Update":
			id=Long.parseLong(request.getParameter("id"));
			name=request.getParameter("name");
			category=request.getParameter("category");
			price=Double.parseDouble(request.getParameter("price"));
			no=pdao.update(new Product(id, name, category, price));
			System.out.println(no+" row inserted!");
			break;
		case "Delete":
			id=Long.parseLong(request.getParameter("id"));
			no=pdao.delete(id);
			System.out.println(no+" row deleted!");
			break;
		}
//		response.getWriter().print("Done. Please check");
		response.sendRedirect("product.jsp");
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
