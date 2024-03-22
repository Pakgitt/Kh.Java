<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 선택 해제</title>
<script src="https:/code.jquery.com/jquery-3.7.1.js"></script>
</head>
<style>
* {
	/* box-sizing: border-box; */
	/* border : 1px solid black; */
	
}
/* .checkboxs{
	display : flex;
	gap : 10px;
}
 */
/* 
.checkbox {
overflow : hidden;
}
 */
.checkedItems {
	clear: both;
}

.checkboxs>div {
	float: left;
	margin-right: 20px;
}
</style>


<script>
	//const : 상수
	// const itemCount = 10;
	$(loadedHandler);
	function loadedHandler() {
		/* 1.화면구성 */
		var htmlValue = '';
		for (var i = 1; i <= 10; i++) {
			// 백틱 `
		htmlValue +=
			`
			<div>
				<lable for="item-x">item - i</lable>
				<input type="checkbox" class="item" id="item-i" data-itemcode="i">
			</div>
			`; 
/* 		 
			htmlValue += 
			htmlValue = '<div>'
			htmlValue = '<lable for="item-x>"item-i"</lable>';
			htmlValue = '<input type="checkbox" class="item" id="item-i" data-itemcode="i">';
			htmlValue = '</div>';
			  */
		}
		/* 안의 내용 지우고 넣어줘 : html에 htmlValue를 넣어줘  */
		$(".checkboxs").html(htmlValue);
		/* 2. 전체선택 이벤트 등록 */
		/* $("#allcheck").on("click",function(){}); */
		$("#allCheck").on("click", allCheckHandler);

		/* 4. items(item)를 이벤트 등록  */
		$(".item").on("click", itemCheckHandler);

		/* 6. 반대선택 이벤트 등록 */
		$("#revCheck").on("click", revCheckHandler);

	}

	/* 7. 반대선택 이벤트 처리 CB Handler */
	function revCheckHandler() {
		console.log($(this));
		$(".item").each(function(index, element) {
			console.log(this); // xxx(each) 메소드 앞 객체 - 그 중 하나씩
			console.log(element); // xxx(each) 메소드 앞 객체 - 그 중 하나
			console.log($(this).prop("checked"));
			$(element).prop("checked", !$(element).prop("checked"));

		});
		/* 		
		 $(".item").prop("checked", function(index, checkedValue) {
		 // 2번째 매개인자는 each는 element하나, 그 외 메소들은 checked 된 값이 전달됨
		 // each 외 xxx(prop) 메소드의 cb function들은 each 기능 내포되어있음
		 console.log("========");
		 console.log(this); // xxx(prop) 메소드 앞 객체 - 그 중 하나씩
		 console.log(checkedValue); // xxx(prop) 메소드 앞 객체 - 그 중 하나의 checked의 getter 값
		 $(this).prop("checked", !checkedValue)
		 });
		
		 */
	}

	/* 5. item이벤트 처리 CB  Heandler */
	function itemCheckHandler() {
		//console.log(this);
		console.log($(this)); // 이벤트 발생 바로 그 item

		/* 100. item 이벤트, 반대선택 이벤트 처리 시 공통 부분 함수로 만들기 - 전체선택체크 */
		updateCheckAllByCheckedItem();
		console.log($(this).data("itemcode"));

		var lable = $(this).parent().children("lable").html();
		/* 8. checkedItems에 이벤트 발생 바로 그 item을 div로 생성 */
	c
		} else {
			/* 9. checkedItems에 이벤트 발생 바로 그 item을 div를 제거 */
				console.log(this);
			var checkedElement = this;
			var cehckedElement = $(this);
			
			checkedElement.innerHTML = '';
			$checkedElement.html('');
			
			$(".checkItems").children().each(function(index, element){
				console.log(this);
				console.log($(this));
				console.log($(this).data("itemcode"));
				console.log($checkedElement).data("itemcode"));
			if($this).data("itemcode") == $checkedElement.data("itemconde")
			$(this).remove();
			// for 문은 아니므로 break; 사용 불가
			return;
			});
		}
	}
	function updateCheckAllByCheckedItem() {
		if ($(".item:checked").length == itemCount) {
			$("#allCheck").prop("checked", true);
		} else {
			$("#allCheck").prop("checked", false);
		}
	}

	/* 3. 전체선택 이벤트 러치 CB Heandler */
	function allCheckHandler() {
		//console.log(this);
		/* jquery의 object모양 */
		console.log($(this));
		//attr()메소드는 동적페이지 변화를 인지하지 않는다.
		//console.log($(this).attr("checked")); //attr : undefined
		//prop()메소드는 동적페이지 변화를 인지하고 그 결과값을 true/false/로 준다.
		console.log($(this).prop("checked")); //prop : true 
		console.log($(".item")); //10개의 elements
		//property
		$(".item").prop("checked", $(this).prop("checked"));
		/* 		//원시적인 방법
		if ($(this).prop("checked")) {
			$(".item").prop("checked", true);
		} else {
			$(".item").prop("checked", false);
		}
		 */
		 
		 /* 10. 전체선택 처리 후 ㅎcheckImtes에도 전체 적용 */
		 if(allChecked){
			 $(".item").each(function() {
				 console.log("====");
				 var temp = ".checkedItems > div[data-itemcode="+$(this).data("itemcode")+"]";
				 console.log($(temp).length);
				 if(!$(temp).length){
					 var labe = $(this).parent().childeren()"label".html();
				 }				
			})
		 }
	}
</script>
<body>
	<h1>jQuery 전체선택/반대선택</h1>
	<div class="wrap-check">
		<lable for="allCheck">전체선택</lable>
		<input type="checkbox" id="allCheck">
	</div>
	<div>
		<lable for="revCheck">반대선택</lable>
		<input type="checkbox" id="revCheck">
	</div>


	<div>
		<div class="checkboxs">
			<!-- 				
			<div>
				<lable for="item-x">item-1</lable>
				<input type="checkbox" id="item-x" class="item" id="item-x" data-itemcode="n">
			</div>
			<div>
				<lable for="item">item-1</lable>
				<input type="checkbox" id="item-1" class="item">
			</div>
			<div>
				<lable for="item">item-1</lable>
				<input type="checkbox" id="item-1" class="item">
			</div>
			  -->
		</div>
		<div>
			<div class="checkedItems">

				<div data-itemcode="n">
					<span>메뉴item-n</span>
				</div>

			</div>
		</div>
	</div>
</body>
</html>