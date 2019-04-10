<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>adamin main</title>

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
		<h2>관리자메인</h2>
		<hr>
		
		<h5>${nick} 님이 로그인한 상태</h5>
		<hr>
		<a href="/interceptor/main" >메인으로</a>
		

		
	</body>
</html>