<%@page import="jdbc.common.model.vo.Salgrade"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Salgrade List</title>
</head>
<body>

<%
List<Salgrade> volist = (List<Salgrade>) request.getAttribute("volist");
if(volist != null){
	for(Salgrade vo : volist){
%>
	<h1><%=vo.getGrade() %> | <%=vo.getLosal() %> | <%=vo.getHisal() %></h1></br>
 <% 
	}
	
}
%>
</body>
</html>