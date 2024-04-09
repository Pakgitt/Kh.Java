package semi.board.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static jdbc.common.JdbcTemplate.*;
import semi.board.model.dto.BoardListDto;

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
	// selecAllList
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
				} while (rs.next());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		close(rs);
		close(pstmt);
		return result;

	}

	// selectOne

	// insertList

	// listContent

	// deleteList
}
