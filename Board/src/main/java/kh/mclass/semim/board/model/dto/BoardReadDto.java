package kh.mclass.semim.board.model.dto;

import java.util.List;

public class BoardReadDto {
	private Integer boardId;
	private String subject;
	private String content;
	private String writeTime;  // TIMESTAMP
	private String logIp;
	private String boardWriter;
	private Integer hit;
//	private List<BoardReplyListDto> replydtolist;
	private List<FileReadDto> filedtolist;
	@Override
	public String toString() {
		return "BoardReadDto [boardId=" + boardId + ", subject=" + subject + ", content=" + content + ", writeTime="
				+ writeTime + ", logIp=" + logIp + ", boardWriter=" + boardWriter + ", hit=" + hit + ", filedtolist="
				+ filedtolist + "]";
	}
	public BoardReadDto(Integer boardId, String subject, String content, String writeTime, String logIp,
			String boardWriter, Integer hit) {
		super();
		this.boardId = boardId;
		this.subject = subject;
		// 줄바꾸기, 띄워쓰기를 HTML 태그로 변경
		content = content.replaceAll("\\r?\\n", "<br>");
		content = content.replaceAll(" ", "&nbsp;");
		this.content = content;
		this.writeTime = writeTime;
		this.logIp = logIp;
		this.boardWriter = boardWriter;
		this.hit = hit;
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
	public String getWriteTime() {
		return writeTime;
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
	public List<FileReadDto> getFiledtolist() {
		return filedtolist;
	}
	public void setFiledtolist(List<FileReadDto> filedtolist) {
		this.filedtolist = filedtolist;
	}
	
	
}
