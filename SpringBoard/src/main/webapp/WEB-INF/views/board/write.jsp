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
		
		
		<div class="container">
			<h2>BoardWrite</h2>
			<hr>
		
			<form class="form-horizontal" action="/board/write" method="post" >
					
				<div class="form-group">
					<label for="title" class="col-sm-3 col-sm-offset-1 control-label">글제목</label>
					<input type="text" id="title" name="title" />
				</div>
				
				<div class="form-group">
					<label for="id" class="col-sm-3 col-sm-offset-1 control-label">작성자</label>
					<input type="text" name="id" value="${id }" readonly="readonly" />
				</div>
				
				<div class="form-group">
					<label for="content" class="col-sm-3 col-sm-offset-1 control-label" >내용</label>
					<input type="text" name="content" style="width:200px; height:100px;">
				</div>
				<br>	
				<div>
					<input type="submit" value="글 작성"/>
				</div>
				
		</form>
		
		</div>	
	</body>
</html>