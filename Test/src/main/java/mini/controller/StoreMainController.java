package mini.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


<<<<<<<< Updated upstream:Test/src/main/java/mini/controller/StoreMainController.java
@WebServlet("/store")
public class StoreMainController extends HttpServlet {
========
@WebServlet("/test")
public class TestController extends HttpServlet {
>>>>>>>> Stashed changes:Test/src/main/java/mini/controller/TestController.java
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType(getServletInfo());
<<<<<<<< Updated upstream:Test/src/main/java/mini/controller/StoreMainController.java
		request.getRequestDispatcher("/WEB-INF/views/store_main.jsp").forward(request, response);
========
		request.getRequestDispatcher("/WEB-INF/views/test.jsp").forward(request, response);
//		/Test/src/main/webapp/WEB-INF/views/test.jsp
>>>>>>>> Stashed changes:Test/src/main/java/mini/controller/TestController.java
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("${pageContext.request.contextPath}/header.jsp").forward(request, response);
	}

}
