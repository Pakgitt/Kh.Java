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
<style>
	table {
		border: 1px solid black;
	}
</style>

<body>
	<h1>게시판</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<tbody class="table-body">

		</tbody>
	</table>
	<button type="button" class="btn write">글작성</button>
	<script>
		$(loadedHandler);
		function loadedHandler() {
			$(".btn.write").on("click", btnWriteHandler);
		}
		function btnWriteHandler() {
			var htmlVal = '<tr>' +
							'<td>번호</td>' +
							'<td>제목</td>' +
							'<td>작성자</td>' +
							'<td>작성일</td>' +
							'<td>조회수</td>' +
						'<tr>';
			$(".table-body").append(htmlVal);
		}
	</script>
</body>

</html>