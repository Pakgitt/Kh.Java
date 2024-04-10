package semi.board.model.service;

import static jdbc.common.JdbcTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static jdbc.common.JdbcTemplate.*;
import semi.board.model.dao.BoardDao;
import semi.board.model.dto.BoardListDto;

public class BoardService {
	
	private BoardDao dao = new BoardDao();
	
	// selecAllList
	public List<BoardListDto> selectAllList() {
	    List<BoardListDto> result = null;
	    Connection conn = getSemiConnection(true);
	    try {
//	        System.out.println("selectAllList 메서드 호출됨.");
	        result = dao.selectAllList(conn);
//	        System.out.println("dao.selectAllList() 결과: " + result);
	    } catch (Exception e) {
//	        System.out.println("selectAllList 메서드에서 예외 발생: " + e.getMessage());
	        // 예외 처리 추가
	    } finally {
	        close(conn);
	    }
//	    System.out.println("selectAllList 메서드 실행 완료, 결과: " + result);
	    return result;
//	}

	
	
//	
//	public List<BoardListDto> selectAllList() {
//		List<BoardListDto> result = null;
//		Connection conn = getSemiConnection(true);
//		result = dao.selectAllList(conn);
//		close(conn);
//		return result;
			
	}
	
	// selectOne

	// insertList

	// listContent

	// deleteList
}
