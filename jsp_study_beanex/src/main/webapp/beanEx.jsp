
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="student"  class="com.javalec.ex.Student" scope="page"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:setProperty name="student" property="name" value="������"/>
	<jsp:setProperty name="student" property="age" value="28"/>
	<jsp:setProperty name="student" property="grade" value="12"/>
	<jsp:setProperty name="student" property="studentNum" value="11"/>
		
	�̸�: <jsp:getProperty property="name" name="student"/><br/>
	����: <jsp:getProperty property="age" name="student"/>	<br/>
	�г�: <jsp:getProperty property="grade" name="student"/>	<br/>
	��ȣ: <jsp:getProperty property="studentNum" name="student"/>	<br/>
	
</body>
</html>