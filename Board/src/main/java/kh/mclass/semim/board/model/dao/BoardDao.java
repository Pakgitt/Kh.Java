package kh.mclass.semim.board.model.dao;

import static jdbc.common.JdbcTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kh.mclass.semim.board.model.dto.BoardDto;
import kh.mclass.semim.board.model.dto.BoardInsertDto;
import kh.mclass.semim.board.model.dto.BoardListDto;

//이름           널?       유형             
//------------ -------- -------------- 
//BOARD_ID     NOT NULL NUMBER         
//SUBJECT      NOT NULL VARCHAR2(120)  
//CONTENT      NOT NULL VARCHAR2(4000) 
//WRITE_TIME   NOT NULL TIMESTAMP(6)   
//LOG_IP                VARCHAR2(15)   
//BOARD_WRITER NOT NULL VARCHAR2(20)   
//HIT          NOT NULL NUMBER    
public class BoardDao {
	
	//	select total count
	public int selectTotalCount(Connection conn) {
		int result = 0;
		String sql = "SELECT COUNT(*) CNT FROM BOARD";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// ResultSet 처리
			if (rs.next()) {
				result = rs.getInt("cnt");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		close(rs);
		close(pstmt);
		return result;
	}

//	 select one
	public List<BoardListDto> selectPageList(Connection conn, int start, int end) {
		List<BoardListDto> result = null;
		String sql = "select t2.* from (select t1.*, rownum rn"
				+ " from (select * from board order by board_id desc) t1) t2 where rn between ? and ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			// ?처리
			// 한페이지당 글 수 * (현재페이지-1)+1
			pstmt.setInt(1, start);
			// 한페이지당 글 수 * (현재페이지)
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			// ResultSet 처리
			if (rs.next()) {
				result = new ArrayList<BoardListDto>();
				do {
					BoardListDto dto = new BoardListDto(rs.getInt("BOARD_ID"), rs.getString("SUBJECT"),
							rs.getString("BOARD_WRITER"), rs.getString("WRITE_TIME"), rs.getInt("HIT"));
					result.add(dto);
				} while (rs.next());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		close(rs);
		close(pstmt);
		return result;
	}

	// select one
	public List<BoardListDto> selectAllList(Connection conn) {
		List<BoardListDto> result = null;
		String sql = "SELECT BOARD_ID, SUBJECT, BOARD_WRITER, WRITE_TIME, HIT FROM BOARD";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// ResultSet 처리
			if (rs.next()) {
				result = new ArrayList<BoardListDto>();
				do {
					BoardListDto dto = new BoardListDto(rs.getInt("BOARD_ID"), rs.getString("SUBJECT"),
							rs.getString("BOARD_WRITER"), rs.getString("WRITE_TIME"), rs.getInt("HIT"));
					result.add(dto);
				} while (rs.next());
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		close(rs);
		close(pstmt);
		return result;
	}

	// select all
//	public List<BoardDto> selectAllList(Connection conn) {
//		List<BoardDto> result = null;
//		String sql = "SELECT BOARD_ID, SUBJECT, CONTENT, WRITE_TIME, LOG_IP, BOARD_WRITER, HIT FROM BOARD";
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//
//		try {
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			// ResultSet 처리
//			if (rs.next()) {
//				result = new ArrayList<BoardDto>();
//				do {
//					BoardDto dto = new BoardDto(rs.getInt("BOARD_ID"), rs.getString("SUBJECT"),
//							rs.getString("CONTENT"), rs.getString("WRITE_TIME"), rs.getString("LOG_IP"), rs.getString("BOARD_WRITER"), rs.getInt("HIT"));
//					result.add(dto);
//				} while (rs.next());
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		close(rs);
//		close(pstmt);
//		return result;
//	}

	// select one
	public BoardDto selectOne(Connection conn, Integer boardId) {
		BoardDto result = null;
		String sql = "SELECT BOARD_ID, SUBJECT, CONTENT, WRITE_TIME, LOG_IP, BOARD_WRITER, HIT FROM Board WHERE BOARD_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			pstmt.setInt(1, boardId);
			rs = pstmt.executeQuery();
			// ResultSet 처리
			if (rs.next()) {
				result = new BoardDto(rs.getInt("BOARD_ID"), rs.getString("SUBJECT"), rs.getString("CONTENT"),
						rs.getString("WRITE_TIME"), rs.getString("LOG_IP"), rs.getString("BOARD_WRITER"),
						rs.getInt("HIT"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		close(rs);
		close(pstmt);
		return result;
	}

	// insert
	public int insert(Connection conn, BoardInsertDto dto) {
		int result = 0;
		String sql = "INSERT INTO BOARD (BOARD_ID, SUBJECT, CONTENT, WRITE_TIME, LOG_IP, BOARD_WRITER, HIT)"
				+ " VALUES (SEQ_BOARD_ID.nextval, ?, ?, DEFAULT, DEFAULT, ?, DEFAULT)";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			pstmt.setString(1, dto.getSubject());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getBoardWriter());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		close(pstmt);
		return result;
	}

	// update
	public int update(Connection conn, BoardDto dto) {
		int result = 0;
		String sql = "UPDATE BOARD SET SUBJECT = ?, CONTENT = ?, LOG_IP = ? WHERE BOARD_ID = ? "; // TODO
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		close(pstmt);
		return result;
	}

	// delete
	public int delete(Connection conn, Integer boardId) {
		int result = 0;
		String sql = "DELETE FROM BOARD WHERE BOARD_ID=?";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			pstmt.setInt(1, boardId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		close(pstmt);
		return result;
	}
}
