<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileupload form</title>
</head>
<body>
	<h3>파일업로드 폼</h3>

	<form action="/file/fileup" method="post" enctype="multipart/form-data">
		<label for="title">제목</label>
		<input type="text" name="title" id="title">
		<br><br>
		<label for="file">첨부파일</label>
		<input type="file" name="file" id="file">
		<br><br>
		<input type="submit"/>
	</form>

</body>
</html>