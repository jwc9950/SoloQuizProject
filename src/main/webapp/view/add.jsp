<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
 
<!DOCTYPE html>
<html>

<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
    
		$().ready(function(){
				
			// button의 id 값을 가지고 와서 클릭시 함수 실행하도록함.
				$("#send").click(function(){
					
					// ajax요청시 json 형태로 보내기 위해 객체에 저장하게 됨
					var params = {
						//키    : 값  의 json형태
						writer : $("#writer").val() ,  //input의 id값을 받아옴
						subject : $("#subject").val(), 
						content : $("#content").val()
					}
					
					// ajax 통신
					$.ajax({
						url : "add.jsp",  //호출시 url
						type : "post",   //post방식으로 보냄
						data : params,   //데이터를 params 객체에 보냄
						success: function(){ //유효성체크
							//만약에 공백이라면 실패하였습니다라고 하며 공백이 아니라면 성공하였습니다.
							if(params.writer == "" || params.subject == "" || content.params ==""){
								alert("실패 하였습니다..빈칸을 모두 입력해주세요");
	
							}else{
								alert('등록성공하였습니다');
							}
							
						},
					
					});
					
				});
				
			});
    
    	
    
    </script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		 
		   <%@include file="../home.jsp" %>
		 
		 <form action="/practice01/add.board" name="frmname" method="get" >
		  
		  	 <table border="1" >
		  	 	<h2>등록</h2>
		  	 
		  	 	
		  	 	<tr>
		  	 			<td>
		  	 			작성자	<input type="text" name="writer" id="writer">
		  	 			</td>
		  	 	</tr>
		  	    <tr>
		  	 			<td>
		  	 			제목	<input type="text" name="subject" id="subject">
		  	 			</td>
		  	 	</tr>
		  	 	<tr>
		  	 			<td>
		  	 			내용	<input type="text" name="content" id="content">
		  	 			</td>
		  	 	</tr>
		  	 
		  	 	
		  	 </table>
		  		<input type="submit" value="전송" id="send">
		 
		 </form>
		 
		 
</body>
</html>