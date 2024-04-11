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
	private String boardWriter;
	private String writeTime;
	private Integer hit;

	@Override
	public String toString() {
		return "BoardListDto [boardId=" + boardId + ", subject=" + subject + ", boardWriter=" + boardWriter
				+ ", writeTime=" + writeTime + ", hit=" + hit + "]";
	}

	public BoardListDto(Integer boardId, String subject, String writeTime, String boardWriter, Integer hit) {
		super();
		this.boardId = boardId;
		this.subject = subject;
		this.writeTime = writeTime;
		this.boardWriter = boardWriter;
		this.hit = hit;
	}

	public Integer getBoardId() {
		return boardId;
	}

	public String getSubject() {
		return subject;
	}

	public String getWriteTime() {
		return writeTime;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public Integer getHit() {
		return hit;
	}

}