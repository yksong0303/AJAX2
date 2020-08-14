package com.ajax.test.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/views/*")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String prefix="/WEB-INF";
	private static final String suffix=".jsp";
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		List<String> strList = new ArrayList<>();
		strList.add("12");
		strList.add("2");
		strList.add("3");
		strList.add("4");
		Gson g = new Gson();
		request.setAttribute("strList", g.toJson(strList));
		
		String uri = prefix + request.getRequestURI() + suffix;
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
