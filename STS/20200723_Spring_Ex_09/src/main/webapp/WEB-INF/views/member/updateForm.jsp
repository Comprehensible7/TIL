<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 폼</title>
</head>
<body>

	<h1>회원 수정 폼</h1>

	<form action="/member/update" method = "post" onsubmit="return formCheck();">
	
	아이디 : <input type="text" name="member_id" id="member_id" placeholder="아이디 입력" value="${member_id }" readonly="readonly"> <br>
	비밀번호 : <input type="password" name="member_pw" id="member_id" placeholder="비밀번호 입력"><br>
	비밀번호 확인 : <input type="password" name="member_pw_check" id="member_pw_check" placeholder="한번더 입력"><br>
	이름 : <input type="text" name="member_nm" id="member_nm" placeholder="이름 입력"><br>
	생년월일 : <input type="text" name="member_birth" id="member_birth" placeholder="ex:19900316"><br>
	<input type="submit" value="전송">
	
	
	</form>

</body>
</html>