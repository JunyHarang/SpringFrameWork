<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	hello.jsp<br>
	
	<!-- scope에 저장되어 있는 속성(attribute) 값들을 출력해 줍니다. -->
	인사말 : ${greeting}<br>
	메시지 : ${message}<br>
	
	<% 
		String hohoho = request.getContextPath() + "/first/hohoho.he" ;
	%>
	
	<a href="<%=hohoho%>">여기 클릭</a>
</body>
</html>