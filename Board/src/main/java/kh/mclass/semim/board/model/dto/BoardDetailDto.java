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
	private String boardWriter;
	private Integer hit;
	
	private List<BoardReplyDto> boardReplyList;

}
