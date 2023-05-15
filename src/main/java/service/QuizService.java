package service;

import java.util.Iterator;


//인터페이스로 메소드를 구현함
public class QuizService implements InterFace {
	
	
	//interface로 Answer메소드구현
	public int Answer(String[] c1, String[]c2) {
		
		int score=0;
		  
		//null체크를 해야한다. 이유는 만약에  정답보기 외에 다른 보기를 체크시 에러가 나기때문이다.
		if(c1==null|| c2==null) {
			System.out.println("에러입니다. 체크를 무조건 다해야합니다.");
			
			//null이 아닌지 확인후 진행한다.
			
		}else {
				//foreach문을 사용하여 반복문을 돌면서 c1, c2배열이 
				//answer의 String변수에 저장하여   체크된값이 checkbox의 value의
				//값과 일치한다면 점수 +10을 주고 틀리면 정답이 아닙니다라고 
				//출력되며 점수는 없다.
			
			//c1의 String[]배열이 문자열 변수에 저장하며 반복문을 돌게된다.
			for(String answer: c1) {
				//만약에 변수 answer과 서울이라는 체크박스의 value 값이 동일하다면
				//10점을 score 변수에 저장하도록한다.
				if(answer.equals("서울")) {
					score +=10;
					System.out.println("서울이 정답니다.10점추가");
				//만약에 서울이라는 체크박스이 value 값이 선택한값과 일치하지않는다면
				//정답이 아니라는 내용을 콘솔창에 뿌려준다.
				}else if(!answer.equals("서울")) {
					System.out.println("1번문제 정답이 아닙니다.");
				}
			}
			//위와 동일한 논리
			for(String answer:c2){
				if(answer.equals("1592년")) {
					score +=10;
					System.out.println("1592년이 정답니다.10점추가");
				   
				}else if(!answer.equals("1592년")) {
					System.out.println("2번문제 정답이 아닙니다.");
				}
			}
		} 
			//score을 반환하여 그에 대한 타입은 int이며 메소드에 타입을 int로 하게된다.
		return score;
	}
	
	//interface로 Answer메소드구현  // 매게변수만 달리해서 더 추가하였다.
	public int Answer(String[] b1, String[]b2, String[] b3, String[] b4, String[] b5) {
		int score=0;
		  
		//null체크를 해야한다. 이유는 만약에  정답보기 외에 다른 보기를 체크시 에러가 나기때문이다.
		if(b1==null|| b2==null || b3==null || b4==null || b5==null) {
			System.out.println("에러입니다. 체크를 무조건 다해야합니다.");
			
			//null이 아닌지 확인후 진행한다.
			
		}else {
			
				//foreach문을 사용하여 반복문을 돌면서 c1, c2배열이 
				//answer의 String변수에 저장하여   체크된값이 checkbox의 value의
				//값과 일치한다면 점수 +10을 주고 틀리면 정답이 아닙니다라고 
				//출력되며 점수는 없다.
			for(String answer: b1) {
				if(answer.equals("city")) {
					score +=20;
					System.out.println("(city)이 정답니다.20점추가");
				}else if(!answer.equals("city")) {
					System.out.println("1번문제 정답이 아닙니다.");
				}
			}
			for(String answer:b2){
				if(answer.equals("computer")) {
					score +=20;
					System.out.println("(computer)이 정답니다.20점추가");
				   
				}else if(!answer.equals("computer")) {
					System.out.println("2번문제 정답이 아닙니다.");
				}
			}
		} 
		for(String answer:b3){
			if(answer.equals("bird")) {
				score +=20;
				System.out.println("(bird)이 정답니다.20점추가");
			   
			}else if(!answer.equals("bird")) {
				System.out.println("3번문제 정답이 아닙니다.");
			}
		}
		for(String answer:b4){
			if(answer.equals("wood")) {
				score +=20;
				System.out.println("(wood)이 정답니다.20점추가");
			   
			}else if(!answer.equals("wood")) {
				System.out.println("4번문제 정답이 아닙니다.");
			}
		}
		for(String answer:b5){
			if(answer.equals("java")) {
				score +=20;
				System.out.println("(java)이 정답니다.20점추가");
			   
			}else if(!answer.equals("java")) {
				System.out.println("5번문제 정답이 아닙니다.");
			}
		}
	
			//score을 반환하여 그에 대한 타입은 int이며 메소드에 타입을 int로 하게된다.
		return score;
		
		
		
		
		
	}
	
	
	
	
	
}
