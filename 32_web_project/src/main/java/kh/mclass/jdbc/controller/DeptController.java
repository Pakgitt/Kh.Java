package kh.mclass.jdbc.controller;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.mclass.jdbc.model.service.DeptService;
import kh.mclass.jdbc.model.vo.Dept;

/**
 * Servlet implementation class DeptController
 */
@WebServlet("/deptlist")
public class DeptController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeptController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		 한글 설정
//		request.setCharacterEncoding("UTF-8");
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
		// Controller 역할
		// Service - Dao 호출
		DeptService service = new DeptService();
		List<Dept> result = service.selectList();
		System.out.println("나와라ㅏ라라라라");
//		System.out.println(result);
		// 3. view에 데이터 전달
		if (result == null) {
			request.setAttribute("msg", "부서 조회 안됨");
			request.getRequestDispatcher("/views/errorPage.jsp").forward(request, response);
		} else {
			request.setAttribute("volist", result);
			request.getRequestDispatcher("/views/deptlist.jsp").forward(request, response);
		}
//		request.setAttribute("deptlist", result);
//		request.setAttribute("salgradlist", result);
//		request.setAttribute("data2", result);
//		//
		// view를 controller 함
//		request.getRequestDispatcher("/views/deptlist.jsp").forward(request, response);
//		request.getRequestDispatcher("NewFile.jsp").forward(request, response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
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
