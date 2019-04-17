<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="web.dto.Comment"%>
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
			$(location).attr("href", "/board/update?board_no=${view.board_no }");
		});
		$("#btnDelete").click(function() {
			$(location).attr("href", "/board/delete?board_no=${view.board_no }");
		});
		
		$("#commentsubmit").click(function() {
			if($("#content").val() == ""){
				alert("댓글내용을 입력해주세요");
				return;
			} else {
				$("form").submit();
			}
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
		
		<form action="/board/comment" method="post">
			<div class="text-center">
				<input type="hidden" name="board_no" value="${view.board_no }"/>
				
				<table class="table table-striped table-hover">
					<tr>
						<td class="info" colspan="3">댓글</td><td><input type="text" name="content" placeholder="댓글을 입력해주세요." style="width:100%"/></td>
						<td class="info">작성자</td><td colspan="2"><input type="text" name="id" value="${id}" readonly="readonly" style="width:30%"/></td>
						<td><button type="button" id="commentsubmit" class="btn btn-info btn-mm">댓글등록</button></td>
					</tr>
				</table>
				
				<table class="table table-striped table-hover">
					<% List<Comment> commentList = (List) request.getAttribute("commentList"); %>
					
					<%
						for(int i=0; i<commentList.size(); i++) {
							if(commentList.get(i).getComment_no()<1 );
					%>
					<tr class="replyrow">
						<td id="replyElements"><%=commentList.get(i).getComment_no()%></td>
						<td id="replyElements"><%=commentList.get(i).getWriter_id() %></td>
						<td id="replyElements"><%=commentList.get(i).getContent() %></td>
						<td id="replyElements"><fmt:formatDate value="<%=commentList.get(i).getWrite_date() %>" pattern="MM-dd"/></td>
						<td><button type="button" id="replydelte" class="btn btn-warning-outline btn-sm">삭제</button></td>
					</tr>
					<% } %>
				</table>
			</div>
		</form>
	
	</div>
	
	<div class="text-center">	
		<button id="btnList" class="btn btn-primary">목록</button>
		<c:if test="${id == view.writer_id}">
			<button id="btnUpdate" class="btn btn-info">수정</button>
			<button id="btnDelete" class="btn btn-danger">삭제</button>
		</c:if>
	</div>
	
</body>
</html>