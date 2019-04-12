<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://tiles.apache.org/tags-tiles" prefix="tiles" %>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<style type="text/css">
			/*모든 페이지에 적용되는 스타일 */
		
		.wrap {
			width:1100px;
			margin : 0 auto;
			border : 1px solid #ccc;
		}
		.header {
			border : 1px solid red;
		}
		.footer {
			border : 1px solid blue;
		}
		</style>	
		
		<!-- 모든 페이지에 jqeury 2.2.4.min 추가 -->
		<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js">
		</script>
		
		<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js">
			/* 모든페이지에 적용되는 자바스크립트  */
		</script>
		
		
	</head>
	<body>
		<!-- Header -->
		<tiles:insertAttribute name="header"/>
		
		<!-- Body -->
		<div class="wrap">
			<tiles:insertAttribute name="body"/>
		</div>
		
		<!-- Footer -->
		<tiles:insertAttribute name="footer"/>
		
	</body>
</html>