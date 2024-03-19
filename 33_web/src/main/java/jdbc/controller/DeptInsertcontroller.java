package jdbc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.model.service.DeptService;
import jdbc.model.vo.Dept;

/**
 * Servlet implementation class DeptInsertcontroller
 */
@WebServlet("/dept/insert")
public class DeptInsertcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeptInsertcontroller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String addno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");

		int deptno = Integer.parseInt(addno);
		DeptService service = new DeptService();

		Dept vo = new Dept(deptno, dname, loc);
		int result = service.insert(vo);

		if (result > 0) {
			response.sendRedirect(request.getContextPath() + "/dept");
		} else {
			request.getRequestDispatcher("/views/errorPage.jsp").forward(request, response);
		}
	}

}
