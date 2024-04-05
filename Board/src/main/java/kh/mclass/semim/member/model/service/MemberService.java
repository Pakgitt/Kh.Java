package kh.mclass.semim.member.model.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static jdbc.common.JdbcTemplate.*;
import jdbc.common.JdbcTemplate;
import kh.mclass.semim.member.model.dao.MemberDao;
import kh.mclass.semim.member.model.dto.MemberDto;

public class MemberService {
	private MemberDao dao = new MemberDao();
	
	// select checkdId
	public int selectCheckId(String memId) {
		int result = -1;
		Connection conn = getSemiConnection(true);
		result = dao.selectCheckId(conn, memId);
		
		close(conn);
		return result;
	}
	
	
	// select list - all
	public List<MemberDto> selectAllList() {
		List<MemberDto> result = null;
		Connection conn = getSemiConnection(true);
		result = dao.selectAllList(conn);
		close(conn);
		return result;
	}

	// select one
	public MemberDto selectOne(String memId) {
		MemberDto result = null;
		Connection conn = getSemiConnection(true);
		result = dao.selectOne(conn, memId);		
		close(conn);
		return result;
	}

	// insert
	public int insert(MemberDto dto) {
		int result = 0;
		Connection conn = getSemiConnection(true);
		result = dao.insert(conn, dto);
		close(conn);
		return result;
	}

	// update
	public int update(MemberDto dto) {
		int result = 0;
		Connection conn = getSemiConnection(true);
		result = dao.update(conn, dto);
		close(conn);
		return result;
	}

	// delete // TODO
	public int delete(Connection conn, String memId) {
		int result = 0;
		String sql = "DELETE FROM MEMBER WHERE MEM_ID=?";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			// ? 처리
			pstmt.setString(1, memId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		close(pstmt);
		return result;

	}
}
