<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>게시판</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
</head>

<body>
	로그인 정보
	<br> [[${sssLogin }]]
	<br> [[<%=session.getAttribute("sssLogin")%>]]

	<h1>게시판 list</h1>
	[[${dtolist}]]
	<br> [[<%=request.getAttribute("dtolist")%>]]

	<div>
		<button type="button" class="btn write">글쓰기</button>
	</div>
	<script>
		$(loadedHandler);
		function loadedHandler() {
			//event 등록
			$(".btn.write").on("click", btnwriteClickHandler);
		}

		function btnwriteClickHandler() {
			// 오류발생 var sslogin = ${dtolist};
			var ssslogin = "${sssLogin}";
			// var ssslogin = "";
			// 비로그인 시 로그인 페이지로 이동 로그인되어있을 시 글쓰기 페이지로 이동
			if (!ssslogin) {
				var result = confirm("글작성은 로그인해야 가능합니다 로그인 페이지로 이동하시겠습니까?");
				if (result) {
					location.href = "${pageContext.request.contextPath}/login?prePage=write";
				} else {

				}
			}
			location.href = "${pageContext.request.contextPath}/write";
		}
	</script>
</body>

</html>