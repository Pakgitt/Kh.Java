<%@page import="mclass.jdbc.model.vo.Sal"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%
String ctxPath = request.getContextPath(); // 선언 시 request 객체 사용 불가
pageContext.setAttribute("pageScope", "pageScope Value");
String pcValue = (String)pageContext.getAttribute("pageScope");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Salgrade List</title>
</head>
<body>
JSP 제공 내장객체의 scope 분리하여 말하시오. 
page(pageContext) 
- request(response 전까지 유지) request.getRequestDispatcher("xxx.jsp").forward(req,res); 
- session(브라우저 창 닫기까지, removeAttribute(url..)); 과 함께 사용됨. 로그인 정보(로그아웃) 
- application

request
response
	${ctxPath}
	${attribute명 }
	${getAttribute("attribute") }
	""
	null
<%
	String pcVaString = (String)pageContext.getAttribute("pageScope");
	// response.getWriter() -> out 이름의 객체
	out.write("aaa");
	// request.getSession() -> session 이름의 객체
	session.setAttribute("name", "value");
	// page == Object 현재 JSP를 class 의미로 봤을때 해당 JSP 객체
	// pageContext == 외부 환경/설정 정보를 제공하는 객체
	
%>



<br>
<c:choose>
<c:when test="5!=6"> 화면에 바로 뿌려지는 부분</c:when>
<c:when test="5!=6"></c:when>
<c:when test="5!=6"></c:when>
</c:choose>

<%
List<Sal> volist = (List<Sal>) request.getAttribute("volist");
if(volist != null){
	for(Sal vo : volist){
%>
	<%=vo.getGrade() %> | <%=vo.getLosal() %> | <%=vo.getHisal() %>	<br>
 <% 
	}
	
}
%>
</body>
</html>