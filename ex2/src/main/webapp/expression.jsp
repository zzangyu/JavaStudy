<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!
		int i = 10;
		String str = "ABCDE";

		private int sum(int a, int b){
			return a+b;
		}
	%>

	<%=i %><br/>
	<%=str %><br/>
	<%=sum(1,5) %><br/>

</body>
</html>