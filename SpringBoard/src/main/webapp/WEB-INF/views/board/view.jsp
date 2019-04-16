<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board list</title>

<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
		

<script type="text/javascript">
	$(document).ready(function() {
		$("#btnList").click(function() {
			$(location).attr("href", "/board/list");
		});
		$("#btnUpdate").click(function() {
		/* 	$(location).attr("href", "/board/update?boardno=${boardView.boardno }"); */
		});
		$("#btnDelete").click(function() {
		/* 	$(location).attr("href", "/board/delete?boardno=${boardView.boardno }"); */
		});
	});
	</script>
<link rel="stylesheet" href="/css/bootstrap.css">
</head>
<body>

	<div class="container">
		<h3>게시글 상세조회</h3>
		<hr>
		
		<form id="boardForm">
		<table class="table table-striped table-hover">
		
			<tr>
				<td class="info">번호</td><td>${view.board_no }</td>
				<td class="info">제목</td><td colspan="2">${view.title }</td>
			</tr>
			
			<tr>
				<td class="info">아이디</td><td>${view.writer_id }</td>
				<td class="info">닉네임</td><td colspan="2">${view.writer_nick }</td>
			</tr>
		
			<tr><td class="info">본문</td><td colspan="4">${view.content }</td></tr>
		
			<tr>
				<td class="info">조회수</td><td>${view.hit }</td>
			</tr>
		
			<tr>
				<td class="info">작성일</td><td colspan="4"><fmt:formatDate value="${view.write_date }" pattern="yyyy-MM-dd"/></td>
			</tr>
		</table>
		</form>
	</div>
	
	<div class="text-center">	
		<button id="btnList" class="btn btn-primary">목록</button>
		<button id="btnUpdate" class="btn btn-info">수정</button>
		<button id="btnDelete" class="btn btn-danger">삭제</button>
	</div>
		
	
</body>
</html>