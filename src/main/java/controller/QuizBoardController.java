package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.QuizBoardDao;

import dto.QuizBoard;

/**
 * Servlet implementation class QuizBoardController
 */
@WebServlet("*.board")
public class QuizBoardController extends HttpServlet {
	
	
	 QuizBoardDao dao = new QuizBoardDao();
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String uri=request.getRequestURI();
		System.out.println(uri);
		
		
		if(uri.contains("add")) {
			
			String writer =request.getParameter("writer");
			String subject =request.getParameter("subject");
			String content=request.getParameter("content");
			
			QuizBoard quizboard = new QuizBoard();
			quizboard.setWriter(writer);
			quizboard.setSubject(subject);
			quizboard.setContent(content);
			System.out.println(quizboard);
			
			dao.insert(quizboard);
			
			//등록을 하면 home.jsp로 이동하게 만듬.
			response.sendRedirect("/practice01/home.jsp");
		}
		else if(uri.contains("list")) {
			System.out.println(uri);
			
			 List<QuizBoard>blist= dao.selectList();
			 System.out.println(blist);
			 
			 request.setAttribute("blist", blist);
			 request.getRequestDispatcher("/view/list.jsp").forward(request, response);
			
		}
		else if(uri.contains("detail")) {
			
			 int seq = Integer.parseInt(request.getParameter("seq"));
		      System.out.println("detail"+seq);
		      QuizBoard quizboard = dao.selectOne(seq);
		        request.setAttribute("quizboard", quizboard);
		        System.out.println(quizboard);
		        request.getRequestDispatcher("/view/modify.jsp").forward(request, response);
			
		}
		else if(uri.contains("modiform")) {
			int seq = Integer.parseInt(request.getParameter("seq"));
			//dao selectOne호출
			QuizBoard quizboard = dao.selectOne(seq);
			//modify.jsp로 이동(board)
			request.setAttribute("quizboard", quizboard);
		
			request.getRequestDispatcher("/view/modify.jsp")
				.forward(request, response);
			
		}
		else if(uri.contains("modify")) {
			int seq = Integer.parseInt(request.getParameter("seq"));
			String writer =request.getParameter("writer");
			String subject =request.getParameter("subject");
			String content=request.getParameter("content");
			QuizBoard quizboard = new QuizBoard();
			quizboard.setSeq(seq);
			quizboard.setWriter(writer);
			quizboard.setSubject(subject);
			quizboard.setContent(content);
			System.out.println(quizboard);
			  request.setAttribute("quizboard", quizboard);
			dao.update(quizboard);
			//수정후 리스트로
			response.sendRedirect("/practice01/view/list.jsp");
	
		}
		else if(uri.contains("remove")) {
			int seq = Integer.parseInt(request.getParameter("seq"));
			int cnt = dao.delete(seq);
			System.out.println("삭제될번호"+cnt);
			response.sendRedirect("/practice01/view/list.jsp");
		}
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
