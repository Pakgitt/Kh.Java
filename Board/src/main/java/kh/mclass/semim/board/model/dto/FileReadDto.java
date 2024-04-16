package kh.mclass.semim.board.model.dto;

public class FileReadDto {
	private Integer boardId;
	private String boardFileId;
	private String savedFilePathName;
	private String originalFileName;
	@Override
	public String toString() {
		return "FileReadDto [boardId=" + boardId + ", boardFileId=" + boardFileId + ", savedFilePathName="
				+ savedFilePathName + ", originalFileName=" + originalFileName + "]";
	}
	public FileReadDto(Integer boardId, String boardFileId, String savedFilePathName, String originalFileName) {
		super();
		this.boardId = boardId;
		this.boardFileId = boardFileId;
		this.savedFilePathName = savedFilePathName;
		this.originalFileName = originalFileName;
	}
	public Integer getBoardId() {
		return boardId;
	}
	public String getBoardFileId() {
		return boardFileId;
	}
	public String getSavedFilePathName() {
		return savedFilePathName;
	}
	public String getOriginalFileName() {
		return originalFileName;
	}
	
	
}
