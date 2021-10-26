package com.kosta.controller2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/ServletTest", "/start"})
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 응답으로 브라우저에 보이는 창..
		String myname = request.getParameter("myname");
		System.out.println(myname);
//		response.setContentType("text/html; charset-utf-8");
//		response.getWriter().append("<h1>Served at: <h1>").append("<h2>" + request.getContextPath() + "<h2>").append("<h3> Hello <h3>")
//		.append("<h3>" + myname + "<h3>");
		
		request.setAttribute("alias", "sophieworld");
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("jsp/jstTest.jsp"); //여기서 html하지말고 jsp에 연결하기
		rd.forward(request, response); //응답문서는 jsp가 만든 것
	}

}
