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
		// �������� �������� ���̴� â..
		String myname = request.getParameter("myname");
		System.out.println(myname);
//		response.setContentType("text/html; charset-utf-8");
//		response.getWriter().append("<h1>Served at: <h1>").append("<h2>" + request.getContextPath() + "<h2>").append("<h3> Hello <h3>")
//		.append("<h3>" + myname + "<h3>");
		
		request.setAttribute("alias", "sophieworld");
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("jsp/jstTest.jsp"); //���⼭ html�������� jsp�� �����ϱ�
		rd.forward(request, response); //���乮���� jsp�� ���� ��
	}

}
