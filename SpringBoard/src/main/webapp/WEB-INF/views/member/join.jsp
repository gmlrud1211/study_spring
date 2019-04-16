<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입페이지</title>
				
	</head>
	<body style="text-align:center;">
		
		
		<div>
			<h2>Join</h2>
			<hr>
		
			<form action="/member/join" method="post" >
					
				<div>
					<label for="id">아이디</label>
					<input type="text" id="id" name="id" />
				</div>
				
				<div >
					<label for="pw" >패스워드</label>
					<input type="password" id="pw" name="pw" />
				</div>
				
				<div >
					<label for="nick" >닉네임</label>
					<input type="text" id="nick" name="nick"/>
				</div>
					
				<br>	
				<div>
					<input type="submit" value="가입"/>
				</div>
				
		</form>
		
		</div>	
	</body>
</html>