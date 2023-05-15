package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.QuizMemberDao;
import dto.QuizMember;

/**
 * Servlet implementation class QuizMemberController
 */
@WebServlet("*.member")
public class QuizMemberController extends HttpServlet {
	
		QuizMemberDao dao = new QuizMemberDao();
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		String uri=request.getRequestURI();
		System.out.println(uri);
		
		
		if (uri.contains("join")) {
			String id=  request.getParameter("id");
			String pw =  request.getParameter("pw");
			
			QuizMember quizmember = new QuizMember();
			quizmember.setId(id);
			quizmember.setPw(pw);
			
			dao.insert(quizmember);
			
			response.sendRedirect("/practice01/home.jsp");
			
		}
		else if(uri.contains("login")) {
			//뷰에 있는 input name값의 id.pw를 가지고옴
			String id=  request.getParameter("id");
			String pw =  request.getParameter("pw");
			
			
			
			//DAO에 있는 회원가입후 데이터베이스에 저장된 selectOne에서 의 id값과
			// 로그인 뷰 창에서 입력한 id 값이 일치 한다면 로그인성공으로 콘솔창에 뜨며
			// home.jsp 화면으로 이동하게 하였다.
			 QuizMember quizmember=dao.selectOne(id);
			 if(quizmember.getId().equals(id)) {
				 response.sendRedirect("/practice01/home.jsp");
				 System.out.println("로그인성공");
				 
				 //로그인 실패시에 다시 입력하도록 memberlogin.jsp 화면으로 다시 가도록함
			 }else if (!quizmember.equals(id)){
				 response.sendRedirect("/practice01/view/memberlogin.jsp");
				 System.out.println("로그인실패");
				 
			 }
			
		
			
			
			
			
		}
			
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
