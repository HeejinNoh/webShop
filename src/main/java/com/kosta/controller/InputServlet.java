package com.kosta.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/html/input")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("get 요청입니다.");
		getData(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("post 요청입니다.");
		request.setCharacterEncoding("utf-8"); //인코딩 자동으로 안해주기 때문에 해야함
		getData(request, response);
	}
	
	private void getData(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String[] subjects = request.getParameterValues("subject");
		System.out.println("id = " + id);
		System.out.println("pw = " + pw);
		String str = "";
		for(String sub : subjects) {
			System.out.println("subject = " + sub);
			str += "<p>subject = " + sub + "</p>";
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<p>" + "id = " + id + "</p>");
		out.print("<p>" + "pw = " + pw + "</p>");
		out.print(str);
	}
	
}
