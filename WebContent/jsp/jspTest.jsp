<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h1{background-color: orange;}
</style>
</head>
<body>
	<%-- <%
		//JSP = HTML + JAVA
		String myname = request.getParameter("myname");
		System.out.println(myname);
	%> 서버에서 함--%> 
	<h1>JSP문서입니다.</h1>
	<h2>프로그램이름: <%=request.getContextPath() %></h2>
	<%-- <h3>파라메터정보: <%=request.getParameter("myname") %></h3> --%>
	<h3>파라메터정보: ${param.myname}</h3>
	<h3>getAttribute: ${alias}</h3>
</body>
</html>