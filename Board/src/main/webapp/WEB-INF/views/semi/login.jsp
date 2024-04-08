<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
</head>
<body>
	<h1>Semim login</h1>
	form 태그 방식
	<fieldset>
		<legend>로그인</legend>
		<form action="${pageContext.request.contextPath}/login" method="post">
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
	</fieldset>

 <fieldset>
		<legend>로그인ajax</legend>
		<form id="frm-login">
			<div>
				아이디:<input type="text" name="id">
			</div>
			<div>
				비밀번호:<input type="password" name="pwd">
			</div>
			<div>
				<button type="button" class="btn submit">로그인</button>
			</div>
		</form>
	</fieldset>
	<script>
		$(loadedHandler);
		function loadedHandler() {
			$("#frm-login .btn.submit").on("click", frmClickHandler);
		}

		function frmClickHandler() {
			console.log("로그인 클릭");
			// console.log(document.getElementById("frm-login").serialize());
			// console.log($("#frm-login").serialize()); // id=sss&pwd=vvv
			
			$.ajax({
				url:"${pageContext.request.contextPath}/login"
				, method : "post"
				, data : $("#frm-login").serialize()
				// {id : $("[name=id]").val(), pwd : $("[name=pwd]").val())}
				, success : function(result) {
					console.log(result);
					if(result == 1){
						alert("반갑습니다");
						location.href="${pageContext.request.contextPath}/main"
					}else{
						alert("아이디 또는 패스워드가 일치하지 않습니다.");
						$("[name=pwd]").val("");
					}
				}
				,	error : function(request, status, error) {
					alert("code: " + request.status + "\n" + "message: "
							+ request.responseText + "\n" + "error: " + error);
				}
			});
		}
	</script>
</body>
</html>