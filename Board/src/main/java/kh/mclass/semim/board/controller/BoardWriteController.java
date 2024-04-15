package kh.mclass.semim.board.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.MultipartParser;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String prePage = (String) request.getSession().getAttribute("prePage");
		if (prePage != null && prePage.equals("write")) {
			request.getSession().removeAttribute("prePage");
		}
		request.getRequestDispatcher("/WEB-INF/views/semi/write.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// form enctype="multipart/form-data" 형태로 전달된 경우
		String uploadPath = request.getServletContext().getRealPath("");
		File uploadPathFile = new File(uploadPath);
		if(!uploadPathFile.exists()) {
			uploadPathFile.mkdirs();
		}
		int uploadFileLimit = 10 * 1024 * 1024; // 10M 제한
//		new MultipartRequest(request, // jsp -> controll로 전달된 객체
//				uploadPathFile, // was 서버에 저장할 디렉토리
//				uploadFileLimit, // 업로드 파일 크기 제한
//				"UTF-8", // 인코딩 방법
//				, // was 서버에 저장할 디렉토리에 동일 이름이 존재할때 새로운 이름 부여방식 
//				getServletInfo())
		MultipartRequest multiReq = new MultipartRequest(request, uploadPath, uploadFileLimit, new DefaultFileRenamePolicy());
		
		
		String filePath = multiReq.getFilesystemName("uploadPath");
		if(filePath == null) {
			System.out.println("첨부파일이 없다");
		}else {
			System.out.println("첨부파일 정보는 ===");
			System.out.println("filePath : " + filePath);
			System.out.println(multiReq.getOriginalFileName(filePath));
		}
		
		System.out.println("/semi/write dopost()");
		String subject = multiReq.getParameter("subject");
		String content = multiReq.getParameter("content");
		MemberInfoDto memberInfoDto = (MemberInfoDto) request.getSession().getAttribute("sssLogin");
		System.out.println(subject);
		System.out.println(content);
		BoardInsertDto dto = new BoardInsertDto(subject, content, "kh1");
//		BoardInsertDto dto = new BoardInsertDto(subject, content, "kh1");  //TODO
		int sequenceNum  = service.insert(dto);
		response.sendRedirect(request.getContextPath() + "/list?num=" + sequenceNum );

	}

}
