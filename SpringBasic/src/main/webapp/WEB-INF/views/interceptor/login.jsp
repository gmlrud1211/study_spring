<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 페이지</title>
		
	</head>
	<body>
		
		<div>
			<h2>login</h2>	
			<hr>
			<form action="/interceptor/login" method="post" >
				
				<div class="form-group">
					<label for="id" >아이디  </label>
					<input type = "text" name = "id" id="id" size="10" placeholder="아이디 입력" />
				</div>

				<div class="form-group">
					<label for="pw">패스워드 : </label>
					<input type="password" id ="pw" name="pw" placeholder="패스워드" />
				</div>	
				
				<div>		
					<input type="submit" value="입력"/>
				</div>
			</form>
		
		</div>
		
	</body>
</html>