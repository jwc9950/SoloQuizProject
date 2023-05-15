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

/*   function fnremove(seq){
	
		    location.href = "/Page01/remove.view?seq=" + seq;
		  
	  
  }
 */

</script>


</head>
<body>
<h2>상세조회</h2>



	
	
	<form action="/practice01/detail.board">
	 <table border="1">
		<tr>
			<th>번호</th>
			<td>${quizboard.seq}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${quizboard.writer}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${quizboard.subject}</td>
		</tr>		
		<tr>
			<th>내용</th>
			<td> <pre>${quizboard.content}</pre> </td>
		</tr>	
			
	</table> 

	
	
				<button onclick="location.href='/practice01/modiform.board?seq=${quizboard.seq}'">수정</button>
			
				
	</form>
	
	



</body>
</html>