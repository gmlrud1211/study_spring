<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!--  페이지네이션 요소 --> 
<div class="text-center">
	<ul class="pagination">
		<li>
			<!-- 첫페이지가 아니라면 처음 버튼 보이기 -->
			<c:if test="${paging.curPage ne 1}">
			<a href="/board/list?curPage=1">&larr;처음</a>
			</c:if>	
		</li>
		<!-- 이전 페이지 그룹 -->

		<c:if test="${paging.curPage gt paging.pageCount }">
			<li><a href="/board/list?curPage=${paging.startPage-paging.pageCount }&type=${type}&word=${word}">&laquo;&laquo;</a></li>
		</c:if>
		
		<!-- 이전 페이지 -->

		<c:if test="${paging.curPage ne 1 }">
			<li><a href="/board/list?curPage=${paging.curPage-1 }&type=${type}&word=${word}">&laquo;</a></li>
		</c:if>
		
		<!-- 페이징 리스트  -->
		<c:forEach begin ="${paging.startPage }" end="${paging.endPage }" var="i">
			
			<c:if test="${paging.curPage eq i }">		
				<li class="active"><a href="/board/list?curPage=${i }&type=${type}&word=${word}">${i }</a>		
			</c:if>
			<c:if test="${paging.curPage ne i }">
				<li><a href="/board/list?curPage=${i }&type=${type}&word=${word}">${i }</a>	
			</c:if>
			
		</c:forEach>

		<!-- 다음 페이지 -->

		<c:if test="${paging.curPage ne paging.totalPage}">
			<li><a href="/board/list?curPage=${paging.curPage+1 }&type=${type}&word=${word}">&raquo;</a></li>
		</c:if>	
		
		<!-- 다음 페이지 그룹 -->
		<c:if test="${paging.endPage ne paging.totalPage }">
			<li><a href="/board/list?curPage=${paging.startPage+paging.pageCount }&type=${type}&word=${word}">&raquo;&raquo;</a></li>
		</c:if>

	</ul>

</div>
