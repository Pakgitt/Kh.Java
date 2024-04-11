<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script>
	function checkLogin(msg, prePage) {
		//Login 페이지로 이동
		var ssslogin = "${sssLogin }"; // EL 은 ""안에 작성되어 blank 상황에 문법적 오류 발생을 방지함.
		
		if ( !ssslogin ) {
			var result = confirm(msg);
			if( result ){
				location.href="${pageContext.request.contextPath}/login?prePage="+prePage;
			}else {
				//----
			}
			return true;
		}
		 
		return false;
	}
</script>