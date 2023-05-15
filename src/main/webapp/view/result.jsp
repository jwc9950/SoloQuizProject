<%@page import="java.io.Console"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
      
   
     
      
<!DOCTYPE html>
<html>
<head>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<!-- 상식문제의 합격유무 확인창 -->


		   <%@include file="../home.jsp" %>
		 <c:if test="${score>=20}">
	     	<h2>합격</h2>
	
	     </c:if>
		<c:if test="${score<20}">
	     	<h2>불합격</h2>
			
	     </c:if>
	
	


    

		






</body>
</html>