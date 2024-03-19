package kh.mclass.jdbc.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.mclass.jdbc.model.service.DeptService;
import kh.mclass.jdbc.model.vo.Dept;

/**
 * Servlet implementation class DeptInsertController
 */
@WebServlet("/dept/insert")
public class DeptInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeptInsertController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		// request Method 확인
//		System.out.println("====request.getParameterNames() - 예) 카테로그별 검색 잡코리아 경력/지역/연봉 .. =====");
//		Enumeration<String> enumNames = request.getParameterNames();
//		System.out.println(enumNames);
//		while (enumNames.hasMoreElements()) {
//			String name = enumNames.nextElement();
//			System.out.println(request.getParameter(name));
//		}
//		System.out.println("===request.getParameterValues() - 레시피 재료들.. 선호 장르 선택====");
//		// ?genre=a1&genre=b1&genre=c1
//		String[] genreArr = request.getParameterValues("genre");
//		List<String> genreList = Arrays.asList(genreArr);
//		System.out.println(genreList);
//		System.out.println("===================");
//		//
//		Map<String, String[]> paraMap = request.getParameterMap();
//		System.out.println(paraMap);
//		System.out.println("=================");
//		Set<String> keyset = paraMap.keySet();
//		for (String key : keyset) {
//			String[] valueArr = paraMap.get(key);
//			List<String> valueList = Arrays.asList(valueArr);
//			System.out.println(key + " : " + valueList);
//		}
//		// ?=no32&dname=asd&loc=local
//		// 5. 데이터 수신

		String noStr = request.getParameter("no");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");

		int deptno = Integer.parseInt(noStr); // 무조건 Sring
		DeptService service = new DeptService();

		Dept vo = new Dept(deptno, dname, loc);
		int result = service.insert(vo);

		if (result > 0) {
			// URL 변경 DeptContorller - doGet() 호출됨
			response.sendRedirect(request.getContextPath() + "/deptlist");
//			List<Dept> volist = service.selectList();
//			System.out.println(result);
//			request.setAttribute("volist", volist);
//			request.getRequestDispatcher("/views/deptlist.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "해당하는 dept 부서가 없어서 추가하지 못함");
			request.getRequestDispatcher("/views/errorPage.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
