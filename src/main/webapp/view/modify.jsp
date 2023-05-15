<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="dto.QuizBoard"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
 
 <%
QuizBoard quizboard = (QuizBoard)request.getAttribute("quizboard");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">




function removeCheck(url, seq) {
	  if (confirm("정말로 삭제하시겠습니까?")) {
	    location.href = url + "?seq=" + seq;
	  }
	}


</script>

</head>
<body>
${board} 
  <h2>수정하기</h2>
<%@include file="../home.jsp" %>


	<form action="/practice01/modify.board" name="frmname">
	
	
		  	 <table border="1" >
		  	 	<h2>수정하기</h2>
		  	 		<tr>
		  	 			<td>
		  	 			순번	<input type="number" name="seq" value="${quizboard.getSeq()}">
		  	 			</td>
		  	 	</tr>
		  	 	
		  	 	<tr>
		  	 			<td><%-- ${board.getWriter --%>
		  	 			작성자	<input type="text" name="writer" value="${quizboard.getWriter()}">
		  	 			</td>
		  	 	</tr>
		  	    <tr>
		  	 			<td>
		  	 			제목	<input type="text" name="subject" value="${quizboard.getSubject()}">
		  	 			</td>
		  	 	</tr>
		  	 	<tr>
		  	 			<td>
		  	 			내용	<input type="text" name="content" value="${quizboard.getContent()}">
		  	 			</td>
		  	 	</tr>
		  	 
		  	 	
		  	 </table>
		  		<input type="submit" value="수정하기">
<%-- 	 		  
	<button onclick="location.href='/Page01/remove.view?seq=${board.seq}'">삭제</button> --%>
					 <a href="/practice01/remove.board?seq=${quizboard.seq}">삭제</a>
	</form>


</body>
</html>