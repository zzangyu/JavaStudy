<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		for(int i =0; i < cookies.length; i++){
			if(cookies[i].getName().equals("cookieName")){
				out.println("name : "+cookies[i].getName()+"<br/>");
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
			}
		}
	%>
		<a href="cookietest.jsp">��ŰȮ��</a>
</body>
</html>