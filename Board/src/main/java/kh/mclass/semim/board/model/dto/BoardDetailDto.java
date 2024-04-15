package kh.mclass.semim.board.model.dto;

import java.util.List;

public class BoardDetailDto {

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
	private String content;
	private String wirteTime;
	private String logIp;
	private String boardWriter;
	private Integer hit;
	private List<BoardReplyDto> replydtolist;
	@Override
	public String toString() {
		return "BoardDetailDto [boardId=" + boardId + ", subject=" + subject + ", content=" + content + ", wirteTime="
				+ wirteTime + "logIp=" + logIp + ", boardWriter=" + boardWriter + ", hit=" + hit + ", replydtolist="
				+ replydtolist + "]";
	}
	public BoardDetailDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardDetailDto(Integer boardId, String subject, String content, String wirteTime, String logIp, String boardWriter,
			Integer hit) {
		super();
		this.boardId = boardId;
		this.subject = subject;
		this.content = content;
		this.wirteTime = wirteTime;
		this.logIp = logIp;
		this.boardWriter = boardWriter;
		this.hit = hit;
//		this.boardReplyDtoList = boardReplyDtoList;
	}
	public Integer getBoardId() {
		return boardId;
	}
	public String getSubject() {
		return subject;
	}
	public String getContent() {
		return content;
	}
	public String getWirteTime() {
		return wirteTime;
	}
	public String getLogIp() {
		return logIp;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public Integer getHit() {
		return hit;
	}
	public List<BoardReplyDto> getReplydtolist() {
		return replydtolist;
	}

	public void setReplydtolist(List<BoardReplyDto> boardReplyDtoList) {
		this.replydtolist = boardReplyDtoList;
	}
	
	
}
