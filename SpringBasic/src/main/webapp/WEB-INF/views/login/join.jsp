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
		
			<form action="/login/join" method="post" >
					
				<div>
					<label for="id">아이디</label>
					<input type="text" id="id" name="id" />
				</div>
				
				<div >
					<label for="pw" >패스워드</label>
					<input type="password" id="pw" name="pw" />
				</div>
					
				<div >
					<label for="email" >이메일</label>
					<input type="text" id="email" name="email"/>
				</div>
				
				<div >
					<label for="phone" >번호</label>
					<input type="text" id="phone" name="phone"/>
				</div>
					
				<br>	
				<div>
					<input type="submit" value="가입"/>
				</div>
				
		</form>
		
		</div>	
	</body>
</html>