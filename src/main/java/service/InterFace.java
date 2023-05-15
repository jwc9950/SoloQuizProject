package service;

public interface InterFace {

	//메소드 오버로딩  (메소드는 동일시하고 매개변수만 달리해서 다른 유형의 문제가 될수 있도록하였다.
	int Answer(String[] c1, String[]c2);  // 상식문제를 관여하는 메소드
	int Answer(String[] b1, String[]b2,String[] b3, String[] b4, String[] b5); //영어단어문제
	
}
