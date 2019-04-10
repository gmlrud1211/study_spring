<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>글작성페이지</title>
				
	</head>
	<body style="text-align:center;">
		
		
		<div>
			<h2>BoardWrite</h2>
			<hr>
		
			<form action="/login/join" method="post" >
					
				<div>
					<label for="title">글제목</label>
					<input type="text" id="title" name="title" />
				</div>
				
				<div >
					<label for="content" >내용</label>
					<input type="text" id="content" name="content" />
				</div>
				
				<br>	
				<div>
					<input type="submit" value="작성"/>
				</div>
				
		</form>
		
		</div>	
	</body>
</html>