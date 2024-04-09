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


public class BoardDto {
	private Integer boardId;
	private String subject;
	private String content;
	private String writeTime;
	private String logIp;
	private String boardWrier;
	private Integer hit;
	@Override
	
	public String toString() {
		return "BoardDto [boardId=" + boardId + ", subject=" + subject + ", content=" + content + ", writeTime="
				+ writeTime + ", logIp=" + logIp + ", boardWrier=" + boardWrier + ", hit=" + hit + "]";
	}
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardDto(Integer boardId, String subject, String content, String writeTime, String logIp, String boardWrier,
			Integer hit) {
		super();
		this.boardId = boardId;
		this.subject = subject;
		this.content = content;
		this.writeTime = writeTime;
		this.logIp = logIp;
		this.boardWrier = boardWrier;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriteTime() {
		return writeTime;
	}
	public void setWriteTime(String writeTime) {
		this.writeTime = writeTime;
	}
	public String getLogIp() {
		return logIp;
	}
	public void setLogIp(String logIp) {
		this.logIp = logIp;
	}
	public String getBoardWrier() {
		return boardWrier;
	}
	public void setBoardWrier(String boardWrier) {
		this.boardWrier = boardWrier;
	}
	public Integer getHit() {
		return hit;
	}
	public void setHit(Integer hit) {
		this.hit = hit;
	}
	
	
}

