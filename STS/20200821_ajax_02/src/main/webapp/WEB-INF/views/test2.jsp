<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX 중급</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>

<script type="text/javascript">

	function first() {

		$.ajax({
			url: "/first",
			type: "POST",
			/* data: {
				userid: $("input:text").val(),
				userpw: $("input:password").val()
			}, */
			
			// form태그 데이터 직렬화
			data: $("form").serialize(),
			success: function(){
				alert('통신 성공!');
			},
			error: function(e){
				alert('통신 실패...!');
				console.log(e);
			}
		});
	}


	function second() {
		var arr = [$("input:text").val(),$("input:password").val()]
		$.ajax({

			url: "/second",
			type: "POST",
			data: {
				arr: arr
			},
			/* 배열을 넘길땐 이거사용 */
			traditional: true,
			
			success: function(){
				alert('통신 성공!');
			},
			error: function(e){
				alert('통신 실패...!');
				console.log(e)
			}
		});
	}


	function third() {

		$.ajax({
			url: "/third",
			type: "POST",
			/* data: {
				userid: $("input:text").val(),
				userpw: $("input:password").val()
			}, */
			// 아이디 선택자
			data: $("#userForm").serialize(),
			success: function(){
				alert('통신 성공!');
			},
			error: function(e){
				alert('통신 실패...!');
				console.log(e);
			}
		});
	}
	
</script>

</head>
<body>
	<h1>여러 개의 데이터 보내기</h1>
	<form id="userForm">
		<table>
			<tr>
				<td>아이디 :</td>
				<td><input type="text" name="userid"></td>
			</tr>

			<tr>
				<td>비밀번호 :</td>
				<td><input type="password" name="userpw"></td>
			</tr>
		</table>
	</form>
	
	<button onclick="first();">여러 개의 매개변수로 각각 보내기</button>
	<button onclick="second();">배열을 통해서 보내기</button>
	<button onclick="third()">VO를 통해서 보내기</button>
</body>
</html>