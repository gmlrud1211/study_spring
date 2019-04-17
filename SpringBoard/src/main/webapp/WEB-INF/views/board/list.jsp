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
		$("#btnWrite").click(function() {
			$(location).attr("href", "/board/write");
		});
	
	});
	</script>

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
						<td><a href="/board/view?board_no=${board.board_no }">${board.title }</td>
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
	<br>
	
	<div class='text-center' style="clear:both;">
		<form method='get' action='/board/list'>
		   
		      <select name='type'> <!-- 검색 컬럼 -->
		       
		        <option id="title" value='title'>제목</option>
		        <option id="content" value='content'>내용</option>
		      
		      </select>
		      <input type='text' name='word' placeholder="검색어를 입력해주세요."> 
		            <button type='submit' >검색</button>    
		  </form>
	  </div>
		
	
	<div class="text-center">	
		<button id="btnWrite" class="btn btn-success" style="float:right">글쓰기</button>
	</div>
		
	
</body>
</html>