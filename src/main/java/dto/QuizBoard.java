package dto;

public class QuizBoard {
	
	 private int seq;
	 private String writer; 
	 private String subject; 
	 private String content;
	 
	public QuizBoard() {
		super();
	}

	public QuizBoard(int seq, String writer, String subject, String content) {
		super();
		this.seq = seq;
		this.writer = writer;
		this.subject = subject;
		this.content = content;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "QuizBoard [seq=" + seq + ", writer=" + writer + ", subject=" + subject + ", content=" + content + "]";
	}
	
	 
	 

}
