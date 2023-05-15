package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import dto.QuizBoard;

public class QuizBoardDao {
	
	private Connection con;
	private PreparedStatement pstmt;
	private String sql;
	
	
	//insert
	public int insert(QuizBoard quizboard) {
		
		int cnt=0;
		con=DBConn.getConnection();  
		sql = "insert into practice01 (seq,writer,subject,content) values (s_seq.nextval,?,?,?)";
		
		
		try {
			 pstmt=con.prepareStatement(sql);
		
			 pstmt.setString(1, quizboard.getWriter());
			 pstmt.setString(2, quizboard.getSubject());
			 pstmt.setString(3, quizboard.getContent());
			 
			  cnt=pstmt.executeUpdate();
			 System.out.println(cnt);
			 
			 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("insert예외발생");
			e.printStackTrace();
	
		}
			return cnt;
		
	}
	
	public int update(QuizBoard quizboard) {
		int cnt=0;
		con = DBConn.getConnection();
		sql = "update practice01 set  writer = ?, subject = ?,  content= ? where seq =?";
		
		try {
			pstmt= con.prepareStatement(sql);
		
			pstmt.setString(1, quizboard.getWriter());
		    pstmt.setString(2, quizboard.getSubject());
			pstmt.setString(3, quizboard.getContent());
			pstmt.setInt(4,quizboard.getSeq());
			cnt = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("update예외발생");
			e.printStackTrace();
		}
		return cnt;
	}
	
	public int delete(int seq) {
		int cnt=0;
		con = DBConn.getConnection();
		sql= "delete from practice01 where seq = ?";
		
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, seq);
			cnt=pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("delete예외발생");
			e.printStackTrace();
		}
		return cnt;
	}  
	
	
	public QuizBoard selectOne(int seq) {
		QuizBoard quizboard= new QuizBoard();
		
		con=DBConn.getConnection();
		sql= "select * from practice01 where seq =?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, seq);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				
				quizboard.setSeq(rs.getInt("seq"));
				quizboard.setWriter(rs.getString("writer"));
				quizboard.setSubject(rs.getString("subject"));
				quizboard.setContent(rs.getString("content"));
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("selectOne예외발생");
			e.printStackTrace();
		}
		return quizboard;
		
	}
	
public List<QuizBoard> selectList(){
		
		List<QuizBoard> blist = new ArrayList<>();
		con= DBConn.getConnection();
		sql= "select * from practice01";
		try {
		pstmt=con.prepareStatement(sql);
		ResultSet rs =pstmt.executeQuery();
		
		while(rs.next()) {
			QuizBoard quizboard = new QuizBoard();
			quizboard.setSeq(rs.getInt("seq"));
			quizboard.setWriter(rs.getString("writer"));
			quizboard.setSubject(rs.getString("subject"));
			quizboard.setContent(rs.getString("content"));
			
			blist.add(quizboard);
			
		}
		
		
	
		} catch (Exception e) {
			System.out.println("selectList예외발생");
			e.printStackTrace();
		}
		return blist;
		
	}
	

}
