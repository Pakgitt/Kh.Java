package kh.mclass.semim.board.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
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
import kh.mclass.semim.board.model.dto.FileWriteDto;
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
		
		String uploadPath = request.getServletContext().getRealPath("files");
		File uploadPathFile = new File(uploadPath);
		if(!uploadPathFile.exists()) {
			uploadPathFile.mkdirs();
		}
		int uploadFileLimit = 10 * 1024 * 1024; // 10M 제한
		
		// form enctype="multipart/form-data" 형태로 전달된 경우
		MultipartRequest multiReq = new MultipartRequest(request, // jsp -> controll로 전달된 객체 
				uploadPath, // was 서버에 저장할 디렉토리
				uploadFileLimit, // 업로드 파일 크기 제한
				"UTF-8", // 인코딩 방법
				new DefaultFileRenamePolicy()); // was 서버에 저장할 디렉토리에 동일 이름이 존재할때 새로운 이름 부여방식
		// 중요 !! 이 시점 new MultipartRequest() 하면 file은 uploadPath위치에 저장 완료
		// JSP -> Controller File이 딱 한개일 경우
//		String filePath = multiReq.getFilesystemName("uploadfiles");
//		if(filePath == null) {
//			System.out.println("첨부파일이 없다");
//		}else {
//			System.out.println("첨부파일 정보는 ===");
//			System.out.println("filePath : " + filePath);
//			System.out.println("uploadPath :" + uploadPath + "uploadPathFile :" + uploadPathFile);
//			System.out.println(multiReq.getOriginalFileName(uploadPath+"\\"+filePath));
//		}
		
//		JSP -> Controller File이 0개 이상일 경우
		List<FileWriteDto> fileList = new ArrayList<FileWriteDto>();
		Enumeration<?> fileNames = multiReq.getFileNames();
		while(fileNames.hasMoreElements()) {
			String name = (String)fileNames.nextElement(); // input type="file" name="xxx", xxx_0, xxx_1;
			System.out.println(name); // xxx
			String fileName = multiReq.getFilesystemName(name); // 서버에 저장된 파일 이름
			String originalFileName = multiReq.getOriginalFileName(name);
			String type = multiReq.getContentType(name); // 전송된 파일의 타입
			System.out.println(type);
			File f1 = multiReq.getFile(name); // name을 이요해서 파일 객체 생성 여부 확인
			
			if(f1 == null) {
				System.out.println("파일 업로드 실패");
			}else {
				System.out.println(f1.length()); // 해당 파일의 크기
			}
			System.out.println(name + " : "+ fileName + " : "+ originalFileName);
			// C:\workspace\Kh.Java\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\Board
			FileWriteDto filedto = new FileWriteDto(fileName, originalFileName);
			fileList.add(filedto);
		}
		
		
		
		System.out.println("/semi/write dopost()");
		String subject = multiReq.getParameter("subject");
		String content = multiReq.getParameter("content");
		MemberInfoDto memberInfoDto = (MemberInfoDto) request.getSession().getAttribute("sssLogin");
//		System.out.println(subject);
//		System.out.println(content);
		BoardInsertDto dto = new BoardInsertDto(subject, content, "kh1", fileList);
//		BoardInsertDto dto = new BoardInsertDto(subject, content, "kh1");  //TODO
		System.out.println("BoardWrite컨트롤러 : "+dto);
		int result = service.insert(dto);
		response.sendRedirect(request.getContextPath() + "/list" );

	}

}
