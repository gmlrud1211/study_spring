<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>myPage</title>
	</head>
	<body style="text-align:center;">
		
		<h2>MyPage</h2>
		<hr>
		
		<h4>내정보 조회</h4>
		<div style="text-align: center;">
			<table border="1">
				<tr>
					<td>id</td>
					<td><input name="id" value="${user.id }" readonly="readonly"></td>
				</tr>
				<tr>
					<td>pw</td>
					<td><input name="pw" value="${user.pw }"></td>
				</tr>
				<tr>
					<td>email</td>
					<td><input name="email" value="${user.email}"></td>
				</tr>
				<tr>
					<td>phone</td>
					<td><input name="phone" value="${user.phone }"></td>
				</tr>
			</table>
		</div>
		
		
	</body>
</html>