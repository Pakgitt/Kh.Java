<%@page import="mclass.jdbc.model.vo.Sal"%>
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