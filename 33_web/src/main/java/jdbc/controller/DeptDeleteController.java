package jdbc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.model.service.DeptService;

/**
 * Servlet implementation class DeptDeleteController
 */
@WebServlet("/dept/delete")
public class DeptDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeptDeleteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DeptService service = new DeptService();

		String rmdpetno = request.getParameter("deptno");

		int deptno = Integer.parseInt(rmdpetno);
		int result = service.delete(deptno);

		if (result > 0) {
			response.sendRedirect(request.getContextPath() + "/dept");
		} else {
			request.setAttribute("msg", "delete error");
			request.getRequestDispatcher("/views/errorPage.jsp").forward(request, response);
		}
	}

}
