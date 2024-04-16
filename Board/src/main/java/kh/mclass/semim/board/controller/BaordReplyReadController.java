package kh.mclass.semim.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kh.mclass.semim.board.model.service.BoardService;

/**
 * Servlet implementation class BaordReplyReadController
 */
@WebServlet("/board/reply/read.ajax")
public class BaordReplyReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BoardService  service = new BoardService(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BaordReplyReadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String boardIdStr = request.getParameter("boardId");
		try {
			int boardId = Integer.parseInt(boardIdStr);
			response.getWriter().append(new Gson().toJson(service.selectBoardReplyList(boardId)));
		} catch (NumberFormatException e) {
			System.out.println("넘버포멧익섹셥ㄴㄴㄴ");
			response.sendRedirect(request.getContextPath()+"/list");
		}
	}

}
