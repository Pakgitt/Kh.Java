<%@page import="jdbc.model.vo.Dept"%>
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
<h1>잘되는거니?</h1><br>
<%-- ${volist } --%>
<% 
List<Dept> volist = (List<Dept>) request.getAttribute("volist"); 

for(Dept vo : volist){
	
%>
<%=vo.getDeptno() %> | <%=vo.getDname() %> | <%=vo.getLoc() %> <br>
<% 
}
%>
<h1>부서 추가</h1>

<%-- <div>
<form method="get" action="<%=request.getContextPath() %>/dept/insert" target="_blank">리스트
        <div>
        번 호 <input type="text" name="deptno">
        </div>
        이 름 <input type="text" name="dname">
        <div>
        지 역 <input type="text" name="loc" value="Busan">
        </div>
        <input type="submit" value="submit">
        <input type="reset" value="reset">
</div>
 --%>
<form method="post" action="<%=request.getContextPath() %>/dept/insert" target="_blank">post방식
        <div>
        번 호 <input type="text" name="deptno">
        </div>
        이 름 <input type="text" name="dname">
        <div>
        지 역 <input type="text" name="loc" value="Busan">
        </div>
        <input type="submit" value="submit">
        <input type="reset" value="reset">
</div>
</form>

<h1>부서 삭제</h1>
<div>
<form method="post" action="<%=request.getContextPath() %>/dept/delete">
	<div>
        번 호 <input type="text" name="deptno">
        </div>
        <input type="submit" value="submit">
        <input type="reset" value="reset">
</form>
</div>
</body>
</html>