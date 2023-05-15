<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
  
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
   <script type="text/javascript">
         function quiz1(e){
        	 
        	 
        	 	
         }
   
   </script>
  
  
  
    <meta charset="UTF-8">
    <title>퀴즈웹</title>
    <style>

    </style>
 
  </head>
  <body>
  
    <div class="quiz">
    
       <%@include file="../home.jsp" %>
    
    
     <h1>퀴즈웹- 상식문제</h1>
      
      
      
      
     <form name="frmname" action="/practice01/quiz1.view" method="post">
     	
       <ul>
         <li>
            <p id="p1">문제 1. 다음 중 가장 큰 도시는?  [10점]</p>
           		부산<input type="checkbox" id="check1" name="c1" value="부산">
           		인천<input type="checkbox" id="check2" name="c1" value="인천">
           		창원<input type="checkbox" id="check3" name="c1" value="창원">
           		서울<input type="checkbox" id="check4" name="c1" value="서울">
           		대구<input type="checkbox" id="check5" name="c1" value="대구">
          </li>
             <li>
            <p id="p2">문제 2. 임진왜란의 발생연도 ?  [10점]</p>
           		1592년<input type="checkbox" id="check1" name="c2" value="1592년">
           		1393년<input type="checkbox" id="check2" name="c2" value="1393">
           		1423년<input type="checkbox" id="check3" name="c2" value="1423">
           		1500년<input type="checkbox" id="check4" name="c2" value="1500년">
           		1000년<input type="checkbox" id="check5"name="c2"  value="1000년">
           		
          </li>
        
        
        
        </ul>
        
        <button type="submit" onclick="quiz1(event)">제출</button>

     
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
