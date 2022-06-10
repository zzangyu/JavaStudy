<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%> <!-- 페이지 지시자 -->
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

	i = <%=i %><br/>
	str = <%=str %><br/>
	sum = <%=sum(1,5) %><br/>

</body>
</html>