package kh.mclass.semim.board.model.dto;

public class BoardInsertDto {

//	이름           널?       유형             
//	------------ -------- -------------- 
//	BOARD_ID     NOT NULL NUMBER         
//	SUBJECT      NOT NULL VARCHAR2(120)  
//	CONTENT      NOT NULL VARCHAR2(4000) 
//	WRITE_TIME   NOT NULL TIMESTAMP(6)   
//	LOG_IP                VARCHAR2(15)   
//	BOARD_WRITER NOT NULL VARCHAR2(20)   
//	HIT          NOT NULL NUMBER         

	private String subject;
	private String content;
	private String boardWriter;

	@Override
	public String toString() {
		return "BoardDto [subject=" + subject + ", content=" + content +", boardWriter=" + boardWriter + "]";
	}

	public BoardInsertDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardInsertDto(String subject, String content,  String boardWriter) {
		super();
		this.subject = subject;
		this.content = content;
		this.boardWriter = boardWriter;
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

	


	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}



}
