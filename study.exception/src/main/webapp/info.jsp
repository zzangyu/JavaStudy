<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page errorPage="errorPage.jsp" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		int i = 40/0; //�̰͵� ���������� �����ɸ��� �Ʒ��� �Ƹ���~
		
		int[] arr = {1,2};
	
		for(int j = 0; j < 5; j++){
			arr[j] = 1;
		}

	%>
</body>
</html>