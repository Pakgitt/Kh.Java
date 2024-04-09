package kh.mclass.semim.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.mclass.semim.board.model.dto.BoardInsertDto;
import kh.mclass.semim.board.model.dto.BoardListDto;
import kh.mclass.semim.board.model.service.BoardService;
import kh.mclass.semim.member.model.dto.MemberInfoDto;

/**
 * Servlet implementation class BoardListController
 */
@WebServlet("/write")
public class BoardWriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BoardService service = new BoardService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardWriteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prePage = (String) request.getSession().getAttribute("prePage");
		if(prePage.equals("write")) {
			request.getSession().removeAttribute("prePage");
		}
		
		request.getRequestDispatcher("/WEB-INF/views/semi/write.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/semi/write dopost()");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content"); // jsp파일의 name이랑 동일해야함
		MemberInfoDto memberInfoDto = (MemberInfoDto) request.getSession().getAttribute("sssLogin");
		BoardInsertDto boardInsertDto = request.getSession().getAttribute(content);
		String boardWriter = (String) request.getSession().getAttribute("sssLogin");
		System.out.println(subject);
		System.out.println(content);
		BoardInsertDto dto =  new BoardInsertDto(subject, content, MemberInfoDto.getMemId());
		int result = service.insert(dto);
		
	}

}
