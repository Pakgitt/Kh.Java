<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>글작성</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<jsp:include page="/WEB-INF/views/semi/common_function.jsp" />

</head>

<body>
	로그인 정보
	<br> [[${sssLogin }]]
	<br> [[<%=session.getAttribute("sssLogin")%>]]

	<h1>게시판 write</h1>
	[[${dtolist}]]
	<br> [[<%=request.getAttribute("dtolist")%>]]
	<form id="frm-write" enctype="multipart/form-data">
		<div>
			<label>제목</label><input type="text" name="subject">
		</div>
		<div>
			<label>내용</label>
			<textarea name="content" required></textarea>
		</div>
		<div>
			<button type="button" class="btn file">파일추가</button>
		</div>
		<!-- 
		<div>
			<label>파일첨부</label>
			<input type="file" required></input>
		</div>
		 -->
		<div>
			<button type="button" class="btn write">글쓰기</button>
		</div>
	</form>


	<script>
		$(loadedHandler);
		function loadedHandler() {
			//event 등록
			$(".btn.write").on("click", btnWriteClickHandler);
			$(".btn.file").on("click", btnFileClickHandler);
		}
		function btnFileClickHandler(){
			var htmlval = `
			<div>
				<label>파일첨부</label>
				<input type="file" name="uploadfiles" required><button type="button" class="btn file-cancle">취소</button></input>
			</div>
			`;
			$(this).parent().after(htmlval);
			$(".btn.file-cancle").off("click");
			$(".btn.file-cancle").on("click", btnFileCancleClickHandler);
		}
		
		function btnFileCancleClickHandler(){
			console.log("btnFileCancleClickHandler");
			$(this).parent().remove();
		}
		
		function btnWriteClickHandler() {

			//Login 페이지로 이동
			if (checkLogin("로그인되어야 글쓰기가 가능합니다.\n로그인페이지로 이동하시겠습니까?", "write")) {
				return;
			}

			console.log($("[name=content]").val().legnth); // 사용자 입력 값은 val()로 값을 꺼내야함
			console.log($("[name=content]").val().trim().length);
			//console.log($("[name=content]").html());

			if ($("[name=subject]").val().trim().length == 0) {
				alert("빈문자열만 입력할 수 없슴. 내용을 작성해주세요")
				return;
			}
			if ($("[name=content]").val().trim().length == 0) {
				alert("제목을 작성해라")
				return;
			}
			var frm = document.getElementById("frm-write");
			frm.method = "post"; // content의 길이가 길어서 post방식
			frm.action = "${pageContext.request.contextPath}/write";
			frm.enctype="multipart/form-data";
			frm.submit(); // submit 메소드
		}
	</script>
</body>

</html>