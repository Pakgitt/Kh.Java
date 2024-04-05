<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Semim login</h1>
	<form action="${pageContext.request.contextPath}/join" method="post">
		<div>
			아이디:<input type="text" name="id">
		</div>
		<div>
			비밀번호:<input type="password" name="pwd">
		</div>
		<div>
			<button type="submit" class="btn login">로그인</button>
		</div>
	</form>
	
<script>
	${loadedHandler}
	function loadedHandler(){
	$(".btn.login").on("click", btnLoginHandler);
	}
	
	function btnLoginHandler(){
		console.log("로그인 클릭");
		
	}
</script>
</body>
</html>