<%@page import="kh.mclass.jdbc.model.vo.Dept"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%!
int sum(int a, int b){
	return a+b;
}
%>
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
		if(volist !=null){
			if(volist.size() == 0){
		
		for (Dept vo : volist) {
		%>
		<%=vo.getDeptno() %> | <%=vo.getDname() %> | <%=vo.getLoc() %><br>
		<%
				}
			}
		}else{
			%>
			시스템 불안정 위잉위잉
			<%
		}
				
		%>
		<br>
		<h1>===El===</h1>
		<c:forEach begin="1" end="10" step="3" var="i">
		${i }<br>
		</c:forEach>
		<!-- null 체크 -->
		<c:if test="${empty volist}">
		시스템 불안정
		</c:if>
		
		<c:choose>
		<c:when test="${empty volist }">
		</c:when>
		<c:when test="${vlolist.size() == 0 }">
		</c:when>
		<c:otherwise>
		<c:forEach items="${volist }" var="vo" varStatus="vs">
		${vs.count}. ${vo.deptno } | ${vo.dname } | ${vo.loc }<br>
		</c:forEach>
		</c:otherwise>
		</c:choose>	 
		

		
	</div>
</body>
</html>