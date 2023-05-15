package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.QuizBoard;
import dto.QuizMember;

public class QuizMemberDao {

	
	private Connection con;
	private PreparedStatement pstmt;
	private String sql;
	
	//insert
	
	public int insert(QuizMember quizmember) {
		
		int cnt=0;
		con=DBConn.getConnection();  
		sql = "insert into quizmember (id,pw) values (?,?)";
		
		
		try {
			 pstmt=con.prepareStatement(sql);
			 pstmt.setString(1, quizmember.getId());
			 pstmt.setString(2, quizmember.getPw());
			
			  cnt=pstmt.executeUpdate();
			  System.out.println(cnt);

		} catch (Exception e) {
			System.out.println("insert예외발생");
			e.printStackTrace();

		}
		return cnt;
	}
	
	//update
	public int update(QuizMember quizmember) {
		int cnt=0;
		con = DBConn.getConnection();
		sql = "update quizmember set  pw = ?  where id = ? ";
		
		try {
			pstmt= con.prepareStatement(sql);
		
			pstmt.setString(1, quizmember.getId());
		    pstmt.setString(2, quizmember.getPw());
			
			cnt = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("update예외발생");
			e.printStackTrace();
		}
		return cnt;
	}
	
	
	//삭제
	
	public int delete(String id) {
		int cnt=0;
		con = DBConn.getConnection();
		sql= "delete from quizmember where id = ?";
		
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			cnt=pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("delete예외발생");
			e.printStackTrace();
		}
		return cnt;
	}  
	
	//한건조회
	public QuizMember selectOne(String id) {
		
		QuizMember quizmember =  new QuizMember();
		
		con=DBConn.getConnection();
		sql= "select * from quizmember where id =?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				
				quizmember.setId(rs.getString("id"));
				quizmember.setPw(rs.getString("pw"));
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("selectOne예외발생");
			e.printStackTrace();
		}
		return quizmember;
		
	}
public List<QuizMember> selectList(){
		
		List<QuizMember> mlist = new ArrayList<>();
		con= DBConn.getConnection();
		sql= "select * from quizmember";
		try {
		pstmt=con.prepareStatement(sql);
		ResultSet rs =pstmt.executeQuery();
		
		while(rs.next()) {
			QuizMember quizmember =  new QuizMember();
			
			quizmember.setId(rs.getString("id"));
			quizmember.setPw(rs.getString("pw"));
			
			
			mlist.add(quizmember);
			
		}
		
		
	
		} catch (Exception e) {
			System.out.println("selectList예외발생");
			e.printStackTrace();
		}
		return mlist;
		
	}
	
	
	
	
	
	
	
}
