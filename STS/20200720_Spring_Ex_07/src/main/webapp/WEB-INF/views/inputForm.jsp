<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 폼</title>
<link rel="stylesheet" type="text/css" href="resources/css/default.css"/>
<script src="resources/js/formCheck.js"></script>
</head>
<body>

<h1>[ 정보 입력 폼 ]</h1>

<form id="inputForm" action="input" method="post" onsubmit="return inputFormCheck()">

<table>

	<tr>
		<th>이름</th>
		<td><input type="text" name="name" id="name" placeholder="이름을 입력하세요."></td>
	</tr>
	
	<tr>
		<th>나이</th>
		<td><input type="number" name="age" id="age" value="0"></td>
	</tr>

	<tr>
		<th>주소</th>
		<td><input type="text" name="address" id="address"></td>
	</tr>
	
	<tr>
			<th colspan="2">
				<input type="submit" value="전송">
			</th>
	</tr>

</table>

</form>

</body>
</html>