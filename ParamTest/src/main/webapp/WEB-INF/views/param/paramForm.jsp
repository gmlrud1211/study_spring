<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>paramForm</title>
</head>
<body>
${test }


<form action="/param/requestParam" method="post">
이름 : <input type="text" name="name"/><br>
나이 : <input type="text" name="age"/><br>
<input type="submit" />

</form>
</body>
</html>