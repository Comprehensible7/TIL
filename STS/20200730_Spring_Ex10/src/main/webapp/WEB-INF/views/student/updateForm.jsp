<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 수정 폼 ]</title>

<script type="text/javascript">

	function formCheck(){

		var student_pw = document.getElementById('student_pw').value;
		var student_pw_check = document.getElementById('student_pw_check').value;
		var student_name = document.getElementById('student_name').value;
		var student_subject = document.getElementById('student_subject').value;
		
		if(student_pw == '' || student_pw.length == 0){
			alert('비밀번호를 입력해 주세요.')
			return false;
		}else if(student_pw.length < 4 || student_pw.length > 13){
				alert('비밀번호는 4글자 이상 13글자 이하로 입력해 주세요.')
			return false;
				
			}

		if(student_pw != student_pw_check){
			alert('동일한 비밀번호를 입력해 주세요.')
			return false;
			}

		if(student_name == '' || student_name.length == 0){
			alert('이름을 입력해 주세요.')
			return false;
		}else if(student_name.length < 2 || student_name.length > 10){
			alert('이름은 2글자 이상 10글자 이하로 입력해 주세요.')
			return false;
			}

		if(student_subject == '' || student_subject == 0){
			alert('전공명을 입력해 주세요.')
			return false;
			
			}else if(student_subject.length < 2 || student_subject.length > 20){
				alert('전공명은 2글자 이상 20글자 이하로 입력해 주세요.')
				return false;
				}
		
			return true;
		} 


</script>

</head>
<body>

	<h3>[ 기존 가입 정보 ]</h3>
	
	
<table border="1" style="border-collapse:collapse;">
	
		
	<tr>	
		<th>학번</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>학과명</th>
		<th>가입일</th>
	</tr>	
	
	<tr>
		<td>${student_id }</td>
		<td> ${student_pw }</td>
		<td> ${student_name }</td>
		<td> ${student_subject }</td>
		<td> ${student_indate }</td>
		
	</tr>
</table>
<br>	

		<h1>[ 수정 폼 ]</h1>
		
		
		
		
		<form action="/student/update" method="post" onsubmit="return formCheck()">
	
		<table border="1" style="border-collapse:collapse;">
		
		<tr>	
		<th>학번</th>
		<th>비밀번호</th>
		<th>비밀번호 체크</th>
		<th>이름</th>
		<th>학과명</th>
		<th>가입일</th>
		</tr>	
		
		<tr>
		<td><input type="text" id="student_id" name="student_id" value="${student_id }" readonly></td>
		<td><input type="password" id="student_pw" name="student_pw"></td>
		<td><input type="password" id="student_pw_check" name="student_pw_check"></td>
		<td><input type="text" id="student_name" name="student_name"></td>
		<td><input type="text" id="student_subject" name="student_subject"></td>
		<td><input type="text" id="student_indate" name="student_indate" value="${student_indate }" readonly></td>
		<td><input type="submit" value="수정"></td>
		</tr>
		</table>
		</form>
		
		
		<ul>
			<li>
				<a href = "/">홈으로 이동하기</a>
			</li>
		</ul>
		
</body>
</html>