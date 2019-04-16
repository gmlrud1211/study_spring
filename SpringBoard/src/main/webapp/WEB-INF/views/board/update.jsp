<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
		
<script type="text/javascript">
	$(document).ready(function() {
		$("#btnList").click(function() {
			$(location).attr("href", "/board/list");
		});
	});
	</script>
<link rel="stylesheet" href="/css/bootstrap.css">
</head>
<body>

	<div class="container">
		<h3>게시글 상세조회</h3>
		<hr>
		
		<form action="/board/update" method="post">
		
		<table class="table table-striped table-hover">
		
			<tr>
				<td class="info">번호</td><td><input type="text" name="board_no" value="${view.board_no }" readonly="readonly"/></td>
				<td class="info">제목</td><td colspan="2"><input type="text" name="title" value="${view.title }"/></td>
			</tr>
			
			<tr>
				<td class="info">아이디</td><td><input type="text" name="board_no" value="${view.writer_id}" readonly="readonly"/></td>
				<td class="info">닉네임</td><td colspan="2">${view.writer_nick }</td>
			</tr>
		
			<tr><td class="info">본문</td><td colspan="4"><input type="text" name="content" value="${view.content}"style="width:200px; height:100px;"></td></tr>
		
			<tr>
				<td class="info">조회수</td><td>${view.hit }</td>
			</tr>
		
			<tr>
				<td class="info">작성일</td><td colspan="4"><fmt:formatDate value="${view.write_date }" pattern="yyyy-MM-dd"/></td>
			</tr>
		</table>
		<br>
		<div>
			<input type="submit" class="btn btn-info" value="글 작성"/>
			<button id="btnList" class="btn btn-primary">목록으로</button>
		</div>
				
		</form>
	</div>
	
		
	
</body>
</html>