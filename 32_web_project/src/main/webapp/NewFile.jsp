<%@page import="kh.mclass.jdbc.model.vo.Dept"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<span style="font-size: 90pt; color: red;"> <strong>
				나느 빨강</strong><br>
		</span> ${data1 }<br> ${data2 }<br>
		<%=request.getAttribute("data1")%><br>
		<%
		List<Dept> volist = (List<Dept>) request.getAttribute("data1");
		String data2 = (String) request.getAttribute("data2");

		for (Dept vo : volist) {
		%>
		<%= vo.getDeptno() %> | <%= vo.getDname() %> | <%= vo.getLoc() %>
		<br>
		<%
		}
		%>
		============<br> 
		<hi>EL(Expression Language 표현언어로 표현만 가능. for, if,변수선언..등 제어문 없음)</hi><br>
		${data1.get(0).getDeptno() } | ${data1.get(1).getDname() } | ${data1.get(2).getLoc() }
		
	</div>

</body>
</html>
