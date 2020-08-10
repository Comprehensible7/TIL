<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 회원 조회 ]</title>

	<script type="text/javascript">

		function formCheck(){

			var s_id = document.getElementById('s_id').value;


			if(s_id == '' || s_id.length == 0){
				alert('아이디를 입력해 주세요')
					return false;

				}else if(isNaN(s_id)){
				alert('아이디는 숫자만 입력 가능합니다')
					return false;
				}
			return true;
		}


	</script>
	
</head>
<body>
		<h1>회원 조회</h1>
		
		<form action="/student/search" method="get" onsubmit="return formCheck()">
		아이디 : <input type="text" name="s_id" id="s_id" placeholder="아이디를 입력">	
		</form>
		
		<br>
		
		<a href="/">메인으로</a>

</body>
</html>