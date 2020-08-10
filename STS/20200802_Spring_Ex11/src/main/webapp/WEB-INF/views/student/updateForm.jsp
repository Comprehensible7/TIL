<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 정보 수정 ]</title>


	<script type="text/javascript">

		function formCheck(){

			var s_id = document.getElementById('s_id').value;
			var s_name = document.getElementById('s_name').value;
			var s_pw = document.getElementById('s_pw').value;
			var s_pw_check = document.getElementById('s_pw_check').value;
			var s_birth = document.getElementById('s_birth').value;
			var s_loc = document.getElementById('s_loc').value;
			var s_subject = document.getElementById('s_subject').value;

		}

	</script>
	
</head>
<body>

		<h3>[ 기존 가입 정보 ]</h3>
		
		<table border="1" style="border-collapse:collapse">
		
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>비밀번호</th>
				<th>생년월일</th>
				<th>지역</th>
				<th>전공</th>
				<th>가입날짜</th>

			</tr>
			
			<tr>
					<td>${s_id }</td>
					<td>${s_name }</td>
					<td>${s_pw }</td>
					<td>${s_birth }</td>
					<td>${s_loc }</td>
					<td>${s_subject }</td>
					<td>${s_indate }</td>

			</tr>

		</table>
		
		<br>



		<h1>회원 정보 수정</h1>
		
		<form action="/student/update" method="post" onsubmit="return formCheck()">
	
		<table border="1" style="border-collapse:collapse">
		
		<tr>
		<td><input type="text" name="s_id" id="s_id" placeholder="아이디를 입력"></td>
		<td><input type="text" name="s_name" id="s_name" placeholder="이름을 입력"></td>
		<td><input type="password" name="s_pw" id="s_pw" placeholder="비밀번호를 입력"></td>
		<td><input type="" name="s_pw_check" id="s_pw_check" placeholder="비밀번호를 다시 입력"></td>
		<td><input type="text" name="s_birth" id="s_birth" placeholder="생년월일을 입력"></td>
		<td><input type="text" name="s_loc" id="s_loc" placeholder="지역을 입력"></td>
		<td><input type="text" name="s_subject" id="s_subject" placeholder="전공을 입력"></td>
		<td><input type="submit" value="회원가입">
		
		</tr>
		</table>
	</form>
	
	<a href="/">메인으로</a>
		
</body>
</html>