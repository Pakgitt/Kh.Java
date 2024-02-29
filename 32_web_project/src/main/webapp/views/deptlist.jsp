<%@page import="kh.mclass.jdbc.model.vo.Dept"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dept List</title>
</head>
<body>
	<div>
		<span style="font-size: 90pt; color: red;"> <strong>
				나느 빨강</strong><br>
		<%-- <%=request.getAttribute("data1")%><br> --%>
		</span> 
		<%
		List<Dept> volist = (List<Dept>) request.getAttribute("volist");

		for (Dept vo : volist) {
		%>
		<%=vo.getDeptno() %> | <%=vo.getDname() %> | <%=vo.getLoc() %>
		<br>
		<%
		}
		%>

		
	</div>
</body>
</html>