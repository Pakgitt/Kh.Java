package mclass.jdbc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mclass.jdbc.model.service.SalService;
import mclass.jdbc.model.vo.Sal;

/**
 * Servlet implementation class SalController
 */
@WebServlet("/sallist")
public class SalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SalController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SalService service = new SalService();
		List<Sal> result = service.selectList();
		System.out.println("나오는거니");

		if (result != null) {
			request.setAttribute("volist", result);
			request.getRequestDispatcher("views/sallist.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "삐용삐용");
			request.getRequestDispatcher("views/errorpage.jsp").forward(request, response);
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
