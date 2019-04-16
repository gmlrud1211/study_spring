<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>글작성페이지</title>
		<link rel="stylesheet" href="/css/bootstrap.css">
	</head>
	<body style="text-align:center;">
		
		
		<div>
			<h2>BoardWrite</h2>
			<hr>
		
			<form action="/board/write" method="post" >
					
				<div>
					<label for="title">글제목</label>
					<input type="text" id="title" name="title" />
				</div>
				<div>
					<label for="id">작성자</label>
					<input type="text" name="id" value="${id }" readonly="readonly" />
				</div>
				
				<div >
					<label for="content" >내용</label>
					<input type="text" name="content" style="text-align:center; width:200px; height:100px; letter-spacing: 1px">
				</div>

				<br>	
				<div>
					<input type="submit" value="글 작성"/>
				</div>
				
		</form>
		
		</div>	
	</body>
</html>