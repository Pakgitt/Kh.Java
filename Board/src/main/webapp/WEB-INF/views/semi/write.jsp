<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>게시판</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<%-- <jsp:include page="/WEB-INF/views/semi/common_function.jsp"> --%>
</head>

<body>
	로그인 정보
	<br> [[${sssLogin }]]
	<br> [[<%=session.getAttribute("sssLogin")%>]]

	<h1>게시판 write</h1>
	[[${dtolist}]]
	<br> [[<%=request.getAttribute("dtolist")%>]]
	<form id="frm-write">
		<div>
			<label>제목</label><input tpye="text" name="subject">
		</div>
		<div>
			<label>내용</label>
			<textarea name="content" required></textarea>
		</div>
		<div>
			<button type="button" class="btn write">글쓰기</button>
		</div>
	</form>


	<script>
	
		$(loadedHandler);
		function loadedHandler() {
			//event 등록
			$(".btn.write").on("click", btnwriteClickHandler);
		}
		// Login 페이지로 이동
		function btnwriteClickHandler() {
			if (!ssslogin) {
				var result = confirm("글작성은 로그인해야 가능합니다 로그인 페이지로 이동하시겠습니까?");
				if (result) {
					location.href = "${pageContext.request.contextPath}/login?prePage=write";
				} else {

				}
				return;
			}

		console.log($("[name=content]").val()); // 사용자 입력 값은 val()로 값을 꺼내야함
		console.log($("[name=content]").val().trim().length);
		//console.log($("[name=content]").html());
		if ($("[name=content]").val().trim().length == 0) {
			alert("빈문자열만 입력할 수 없슴. 내용을 작성해주세요")
			return;
		}
		if ($("[name=subject]").val().trim().length == 0) {
			alert("제목을 작성해라")
			return;
		}
		var frm = document.getElementById("frm-write");
		frm.method = "post"; // content의 길이가 길어서 post방식
		frm.action = "${pageContext.request.contextPath}/list";
		frm.submit(); // submit 메소드
}
	</script>
</body>

</html>