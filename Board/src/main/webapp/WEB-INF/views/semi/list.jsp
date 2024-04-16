<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/semi/common_function.jsp" />
<title>게시판</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
</head>
<style>
table tr {
	border: 1px solid black;
}

.board.grid {
	display: grid;
	grid-template-columns: 1fr 5fr 3fr 2fr 1fr;
}

.board.grid>div {
	display: flex;
	border: 1px solid black;
	text-align: center;
}

ul {
	/* list-style-type: none; */
	
}

ul>li {
	display: inline-block;
	padding: 0 10px;
}
</style>
<body>
	[[ 로그인 정보 : ${sssLogin} ]]
<%-- 	<br> [[ map : ${map.dtolist }]]
	<br> [[ totalPageCount : ${map.totalPageCount }]]
	<br> [[ startPageNum : ${map.startPageNum }]]
	<br> [[ endPageNum : ${map.endPageNum }]] --%>
	<br>



	<div>
		<table style="border: 1px solid black;">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성일</th>
				<th>작성자</th>
				<th>조회수</th>
			</tr>
			<c:forEach items="${map.dtolist }" var="vo" varStatus="vs">
				<tr>
					<td>${vo.boardId }</td>
					<td><a
						href="${pageContext.request.contextPath }/read?id=${vo.boardId }">${vo.subject }</a></td>
					<td>${vo.writeTime }</td>
					<td>${vo.boardWriter }</td>
					<td>${vo.hit }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div>
		<ul>
			<c:if test="${map.startPageNum > 1}">
				<li><a
					href="${pageContext.request.contextPath }/list?page=${map.startPageNum-1 }">
						&lt;&lt; </a></li>
			</c:if>
			<c:forEach begin="${map.startPageNum }" end="${map.endPageNum }"
				var="page">
				<c:if test="${map.currentPageNum == page }">
					<li><strong>${page }</strong></li>
				</c:if>
				<c:if test="${map.currentPageNum != page }">
					<li><a
						href="${pageContext.request.contextPath }/list?page=${page }">${page }</a></li>
				</c:if>
			</c:forEach>
			<c:if test="${map.endPageNum < map.totalPageCount }">
				<li><a
					href="${pageContext.request.contextPath }/list?page=${map.endPageNum+1 }">
						&gt;&gt; </a></li>
			</c:if>
		</ul>
	</div>

	<div>
		<button type="button" class="btn write">글쓰기</button>
	</div>
	<script>
		$(loadedHandler);
		function loadedHandler() {
			//event 등록
			$(".btn.write").on("click", btnWriteClickHandler);
		}

		function btnWriteClickHandler() {

			// Login 페이지로 이동
			if (checkLogin("로그인되어야 글쓰기가 가능합니다.\n로그인페이지로 이동하시겠습니까?", "write")) {
				return;
			}
			
			location.href = "${pageContext.request.contextPath}/write";
			/* // 오류발생 var sslogin = ${dtolist};
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
			 */
		}
	</script>
</body>

</html>