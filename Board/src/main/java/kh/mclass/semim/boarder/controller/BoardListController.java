package kh.mclass.semim.boarder.controller;

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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/semim/list.jsp").forward(request, response);
		String boardIdStr = request.getParameter("boardId");
		int boardId = Integer.parseInt(boardIdStr);
		String subject = request.getParameter("subject");
		String boardWriter =request.getParameter("boardWriter");
		String writeTime = request.getParameter("writeTime");
		String hitStr = request.getParameter("histr");
		int hit = Integer.parseInt(hitStr);
		
		List<BoardListDto> result = new BoardService().selectList();
		response.getWriter().append(String.valueOf(result));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
