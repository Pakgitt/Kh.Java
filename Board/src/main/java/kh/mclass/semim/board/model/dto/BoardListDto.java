package kh.mclass.semim.board.model.dto;

public class BoardListDto {

//	이름           널?       유형             
//	------------ -------- -------------- 
//	BOARD_ID     NOT NULL NUMBER         
//	SUBJECT      NOT NULL VARCHAR2(120)  
//	CONTENT      NOT NULL VARCHAR2(4000) 
//	WRITE_TIME   NOT NULL TIMESTAMP(6)   
//	LOG_IP                VARCHAR2(15)   
//	BOARD_WRITER NOT NULL VARCHAR2(20)   
//	HIT          NOT NULL NUMBER         

	private Integer boardId;
	private String subject;
	private String wirteTime;
	private String boardWriter;
	private Integer hit;

	@Override
	public String toString() {
		return "BoardDto [boardId=" + boardId + ", subject=" + subject + ", wirteTime="
				+ wirteTime +  ", boardWriter=" + boardWriter + ", hit=" + hit + "]";
	}

	public BoardListDto(Integer boardId, String subject, String wirteTime, String boardWriter, Integer hit) {
		super();
		this.boardId = boardId;
		this.subject = subject;
		this.wirteTime = wirteTime;
		this.boardWriter = boardWriter;
		this.hit = hit;
	}

	public Integer getBoardId() {
		return boardId;
	}

	public String getSubject() {
		return subject;
	}

	public String getWirteTime() {
		return wirteTime;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public Integer getHit() {
		return hit;
	}
	
}