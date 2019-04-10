<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>main</title>
		<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
		
		<script type="text/javascript">
			$(document).ready(function() {
				$("#btnAdmin").click(function() {
					location.href="/interceptor/admin/main";
				});
			});
		</script>
	</head>
	<body style="text-align:center;">
		
		<h2>Main</h2>
		<hr>
		
		<div style="text-align: center;">
		<a href="/board/list"><button>목록</button></a>
		<hr>
		
		<!-- 로그인 안한 상태 -->
		<c:if test="${ not login }">
			<p>로그인을 해주시오ㅠ___ㅠ</p>
			<a href="/board/login"><button>로그인</button></a>
		</c:if>
		
		<!-- 로그인 한 상태 -->
		<c:if test="${ login }">
			${nick } 님 하이요			
			<a href="/board/logout"><button>로그아웃</button></a>
		</c:if>
		

	</div>
		
		
	</body>
</html>