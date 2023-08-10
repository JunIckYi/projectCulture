<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/common/common.jsp"%>
<%@ page trimDirectiveWhitespaces="true" %>



	<script type="text/javascript">		
		$(function() {
			$("#mlogin").click(function(){
				$("#mlogform").attr({
					"method":"post",
					"action":"/manager/loginBoardManager.go"
				});
				$("#mlogform").submit();
			
			});
			
			
		});

	</script>

		
	</head>
	<body>
	
	<h1>관리자 페이지 입니다.</h1>
		<div>
			<form name="mlogform" id="mlogform">
				<input type="text" name="mgid" id="mgid" ><br/>
				<input type="password" name="mgpw" id="mgpw">
				<span id="msg"></span><br/>
				
				<button type="button" id="mlogin" name="mlogin">로그인</button>
			</form>
		</div>
	</body>
</html>