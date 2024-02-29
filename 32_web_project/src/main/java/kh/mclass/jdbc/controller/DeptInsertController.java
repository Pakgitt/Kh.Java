package kh.mclass.jdbc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.mclass.jdbc.model.service.DeptService;
import kh.mclass.jdbc.model.vo.Dept;

/**
 * Servlet implementation class DeptInsertController
 */
@WebServlet("/dept/insert")
public class DeptInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptInsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ?=no32&dname=asd&loc=local
		// 5. 데이터 수신
		String noStr = request.getParameter("no");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		int deptno = Integer.parseInt(noStr);
		DeptService service = new DeptService();
		
		Dept vo = new Dept(deptno, dname, loc);
		int result = service.insert(vo);
		
		if (result > 0) {
			// URL 변경 DeptContorller - doGet() 호출됨
			response.sendRedirect(request.getContextPath()+"/deptlist");
//			List<Dept> volist = service.selectList();
//			System.out.println(result);
//			request.setAttribute("volist", volist);
//			request.getRequestDispatcher("/views/deptlist.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "해당하는 dept 부서가 없어서 추가하지 못함");
			request.getRequestDispatcher("/views/errorPage.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
