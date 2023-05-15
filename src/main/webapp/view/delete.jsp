<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">

function submitForm() {
    document.getElementById("deleteform_id").submit();
}
</script>


</head>
<body>


	<form action="/practice01/remove.board" id="deleteform_id">
		
			<input type="number" name="seq" value="${quizboard.seq}">
			
		 <input type="button" value="삭제버튼" onclick="submitForm()">
			
		</form>


</body>
</html>