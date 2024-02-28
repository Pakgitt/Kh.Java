<%@page import="kh.mclass.jdbc.model.vo.Dept"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아 모르겠다</title>
</head>
<body>
	jsp 꺼내기
	<%=request.getAttribute("data1")%><br>
	<%
	List<Dept> list = (List<Dept>) request.getAttribute("data1");
	String data2 = (String) request.getAttribute("data2");

	for (Dept vo : list) {
	%>
	<%=vo.getDeptno()%>
	<%=vo.getDname()%><%=vo.getLoc()%>,
	<br>
	<%
	}
	%>

</body>
</html>