package kh.mclass.semim.board.model.dto;

import java.util.List;

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
	private List<FileWriteDto> fileList;
	@Override
	public String toString() {
		return "BoardInsertDto [subject=" + subject + ", content=" + content + ", boardWriter=" + boardWriter
				+ ", fileList=" + fileList + "]";
	}
	public BoardInsertDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardInsertDto(String subject, String content, String boardWriter, List<FileWriteDto> fileList) {
		super();
		this.subject = subject;
		this.content = content;
		this.boardWriter = boardWriter;
		this.fileList = fileList;
	}
	public String getSubject() {
		return subject;
	}
	public String getContent() {
		return content;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public List<FileWriteDto> getFileList() {
		return fileList;
	}

	


}
