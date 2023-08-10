<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/common/common.jsp"%>
<%@ page trimDirectiveWhitespaces="true" %>

	<script type="text/javascript">
		$(function() {
			$("#mgUpdateBtn").click(function() {   // 관리자 정보 수정 버튼
				$("#mgForm").attr({
					"method":"post",
					"action":"/member/updateMember.do"
				})
				$("#mgForm").submit();
			})
			
			$("#mgDeleteBtn").click(function() {   // 관리자 정보 삭제 버튼
				$("#mgForm").attr({
					"method":"post",
					"action":"/member/updateMember.do"
				})
				$("#mgForm").submit();
			})
		})
	</script>



		
	</head>
	<body>
	
	
	<div>${data.mgId}관리자님이 로그인하셨습니다. </div>
	<br/>
	<h1>로그인성공</h1>
	
	<form id="mgForm" name="mgForm">
		<button type="button" id="mgUpdateBtn" name="mgUpdateBtn">수정</button><br/>
		<button type="button" id="mgDeleteBtn" name="mgDeleteBtn">삭제</button><br/>
	</form>
		
	</body>
</html>