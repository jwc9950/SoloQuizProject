<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="dto.QuizBoard"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

 <script type="text/javascript">
 	function listCheck(event){
 		
 		confirm('조회하시겠습니까');
 		
 	}
 
 </script>


</head>
<body>
<%--   ${blist}  --%>

	 <%@include file="../home.jsp" %>
		<h2>등록한거에 대한조회</h2>
	<form action="/practice01/list.board" method="get">
	
		<table border="1">
			<tr>
				<th>순번</th>
				<th>작성자</th>
				<th>제목</th>
				<th>내용</th>
			</tr>
	
			 <c:forEach var="blist" items="${blist}">
            <tr>
                <td>${blist.seq}</td>
                <td>${blist.writer}</td>
                <td><a href="/practice01/detail.board?seq=${blist.seq}">${blist.subject}</a></td>
                <td>${blist.content}</td>
              
            </tr>
        </c:forEach>
			
		</table>
	   <button onclick="listCheck(event)" >조회하기</button>
	   <a href="/practice01/home.jsp">홈으로</a>
	</form>

</body>
</html>