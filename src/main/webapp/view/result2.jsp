<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.io.Console"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<!-- 영어단어문제의 합격유무 결과창 -->

   <%@include file="../home.jsp" %>
		 <c:if test="${score>=60}">
	     	<h2>합격</h2>
	
	     </c:if>
		 <c:if test="${score<60}">
	     	<h2>불합격</h2>
	
	     </c:if>


</body>
</html>