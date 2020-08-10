<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 관리자 로그인 ]</title>
</head>
<body>
		<h1>[ 로그인 ]</h1>
		
		<form action="/hospital/login" method="post" onsubmit="return formCheck()">
		
		NO : <input type="text" name="h_no" id="h_no"><br>
		HNUM : <input type="text" name="h_hnum" id="h_hnum"><br>
		<input type="submit" value="로그인">
		
		</form>
		
</body>
</html>