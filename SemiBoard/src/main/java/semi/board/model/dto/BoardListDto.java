package semi.board.model.dto;

//이름           널?       유형             
//------------ -------- -------------- 
//BOARD_ID     NOT NULL NUMBER         
//SUBJECT      NOT NULL VARCHAR2(120)  
//CONTENT      NOT NULL VARCHAR2(4000) 
//WRITE_TIME   NOT NULL TIMESTAMP(6)   
//LOG_IP                VARCHAR2(15)   
//BOARD_WRITER NOT NULL VARCHAR2(20)   
//HIT          NOT NULL NUMBER    

//BOARD_ID, TITLE, FILE, WRITER, WRITE_TIME, HIT - SELECT ALL

public class BoardListDto {
	private Integer boardId;
	private String subject;
	private String boardWriter;
	private String writeTime;
	private Integer hit;
	@Override
	public String toString() {
		return "BoardListDto [boardId=" + boardId + ", subject=" + subject + ", boardWriter=" + boardWriter
				+ ", writeTime=" + writeTime + ", hit=" + hit + "]";
	}
	public BoardListDto(Integer boardId, String subject, String boardWriter, String writeTime, Integer hit) {
		super();
		this.boardId = boardId;
		this.subject = subject;
		this.boardWriter = boardWriter;
		this.writeTime = writeTime;
		this.hit = hit;
	}
	public Integer getBoardId() {
		return boardId;
	}
	public void setBoardId(Integer boardId) {
		this.boardId = boardId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getWriteTime() {
		return writeTime;
	}
	public void setWriteTime(String writeTime) {
		this.writeTime = writeTime;
	}
	public Integer getHit() {
		return hit;
	}
	public void setHit(Integer hit) {
		this.hit = hit;
	}

	
	
	
}
