<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<jsp:include page="/WEB-INF/views/semi/common_function.jsp" />
<style>
<
style>body>div.reply-wrap>form div {
	display: grid;
	grid-template-columns: 1fr 5fr 2fr 1fr 1fr;
	max-width: 800px;
}

.boardreply.grid {
	display: grid;
	grid-template-columns: 1fr 5fr 2fr 1fr 1fr;
	/* max-width: 800px; */
}

.boardreply.grid .rreplycontent.span {
	grid-column: 1/-1;
	display: none;
}

.board.grid {
	display: grid;
	grid-template-columns: 1fr;
	max-width: 800px;
}

.board.grid>div {
	border: 1px solid black;
	padding: 10px;
}

.flex {
	display: flex;
	justify-content: space-between;
}

.flex>div {
	border: 1px solid black;
	padding: 10px;
}

.flex>div:nth-child(1), .flex>div:nth-child(4) {
	width: 50px;
	flex-shrink: 0;
}

.board>.subject {
	text-align: center;
	font-weight: 800;
}

.board>.subject {
	text-align: center;
	font-weight: 800;
}

.board [name=boardReplyContent] {
	width: 500px;
}
</style>
</head>
<body>
	<h1>Semim Board read</h1>
	<div class="board grid">
		<div>${dto.boardId }</div>
		<div>${dto.subject }</div>
		<div>${dto.content }</div>
		<div>${dto.hit }</div>
	</div>

	<div>
		<div class="subject">${dto.subject }</div>
		<div>${dto.content }</div>
	</div>


	<form id="frm-reply">
		<input type="hidden" name="boardId" value="${dto.boardId }">
		<div class="flex">
			<div>댓글</div>
			<div>
				<input type="text" name="boardReplyContent" required>
			</div>
			<div>
				<button type="button" class="btn reply">댓글 달기</button>
			</div>
		</div>
	</form>

	<div class="reply-wrap">
		<c:forEach items="${dto.replydtolist }" var="replydto">
			<form class="frm-rreply">
				<input type="hidden" name="boardId" value="${dto.boardId }">
				<input type="hidden" name="boardReplyId" value="${replydto.boardReplyId }"> 
				<input type="hidden" name="boardReplyLevel" value="${replydto.boardReplyLevel }"> 
				<input type="hidden" name="boardReplyStep" value="${replydto.boardReplyStep }">
				<input type="hidden" name="boardReplyRef" value="${replydto.boardReplyRef }">
				<div class="boardreply grid">
					<div>${replydto.boardReplyId }</div>
					<div>${replydto.boardReplyContent }</div>
					<div>${replydto.boardReplyWriteTime }</div>
					<div>${replydto.boardReplyWriter }</div>
					<div>
						<button type="button" class="btn show rreplycontent">ㄷㄷ글</button>
					</div>
					<div class=" span">
						<input type="text" name="boardReplyContent">
						<button type="button" class="btn rreply" name="">등록</button>
					</div>
				</div>
			</form>
		</c:forEach>
	</div>
	<div>${dto.replydtolist }</div>

	<script>
		$(loadedHandler);
		function loadedHandler() {
			//event 등록
			$(".btn.reply").on("click", btnReplyClickHandler);
			$(".btn.rreply").on("click", btnRreplyClickHandler);
			$(".btn.rreplycontent.show").on("click", btnRreplyContentClickHandler);
		}
		
		// 댓글
		function btnReplyClickHandler() {
			//Login 페이지로 이동
			console.log("댓글달기 버튼 클릭됨");
/* 			if (checkLogin("로그인되어야 글쓰기가 가능합니다.\n로그인페이지로 이동하시겠습니까?", "write")) {
				return;
			} */
			if($("#frm-reply [name=boardReplyContent]").val().trim().length == 0){
				alert("입력된 글이 없다");
				return;
			}
			console.log($("#frm-reply").serialize());
			
			$.ajax({
				url : "${pageContext.request.contextPath}/board/reply/write.ajax"
				,method : "post"
				,error : ajaxErrorHandler
				,data:$("#frm-reply").serialize()
				,dataType:"json"
				,success : function(result){
					console.log(result);
					if(result == "-1"){
						alert("댓글 작성이 되지 않았습니다 게시글 목록 이동 후 다시 작성 바람");
						location.href="${pageContext.request.contextPath}/list";
						return;
					}
					if(result == "0"){
						alert("댓글 등록에 실패했다");
						return;
					}
					displayReplyWrap(result);
				}
			});
			
		}
		
		// 대댓글
		function btnRreplyClickHandler() {
			//Login 페이지로 이동
			if (checkLogin("로그인되어야 글쓰기가 가능합니다.\n로그인페이지로 이동하시겠습니까?", "write")) {
				return;
			}
			// if($(this).parents(".frm-rreply").find("[name=boardReplyContent]").val().trim().length == 0)
			if($(this).parents(".frm-rreply").find("[name=boardReplyContent]").val().trim().length == 0){
				alert("입력된 글이 없다")
				return;
			}
			console.log($(this).parents(".frm-rreply").serialize());
	
		$.ajax({
			url: "${pageContext.request.contextPath}/board/reply/write.ajax"
			,method : "post"
			,error : ajaxErrorHandler
			,data : $(this).parents(".frm-rreply").serialize()
			,dataType : "json"
			,success : function(result){
				console.log(result);
				if(result == "-1"){
					alert("댓글 작성이 되지 않았습니다 게시글 목록 이동 후 다시 작성 바람");
					location.href="${pageContext.request.contextPath}/board/list";
					return;
				}
				if(result == "0"){
					alert("댓글 등록에 실패했다");
					return;
				}
				displayReplyWrap(result);
				}
			});
		}
		
		function displayReplyWrap(datalist){
			console.log("${dto.boardId}");
			var htmlVal = '';
			for(var idx in datalist){
				var replydto = datalist[idx];
				htmlVal += `
				<form class="frm-rreply">
				<input type="hidden" name="boardId" value="${dto.boardId }">
				<input type="hidden" name="boardReplyId" value="\${replydto.boardReplyId }">
				<input type="hidden" name="boardReplyLevel" value="\${replydto.boardReplyLevel }">
				<input type="hidden" name="boardReplyStep" value="\${replydto.boardReplyStep }">
				<input type="hidden" name="boardReplyRef" value="\${replydto.boardReplyRef }">
				<div  class="boardreply grid">
					<div>\${replydto.boardReplyId }</div>
					<div>\${replydto.boardReplyContent }</div>
					<div>\${replydto.boardReplyWriteTime }</div>
					<div>\${replydto.boardReplyWriter }</div>
					<div><button type="button" class="btn show rreplycontent">ㄷㄷ글</button></div>
					<div class="rreplycontent span"><input type="text" name="boardReplyContent" ><button type="button" class="btn rreply" >등록</button></div>
				</div>
				</form>
				`;
			}
		$(".reply-wrap").html(htmlVal);
		// html(새로운내용으로덮어쓰면기존event등록이사라짐)
		// event 다시 등록
		$(".btn.rreplycontent.show").on("click", btnRreplyContentClickHandler);
		$(".btn.rreply").on("click", btnRreplyClickHandler);
		}
		
		function btnRreplyContentClickHandler() {
			if($(this).text() == "ㄷㄷ글"){
				$(this).text("취소");
			}else{
				$(this).text("ㄷㄷ글");
			}
			$(this).parent().next().toggle();
		}
	</script>
</body>
</html>