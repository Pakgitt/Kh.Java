<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script>

	if(function checkLogin("글작성은 로그인해야 가능합니다 로그인 페이지로 이동하시겠습니까?", "write")) {
		return;
/* 		
		// Login 페이지로 이동
		if (!ssslogin) {
			var result = confirm("글작성은 로그인해야 가능합니다 로그인 페이지로 이동하시겠습니까?");
			if (result) {
				location.href = "${pageContext.request.contextPath}/login?prePage=write";
			} else {
				// -----
			}
			// TODO
			return true;
		}
		 */
		return false;
	}
</script>