<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
	//로드가 끝나고 난 후 이벤트 실행
	// window.onload = loadedHandler;
	$(loadHandler);
	
	window.addEventListner("load", loadHandler);
	function loadedHandler() {
		console.log("loaded 이벤트 발생시 호출됨")
		// event 등록
		$([tpye=button]).on("click", calcClickHandler);
		var elem = $("td");
		console.log(elem);
	}
</script>
</head>
<body>
	<script>
		// document.getElementById("").onclick = function() {}; 
		console.log("그냥 여기 2")
		var elem = $("td");
		console.log(elem);
	</script>
	<table border="1" class="cafe">
		<tr>
			<th>메뉴</th>
			<th>가격</th>
			<th>수량</th>
			<th>합계</th>
		</tr>
		<tr>
			<td>아메리카노</td>
			<td>2500</td>
			<td><input type="text" name="c1" class="c in"></td>
			<td><input type="text" name="c1Price" class="p" readonly></td>
		</tr>
		<tr>
			<td class="item b">라떼</td>
			<td class="price b">3000</td>
			<td><input type="text" name="c2" class="c in"></td>
			<td><input type="text" name="c2Price" class="p" readonly></td>
		</tr>
		<tr>
			<td>생강라떼</td>
			<td>4500</td>
			<td><input type="text"></td>
			<td></td>
		</tr>
		<tr>
			<td>딸기바나나라떼</td>
			<td>4500</td>
			<td><input type="text"></td>
			<td></td>
		</tr>
		<tr>
			<td>합계</td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>
				<button type="button">계산하기</button>
				<button type="reset">초기화</button>
			</td>

			<!-- <td></td>
            <td></td> -->
		</tr>
	</table>

	<script>
		console.log("여긴 body 꼬다뤼 3")
		var elem = $("td");
		console.log(elem);
	</script>

</body>
</html>