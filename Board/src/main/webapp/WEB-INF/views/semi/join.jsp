<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <script src="https:/code.jquery.com/jquery-3.7.1.js"></script> -->
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>

</head>
<body>
	<h1>Semim Join</h1>

	<form action="${pageContext.request.contextPath}/join" method="post">
		<div>
			아이디:<input type="text" name="id">
			<button type="button" class="btn checkid">중복확인</button>
		</div>
		<div>
			비밀번호:<input type="text" name="pwd">
		</div>
		<div>
			이메일:<input type="text" name="email">
		</div>
		<div>
			<button type="submit">회원가입</button>
		</div>
	</form>
	
	<div class="memeber-list">
	
	</div>

	<!-- 꼬다리 스크립트위치 -->
	<script>
		$(loadedHandler);
		function loadedHandler() {
			// 이벤트 등록
			$(".btn.checkid").on("click", btnCheckIdClickHandler);
		}

		function btnCheckIdClickHandler() {
		console.log("클릭");
			var idVal = $("[name=id]").val();
			$.ajax({
				async : false, // false - 동기식 : 응답이 올 때까지 다른 작업 대기
				url : "${pageContext.request.contextPath}/checkid",
				method : "post",
				data : {cid : $("[name=id]").val(), k1:"v1", k2:"v2"}, 
				// Controller의 getParameter 변수 명과 동일해야 함 - contentType
				
				// dataType은 success의 result의 자료형
				// dataType : "json",
				success : function(result) {
					console.log(result);
					if(result > 0) {
						alert("아이디중복")
					}else{
						alert("사용가능하다")
					}
					/*
					var htmlVal= '';
					$.each(result, function(){
						console.log(this.email);
						// 백틱
						htmlVal += '<div>'+this.memEmail+'<div>';
					});
					$(".member-list").html(htmlVal); 
					*/
				},
				error : function(request, status, error) {
					alert("code: " + request.status + "\n" + "message: "
							+ request.responseText + "\n" + "error: " + error);
				}

			}); // OBJECT 자료형
		}
	</script>
</body>
</html>