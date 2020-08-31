<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function sendArray() {

		$.ajax({

			url : "/sendArray",
			type : "POST",
			data : {
				arr : [ $("input:text").val(), $("input:password").val() ]

			},
			traditional : true,
			success : function() {
				alert("통신 성공!");
			},
			error : function(e) {
				alert("통신 실패...!");
				console.log(e);
			}
		});
	}

	function sendVO() {

		$.ajax({

			url : "/sendVO",
			type : "post",
			/* data : {
				// VO의 필드명과 동일해야함
				userid : $("input:text").val(),
				userpw : $("input:password").val()

			}, */

			data: $("form").serialize(),

			success : function() {
				alert("통신 성공!");
			},
			error : function(e) {
				alert("통신 실패...!");
				console.log(e);
			}
		});

	}

	// JSON기능 pom.xml확인
	function receiveArray(){
			
		$.ajax({

			url: "/receiveArray",
			type: "post",
			success: function(data){alert("통신 성공!");console.log(data)},
			error : function(e) {alert("통신 실패...!");console.log(e);}

			});

		}

	function receiveVO(){

		$.ajax({

			url: "/receiveVO",
			type: "post",
			success: function(data){alert("통신 성공!");console.log(data)},
			error : function(e) {alert("통신 실패...!");console.log(e);}

			});


		}
</script>

</head>
<body>

	<form>
		<input type="text" name="userid"> <input type="password"
			name="userpw">
	</form>

	<button onclick="sendArray()">컨트롤러로 배열 보내기</button>
	<button onclick="sendVO()">컨트롤러로 VO 보내기</button>
	<button onclick="receiveArray()">컨트롤로에서 배열 받기</button>
	<button onclick="receiveVO()">컨트롤러에서 VO 받기</button>

</body>
</html>