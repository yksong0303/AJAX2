package com.ajax.test.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NoneLoadServlet
 */
@WebServlet(urlPatterns = "/none-load")
public class NoneLoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NoneLoadServlet() {
    	System.out.println("NoneLoadServlet 생성됨!");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
