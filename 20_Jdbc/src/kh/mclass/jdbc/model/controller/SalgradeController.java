//package kh.mclass.jdbc.model.controller;
//
//import static kh.mclass.jdbc.common.JdbcTemplate.Commit;
//import static kh.mclass.jdbc.common.JdbcTemplate.autoCommit;
//import static kh.mclass.jdbc.common.JdbcTemplate.close;
//import static kh.mclass.jdbc.common.JdbcTemplate.getConnection;
//import static kh.mclass.jdbc.common.JdbcTemplate.rollback;
//
//import java.sql.Connection;
//import java.util.List;
//
//import kh.mclass.jdbc.model.service.SalgradeService;
//import kh.mclass.jdbc.model.vo.Dept;
//import kh.mclass.jdbc.model.vo.Salgrade;
//
//public class SalgradeController {
//	private SalgradeService service = new SalgradeService();
//
//	public Salgrade selectOne() {
//		Salgrade result = null;
//		return result;
//
//	}
//
//	// 부서 정보 조회 메서드
//	public List<Dept> selectList() {
//		result = service.selectList(conn); // 부서 정보 조회 메서드 호출
//		close(conn); // 데이터베이스 연결 닫기
//
//		return result;
//	}
//
//	// 부서 정보 추가 메서드
//	public int insert(Dept vo) {
//		int result = -1;
//		Connection conn = getConnection(); // 데이터베이스 연결을 얻어옴
//		autoCommit(conn, false); // 자동 커밋 모드를 비활성화
//
//		// 부서 정보 추가 메서드 호출
//		result = dao.insert(conn, vo);
//
//		// 결과에 따라 트랜잭션 처리
//		if (result > 0) {
//			Commit(conn); // 커밋
//		} else {
//			rollback(conn); // 롤백
//		}
//
//		close(conn); // 데이터베이스 연결 닫기
//		return result;
//	}
//
//	// 부서 정보 삭제 메서드
//	public int delete(int deptno) {
//		int result = -1;
//		Connection conn = getConnection(); // 데이터베이스 연결을 얻어옴
//		autoCommit(conn, false); // 자동 커밋 모드를 비활성화
//
//		// 부서 정보 삭제 메서드 호출
//		result = dao.delete(conn, deptno);
//
//		// 결과에 따라 트랜잭션 처리
//		if (result > 0) {
//			Commit(conn); // 커밋
//		} else {
//			rollback(conn); // 롤백
//		}
//
//		close(conn); // 데이터베이스 연결 닫기
//		return result;
//	}
//}
