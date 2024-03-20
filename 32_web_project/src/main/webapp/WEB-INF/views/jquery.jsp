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
	<h1>Js Test</h1>
	<button type="button" class="btn first">신메뉴 추가</button>
	<button type="button" class="btn second">버튼2</button>
	<button type="button" class="btn add">추가</button>

	<div id="content1">
		<ul class="menu">
			<li>menu1</li>
			<li>menu2</li>
			<li id="select">menu3</li>
			<li class="c_select">menu4</li>
			<li>menu5</li>
			<li>menu6</li>
		</ul>
	</div>
	<script>
	var newMenu = '<li>new Menu</li>';
	$(".btn.first").on("click", function(){
		// 1. ul 첫번째 신메뉴 추가
		$("ul").prepend(newMenu); 
		/* $(newMenu).prependTo("ul"); */
		console.log($(newMenu));
		console.log(newMenu);
		console.log($(document.getElementById("select")));
		console.log($(document.getElementById("select").get(0)));
		/* $('<li>new Menu</li>').prependTo("ul"); */
		
		// 4. ul의 마지막메뉴로 신메뉴 추가
		// $("ul").append(newMenu);
		
		// 2. menu3 위에 신메뉴 추가
		// $(#select).before(newMenu);
		
		// 3. menu4 다음에 신메뉴 추가
		// $(".c_select").after(newMenu);
		
	});
	</script>
	<table border="1">
		<thead>
			<tr id="tbl-col">
				<td style="color: red;">컬럼명</td>
				<td>컬럼명</td>
			</tr>
		</thead>
		<tbody>

		</tbody>
	</table>
	<script>
		let count = 1;
		var cbf4 = function() {
			console.log("cbf4동작확인용 메시지");
			// 방법 1
			var htmlValue = '';
			htmlValue += '<tr>';
			htmlValue += '    <td>' + count + '</td>';
			htmlValue += '    <td>컬럼명' + count + '</td>';
			htmlValue += '</tr>';
			var temp = $("tbody").eq(0).html();
			$("tbody").eq(0).html(temp + htmlValue);
			$("td").first().css("color", "blue");
			count += 2;
		}
		/* document.getElementById("btn-add").addEventListener("click", cbf4); */
		$(".btn.add").click(cbf4);
		$(".btn").click(function() {
			console.lof("btn인 요소 젠부.. 클릭되면 공통으로 하고싶은 행동")
		})

		var cbF1 = function() {
			console.log("이벤트");
		}

		/*var btn1Elem = document.getElementByClas s("btn-event");
		btn1Elem.addEventListener("click", cbF1); */
	</script>
</body>
</html>