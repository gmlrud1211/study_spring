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

<style>
	ul{text-align:center; margin-top:30px;}
	   ul li{display: inline-block; border:1px solid #ccc}
	   ul li a{padding:10px; text-decoration: none; color:#333; display:block;}
	   ul li.on{border:1px solid red;}
	   ul li.on a{color:red}
</style>

<link rel="stylesheet" href="/css/bootstrap.css">
</head>
<body>

	<div class="container">
		<h3>게시판 리스트</h3>
		<hr>
		
		<form id="boardForm">
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th style="width: 10%">번호</th>
					<th style="width: 45%">제목</th>
					<th style="width: 20%">작성자</th>
					<th style="width: 10%">조회수</th>
					<th style="width: 20%">작성일</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach items="${boardList }" var="board">
					<tr>
						<td>${board.board_no }</td>
						<td>${board.title }</td>
						<td>${board.writer_id }</td>
						<td>${board.hit }</td>
						<td><fmt:formatDate value="${board.write_date }" pattern="yyyy-MM-dd"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</form>
	</div>
	<jsp:include page="../layout/paging.jsp"/>
	
	<div>
		<a href='#' onClick='fn_write()' class="btn btn-success" style="float:right">글쓰기</a>
	</div>
	
</body>
</html>