<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>파일 리스트</h1>
<hr>

<table>
   <tr>
      <th>번호</th>
      <th>파일명</th>
      <th>파일크기</th>
      <th>첨부일자</th>
   </tr>
   <c:forEach items="${list }" var="i">
      <tr>
         <td>${i.fileno }</td>
         <td><a href="/file/download?fileno=${i.fileno }">${i.origin_name }</a></td>
         <td>${i.file_size }</td>
         <td>${i.upload_date }</td>
      </tr>
   </c:forEach>
</table>

<form action="/file/fileup" method="get">
   <button>등록으로</button>
</form>
