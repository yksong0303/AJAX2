package com.ajax.test.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/load")
public class LoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static int cnt = 1;
    public LoadServlet() {
    	System.out.println("LoadServlet 생성됨!");
    }
    public void init() {
    	System.out.println("LoadServlet 생성되고 난 담에 자동 실행됨!");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println((cnt++) + ". 당신들의 sessionId : " + request.getSession().getId());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
