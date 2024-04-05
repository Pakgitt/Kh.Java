package kh.mclass.semim.main.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kh.mclass.semim.member.model.dto.MemberDto;
import kh.mclass.semim.member.model.service.MemberService;

/**
 * Servlet implementation class CheckIdController
 */
@WebServlet("/checkid")
public class CheckIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckIdController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// GET방식 안씀

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("###checkid doPost 집입");
		String k1 = request.getParameter("k1");
		String k2 = request.getParameter("k12");
		System.out.println(k1+",+"+k2);
		
		String memId = request.getParameter("cid");
		System.out.println("id값" + memId);
		 
		//TODO DB 갔다올 예정
		
		// ajax 이용시
		// dispatcher, sendredirect로 다른 페이지 이동 금지
		// 왔던 곳(success/error)의  callback으로 돌아가얗함
//		response.getWriter().append("존재한다");
		
		int result = new MemberService().selectCheckId(memId);
		
		response.getWriter().append(String.valueOf(result));
		
//		List<MemberDto> result = new MemberService().selectAllList(); 
//		System.out.println(result);
//		Gson gson = new Gson();
//		String jsonReuslt = gson.toJson(result); // gson아 json으로 바꿔줘
//		System.out.println("===Json===");
//		System.out.println(jsonReuslt);
//		response.getWriter().append(jsonReuslt);
	}

}
