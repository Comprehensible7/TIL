<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX 심화</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

	/* JSON보내기 */
	function fourth() {

		var data = {
			userid: $("input:text").val(),
			userpw: $("input:password").val()
			}

		$.ajax({

			url : "/fourth",
			type : "post",
			// json에 맞춘 문자열화 진행
			data : JSON.stringify(data),
			// 문자열 설정
			contentType: "application/json;charset=utf-8",
			success : function() {
				alert('통신 성공!');
			},
			error : function(e) {
				alert('통신 실패...!');
				console.log(e);
			}
		});

	}
	/* JSON받기 */
	function fifth(){

			$.ajax({
				url: "/fifth",
				type: "post",
				dataType: 'json',
				success: function(data){
					alert('통신 성공!');
					console.log(data);
					
				},
				error: function(e){
					alert('통신 실패...!');
					console.log(e);
				}
			})

		}
</script>
</head>
<body>
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

	<button onclick="fourth();">JSON 객체로 보내기</button>
	<button onclick="fifth();">JSON 객체로 받기</button>
</body>
</html>