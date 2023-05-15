<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <div class="quiz">
    
       <%@include file="../home.jsp" %>
    
    
     <h1>퀴즈웹- 영어단어문제</h1>
      
      
      
      
     <form name="frmname" action="/practice01/quiz2.view" method="post">
     	
       <ul>
         <li>
            <p id="p1">문제 1. 도시의 영어단어는?  [20점]</p>
           		banana<input type="checkbox" id="check1" name="b1" value="banana">
           		name<input type="checkbox" id="check2" name="b1" value="name">
           		city<input type="checkbox" id="check3" name="b1" value="city">
           		mouse<input type="checkbox" id="check4" name="b1" value="mouse">
           		computer<input type="checkbox" id="check5" name="b1" value="computer">
          </li>
             <li>
            <p id="p2">문제 2. 컴퓨터의 영어단어는 ?  [20점]</p>
           		computer<input type="checkbox" id="check1" name="b2" value="computer">
           		logic<input type="checkbox" id="check2" name="b2" value="logic">
           		hand<input type="checkbox" id="check3" name="b2" value="hand">
           		my<input type="checkbox" id="check4" name="b2" value="my">
           		car<input type="checkbox" id="check5"name="b2"  value="car">	
          </li>
             <li>
            <p id="p3">문제 3. 새의 영어단어는?  [20점]</p>
           		bird<input type="checkbox" id="check1" name="b3" value="bird">
           		dog<input type="checkbox" id="check2" name="b3" value="dog">
           		apple<input type="checkbox" id="check3" name="b3" value="apple">
           		lol<input type="checkbox" id="check4" name="b3" value="lol">
           		handle<input type="checkbox" id="check5"name="b3"  value="handle">	
          </li>
             <p id="p4">문제 4. 나무의 영어단어는? [20점]</p>
           		wood<input type="checkbox" id="check1" name="b4" value="wood">
           		law<input type="checkbox" id="check2" name="b4" value="law">
           		load<input type="checkbox" id="check3" name="b4" value="load">
           		root<input type="checkbox" id="check4" name="b4" value="root">
           		mysql<input type="checkbox" id="check5"name="b4"  value="mysql">	
          </li>
           </li>
             <p id="p5">문제 5. 자바의 영어단어는?  [20점]</p>
           		java<input type="checkbox" id="check1" name="b5" value="java">
           		jsp<input type="checkbox" id="check2" name="b5" value="jsp">
           		spring<input type="checkbox" id="check3" name="b5" value="spring">
           		flutter<input type="checkbox" id="check4" name="b5" value="flutter">
           		oracle<input type="checkbox" id="check5"name="b5"  value="oracle">	
          </li>
        
        
        
        </ul>
        
        <button type="submit" onclick="quiz2(event)">제출</button>

    
     </form>
    
    <hr>
     
     <input type="text" id="practice"> 답안일시저장하기.  눌러주세요
     	<button id="buttonid">추가</button>
     	<ul id="temporary"></ul>
     
     	<script>
     		$('#buttonid').on('click',()=>{
     		  var practice=	$('#practice').val();
     		  
     		 /*  append 메소드를 이용하요 ul태그에서 리스트 내용을 계속 추가할수있다. */
     		  $('#temporary').append('<ul>'+practice+'<ul>')
     		  
     		
     			
     		})
     	
     	
     	</script>
     
     
    
    </div>




</body>
</html>