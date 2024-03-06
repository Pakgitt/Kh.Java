package jdbc.common.model.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.common.model.dao.SalgradeDao;
import jdbc.common.model.service.SalgradeService;
import jdbc.common.model.vo.Salgrade;

/**
 * Servlet implementation class SalgradeService
 */
@WebServlet("/sal/list")
public class SalgradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SalgradeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SalgradeService service = new SalgradeService();
		List<Salgrade> result = service.selectList();

		if (result != null) {
			request.setAttribute("volist", result);
			request.getRequestDispatcher("/views/list.jsp").forward(request, response);
		} else {
			request.setAttribute("error", "리스트를 출력하는데 에러 발생");
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
