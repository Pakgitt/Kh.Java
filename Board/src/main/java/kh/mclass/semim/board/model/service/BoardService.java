package kh.mclass.semim.board.model.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jdbc.common.JdbcTemplate.*;
import jdbc.common.JdbcTemplate;
import kh.mclass.semim.board.model.dao.BoardDao;
import kh.mclass.semim.board.model.dto.BoardDetailDto;
import kh.mclass.semim.board.model.dto.BoardDto;
import kh.mclass.semim.board.model.dto.BoardInsertDto;
import kh.mclass.semim.board.model.dto.BoardListDto;
import kh.mclass.semim.board.model.dto.BoardReadDto;
import kh.mclass.semim.board.model.dto.BoardReplyListDto;
import kh.mclass.semim.board.model.dto.BoardReplyWriteDto;
import kh.mclass.semim.board.model.dto.FileReadDto;
import kh.mclass.semim.member.model.dao.MemberDao;
import kh.mclass.semim.member.model.dto.MemberDto;

public class BoardService {

	private BoardDao dao = new BoardDao();

	// insert
	public int selectTotalCount() {
		int result = 0;
		Connection conn = getSemiConnection(true);
		result = dao.selectTotalCount(conn);
		close(conn);
		return result;
	}

	// select all list - list
	public Map<String, Object> selectPageList(int pageSize, int pageBlockSize, int currentPageNum) {
		Map<String, Object> result = null;

		Connection conn = getSemiConnection(true);
//		System.out.println("currentPageNum : " + currentPageNum);

		int start = pageSize * (currentPageNum - 1) + 1;
		int end = pageSize * currentPageNum;

//			select t2.*
//			from (select t1.*, rownum rn from (SELECT BOARD_ID, SUBJECT,CONTENT,WRITE_TIME,LOG_IP,BOARD_WRITER,READ_COUNT    FROM BOARD order by board_id desc) t1 ) t2
//			--where rn between 한페이지당글수*(현재페이지-1)+1   and 한페이지당글수*(현재페이지)
//			;

//			select count(*)/5 as 페이지 from board;
		int totalCount = dao.selectTotalCount(conn);
//		System.out.println("totlacount : " + totalCount);
//			-- 전체페이지수  = ceil(총글개수/한페이지당글수) = (총글개수%한페이지당글수== 0)?(총글개수/한페이지당글수):(총글개수/한페이지당글수+1)
//			int totalPageCount = (int)Math.ceil(totalCount/(double)pageSize);
		int totalPageCount = (totalCount % pageSize == 0) ? totalCount / pageSize : totalCount / pageSize + 1;

//			시작페이지 startNum = (현재페이지 % 페이지수 == 0) ? 전체페이지수 : startPageNum + 페이지수 -1;
//			끝페이지 endPageNum = (startPageNum + pageBlockSize > totalPageCount) ? 전체페이지수 : startPageNum + 페이지수 -1;
		int startPageNum = (currentPageNum % pageBlockSize == 0)
				? ((currentPageNum / pageBlockSize) - 1) * pageBlockSize + 1
				: ((currentPageNum / pageBlockSize)) * pageBlockSize + 1;
		int endPageNum = (startPageNum + pageBlockSize > totalPageCount) ? totalPageCount
				: startPageNum + pageBlockSize - 1;

		List<BoardListDto> dtolist = dao.selectPageList(conn, start, end);
		close(conn);

		result = new HashMap<String, Object>();
		result.put("dtolist", dtolist);
		result.put("totalPageCount", totalPageCount);
		result.put("startPageNum", startPageNum);
		result.put("endPageNum", endPageNum);
		result.put("currentPageNum", currentPageNum);
//		System.out.println("selectPageList : " + result);

		return result;
	}

	// select all list - list
	public List<BoardListDto> selectAllList() {
		List<BoardListDto> result = null;
		Connection conn = getSemiConnection(true);
		result = dao.selectAllList(conn);
		close(conn);
		return result;
	}

	// select one
	public BoardReadDto selectOne(Integer boardId) {
		BoardReadDto result = null;
		Connection conn = getSemiConnection(true);
		result = dao.selectOne(conn, boardId);
		if(result != null) {
			dao.updateReadCount(conn, boardId);
		}
		List<FileReadDto> filelist = dao.selectFileList(conn, boardId);
		result.setFiledtolist(filelist);
		close(conn);
		return result;
	}

	// insert
	public int insert(BoardInsertDto dto) {
		int result = 0;
		Connection conn = getSemiConnection(true);
//		int sequenceNum = dao.getSequenceNum(conn);
		result = dao.insert(conn, dto);
		System.out.println(result);
		close(conn);
		return result;
	}

	// update
	public int update(BoardDto dto) {
		int result = 0;
		Connection conn = getSemiConnection(true);
		result = dao.update(conn, dto);
		close(conn);
		return result;
	}

	// delete // TODO
	public int delete(Integer boardId) {
		int result = 0;
		PreparedStatement pstmt = null;
		Connection conn = getSemiConnection(true);
		result = dao.delete(conn, boardId);

		close(conn);
		return result;

	}

	// -------board reply 댓글
	// select reply list - list
	public List<BoardReplyListDto> selectReplyList() {
		List<BoardReplyListDto> result = null;
		Connection conn = getSemiConnection(true);
		result = dao.selectBoardReplyList(conn, null);
		close(conn);
		return result;
	}
	
	// select list - board reply
	public List<BoardReplyListDto> selectBoardReplyList(Integer boardId) {
		List<BoardReplyListDto> result = null;
		Connection conn = getSemiConnection(true);
		result = dao.selectBoardReplyList(conn, boardId);
		close(conn);
		return result;
	}

	// insert - boardreply
	public int insertReply(BoardReplyWriteDto dto) {
		int result = 0;
		int resultupdate = 0;
		Connection conn = getSemiConnection(true);
		autoCommit(conn, false);
		if (dto.getBoardReplyId() != 0) {
			resultupdate = dao.updateReplyStep(conn, dto.getBoardReplyId());
			if (resultupdate > -1) {
				result = dao.insertRReply(conn, dto);
			}
		} else {
			result = dao.insertReply(conn, dto);
		}
		if (resultupdate > -1 && result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

}
