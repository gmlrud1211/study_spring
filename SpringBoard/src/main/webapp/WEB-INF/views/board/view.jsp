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
		
		//게시글 수정
		$("#btnUpdate").click(function() {
			$(location).attr("href", "/board/update?board_no=${view.board_no }");
		});
		
		//게시글 삭제
		$("#btnDelete").click(function() {
			$(location).attr("href", "/board/delete?board_no=${view.board_no }");
		});
		
		//댓글 작성
		$("#commentsubmit").click(function() {
			if($("#content").val() == ""){
				alert("댓글내용을 입력해주세요");
				return;
			} else {
				$("form").submit();
			}
		});
		
		$("#commentdelete").click(function() {
			var comment_no = $(this).attr("comment_no");
			console.log(comment_no);
			//$(location).attr("href", "/board/commentDelete?comment_no="+comment_no);
		});
		
		//추천버튼 클릭
		$("#btnRecomm").click(function () {
			
			var userid = {view.writer_id};
			var boardno = {view.board_no};
			var type = "recommend";
			
			$.ajax({
				type:"post"
				, url : "/board/recommend"
				, data : {
					"userid":userid,
					"boardno":boardno,
					"type":type
				}
				, dataType:"text"
				, success: function(data){
					$("#btnRecomm").show();
					$("#btnRecommCancel").hide();
				$("#cnt").html(data);
				}
				, error: function(e) {
					alert("추천실패, 잠시 후 다시 시도해주세요");
					console.log(e);
				}
			});
			
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
				<td class="info">추천수</td><td id="recommendCnt"><span id="cnt"><%-- ${  } --%> </span>
					<button id="btnRecomm" class="btn btn-success btn-sm">추천up!</button>
					<button id="btnRecommCancel" class="btn btn-warning btn-sm">추천취소</button>
				</td>
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
						<td>
							<button type="button" id="commentdelete" class="btn btn-warning-outline btn-sm">삭제</button>
						</td>
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