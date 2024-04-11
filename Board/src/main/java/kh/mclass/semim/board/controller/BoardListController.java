package kh.mclass.semim.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.mclass.semim.board.model.dto.BoardListDto;
import kh.mclass.semim.board.model.service.BoardService;

/**
 * Servlet implementation class BoardListController
 */
@WebServlet("/list")
public class BoardListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BoardService service = new BoardService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BoardListController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		-- 한페이지당 글 수  3개 
		int pageSize = 10;
//		-- 화면 하단에 나타날 페이지 5씩
		int pageBlockSize = 5;
//		-- 현재 페이지
		int currentPageNum = 1; // 기본 1
		// 페이지 지정하고 들어 왔다면.. 현재 페이지를 그 값으로 설정
		String pageNum = request.getParameter("page");
		if (pageNum != null && !pageNum.equals("")) {
			try {
				currentPageNum = Integer.parseInt(pageNum);
			} catch (NumberFormatException e) {
				System.out.println("----NumberFormatException----");
//				e.printStackTrace();
			}
		}
		request.setAttribute("map", service.selectPageList(pageSize, pageBlockSize, currentPageNum));
//		request.setAttribute("dtolist", service.selectAllList());
		request.getRequestDispatcher("/WEB-INF/views/semi/list.jsp").forward(request, response);

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
