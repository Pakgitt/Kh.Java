package jdbc.common.model.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.common.model.vo.OpenApiVo;

/**
 * Servlet implementation class OpenApiController
 */
@WebServlet("/OpenApiController")
public class OpenApiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OpenApiController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		OpenApiSerivce service = new OpenApiSerivce();
//		List<OpenApiVo> result = service.getCtprvnRltmMesureDnsty();
//		List<OpenApiVo> result = service.getCtprvnRltmMesureDnstyByJson();
//		Map<String, Object> map = service.getCtprvnRltmMesureDnstyByJson();
//		map = gson.from
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
