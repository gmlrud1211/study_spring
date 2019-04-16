<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>main</title>
	</head>
	<body style="text-align:center;">
		
		<h2>Main</h2>
		<hr>
		
		<div style="text-align: center;">
		<!-- 로그인 안한 상태 -->
		<c:if test="${ not login }">
			<p>로그인을 해주시오ㅠㅡㅠ</p>
			<a href="/member/join"><button>회원가입</button></a>
			<a href="/member/login"><button>로그인</button></a>
		</c:if>
		
		<!-- 로그인 한 상태 -->
		<c:if test="${ login }">
			<a href="/board/list"><button>게시판으루~</button></a>
			<a href="/member/logout"><button>로그아웃</button></a>
		</c:if>
			
	</div>
		
		
	</body>
</html>