<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 폼</title>
</head>
<body>
		
		<h1>[ 회원 가입 폼 ]</h1>
		
		<form action="" method ="post" onsubmit="return formCheck();">
		
		ID : <input type = "text" name = "mem_id" id = "mem_id"><br>
		PW : <input type = "password" name = "mem_pw" id = "mem_pw"><br>
		Name : <input type = "text" name = "mem_nm" id = "mem_nm"><br>
		<input type="submit" value="전송">
		
		</form>
</body>
</html>