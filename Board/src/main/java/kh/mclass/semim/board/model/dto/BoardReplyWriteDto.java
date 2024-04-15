package kh.mclass.semim.board.model.dto;

public class BoardReplyWriteDto {
	// Integer 초기값 null
	// int 초기값 0
	private Integer boardReplyId;
	private Integer boardId;
	private String boardReplyWriter;
	private String boardReplyContent;
	private String boardReplyLogIp;

	@Override
	public String toString() {
		return "BoardReplyWriteDto [boardReplyId=" + boardReplyId + ", boardId=" + boardId + ", boardReplyWriter="
				+ boardReplyWriter + ", boardReplyContent=" + boardReplyContent + ", boardReplyLogIp=" + boardReplyLogIp
				+ "]";
	}

	public BoardReplyWriteDto() {
		super();
	}

	public BoardReplyWriteDto(Integer boardReplyId, Integer boardId, String boardReplyWriter, String boardReplyContent,
			String boardReplyLogIp) {
		super();
		this.boardReplyId = boardReplyId;
		this.boardId = boardId;
		this.boardReplyWriter = boardReplyWriter;
		this.boardReplyContent = boardReplyContent;
		this.boardReplyLogIp = boardReplyLogIp;
	}

	public Integer getBoardReplyId() {
		return boardReplyId;
	}

	public Integer getBoardId() {
		return boardId;
	}

	public String getBoardReplyWriter() {
		return boardReplyWriter;
	}

	public String getBoardReplyContent() {
		return boardReplyContent;
	}

	public String getBoardReplyLogIp() {
		return boardReplyLogIp;
	}
}
