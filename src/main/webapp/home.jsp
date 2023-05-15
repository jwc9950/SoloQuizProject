<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>최지웅</title>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  		<script type="text/javascript">
  		
  		
  		
  		</script>
    	
    
   <style type="text/css">
    	
    
    </style> 
    
    
</head>
<body> 
    <div class="element">
      <header>
       <hr>
       		   <a href="/practice01/view/memberlogin.jsp">로그인</a>  <a href="/practice01/view/memberjoin.jsp">회원가입</a>
       <hr>
       <h2> JSP 퀴즈웹 개인포트폴리오  (최지웅)</h2>   		 
       <article> 
       	    <h4>소개</h4>
       	    
       	    <ul>
       	    	<li><h5>1. CRUD를 이용한 게시판만들기</h5></li>
       	    	<li><h5>2. 자바개념으로 퀴즈문제만들기</h5></li>
       	    	<li><h5>3. 회원가입과 로그인</h5></li> 
       	    </ul>

       </article>      
    </header>
    <nav>
    <hr>
	     <h2 id="id1">게시판구현</h2>
	     		<table border="1">
	     		  <tr>
	     		  	<td><a href="/practice01/view/add.jsp">등록 </a></td>
	     		  </tr>
	     		   <tr>
	     		  	<td><a href="/practice01/view/list.jsp">리스트</a></td>
	     		  </tr>
	     		
	     		</table>
	     
	          
	           
    <hr>  
    	<h2 id="id2">문제편</h2>        
    			<table border="1">
    				<tr>
    					<td> <a href="/practice01/view/one.jsp">1. 상식문제 2문제</a></td>
    				</tr>
    				<tr>
    					<td> <a href="/practice01/view/two.jsp">2. 영어단어문제5문제</a></td>
    				</tr>
    			</table>
    	
    	 
	           
	            
        <hr>
    </nav>
 
    </div>
    
   <!--  제이쿼리 -->
    <script>
    	/* 위에 게시판 구현이라는 글자를 red로 색깔을 변경함 */
    	     /*  id를 선택하여 css를 변경하도록 하였다 */
    	$('#id1').css('color','red')
    	
    /* 	위에 문제편 이라는 단어를 블루으 색깔로 변경 */
    	
    	$('#id2').css('color','blue')
    	
    	
    	
    </script>
    
  
</body>
</html>
