package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.QuizService;

/**
 * Servlet implementation class QuizController
 */
@WebServlet("*.view")
public class QuizController extends HttpServlet {
	
	QuizService quizservice = new QuizService(); 
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		System.out.println(uri);
		
		
		
		
		if(uri.contains("quiz1")) {
			
			String[] c1= null;
			String[] c2= null;
			
			//뷰에서 체크박스에서 저장된 내용을 서버에 불러온다.
			 c1=request.getParameterValues("c1");
			 c2= request.getParameterValues("c2");
			
			 //서비스에서 정답유무와 점수유무를 파악할수있게 한다.
			int score=quizservice.Answer(c1, c2);
			System.out.println(score +"점 입니다.");
			
			
			//controller에서 switch문을 사용하여 합격 유뷰를 판별하여 콘솔창에 출력하도록한다.
			switch(score){
				case 10 :
						System.out.println("10점입니다. 불합격");
						 break;
				case 20 : 
					    System.out.println("20점 만점 합격");
					    break;
			
			}
			//결과의 score을 request객체에 담아서 dispatcher방식으로 뷰로 보냄
			request.setAttribute("score", score);
			
			//dispatcher로 뷰로 보내준다.
			request.getRequestDispatcher("/view/result.jsp").forward(request, response);
			
			
		}else if(uri.contains("quiz2")) {
			//변수선언
			String[] b1= null;
			String[] b2= null;
			String[] b3= null;
			String[] b4= null;
			String[] b5= null;
		
			//뷰에서 값을 가지고옴
			 b1=request.getParameterValues("b1");
			 b2= request.getParameterValues("b2");
			 b3=request.getParameterValues("b3");
			 b4= request.getParameterValues("b4");
			 b5=request.getParameterValues("b5");
			
			 //서비스에서 메소드 호출함 //score반환
			int score= quizservice.Answer(b1, b2, b3, b4, b5);
			System.out.println(score +"점 입니다.");
			
			//switch문을 사용하여 콘솔창에 출력을 위하여
			switch(score){
			case 20 :
					System.out.println("20점입니다.불합격 60점이상 얻어야합니다");
					 break;
			case 40 : 
				    System.out.println("40점입니다.불합격 60점이상 얻어야합니다");
				    break;
			case 60 :
					System.out.println("60점입니다.  합격커트라인입니다.");
				    break;
			case 80 :
					System.out.println("80점입니다.  합격입니다..");
				    break;
			case 100 :
					System.out.println("100점입니다. 만점입니다. 합격입니다..");
				    break;
		
		}
			//결과의 점수를 request객체에 담아서 dispatcher방식으로 뷰로 보냄
			request.setAttribute("score", score);
			request.getRequestDispatcher("/view/result2.jsp").forward(request, response);
			
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
