<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX 보충2</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	/* JSON보내기 */
	function sendJSON() {
		$.ajax({

			url : "/sendJSON",
			type : "post",
			data : JSON.stringify({
				userid : $("input:text").val(),
				userpw : $("input:password").val()
			}),
			contentType : "application/json;charset=utf-8;",
			success : function() {
				alert("통신 성공!");
			},
			error : function(e) {
				alert("통신 실패...!");
				console.log(e);
			}
		});
	}
	/* JSON받기 */
	function receiveJSON() {
		$.ajax({

			url : "/receiveJSON",
			type : "post",
			dataType : "json",
			success : function(data) {
				alert("통신 성공!");
				console.log(data)
			},
			error : function(e) {
				alert("통신 실패...!");
				console.log(e);
			}
		});
	}

	/* ArrayList보내기 */
	function sendList() {
		var list = [ $("input:text").val(), $("input:password").val() ]

		$.ajax({
			url : "/sendList",
			type : "post",
			data : JSON.stringify(list),
			contentType : "application/json;charset=utf-8;",
			success : function() {
				alert("통신 성공!");
			},
			error : function(e) {
				alert("통신 실패...!");
				console.log(e);
			}
		});

	}

	/* HashMap보내기 */
	function sendMap() {
		var map = {
			userid : $("input:text").val(),
			userpw : $("input:password").val()
		}

		$.ajax({
			url : "/sendMap",
			type : "post",
			data : JSON.stringify(map),
			contentType : "application/json;charset=utf-8;",
			success : function() {
				alert("통신 성공!");
			},
			error : function(e) {
				alert("통신 실패...!");
				console.log(e);
			}
		});

	}

	/* JSON받기 */
	/* text로 받기 */
	function receiveList() {
		$.ajax({

			url : "/receiveList",
			type : "post",
			/* dataType : "json", */
			dataType: "text",
			/* success : function(data) {
				alert("통신 성공!");
				console.log(data)
			}, */
			success: function(data){
				alert("통신 성공!");
				console.log(data);
				console.log(JSON.parse(data));
				},
			error : function(e) {
				alert("통신 실패...!");
				console.log(e);
			}
		});
	}

	/* JSON받기 */
	/* text로 받기 */
	function receiveMap() {
		$.ajax({

			url : "/receiveMap",
			type : "post",
			/* dataType : "json", */
			dataType: "text",
			/* success : function(data) {
				alert("통신 성공!");
				console.log(data)
			}, */
			success: function(data){
				alert("통신 성공!");
				console.log(data);
				console.log(JSON.parse(data));
				},
			error : function(e) {
				alert("통신 실패...!");
				console.log(e);
			}
		});
	}
</script>
</head>
<body>

	<form>
		<input type="text"> <input type="password">
	</form>
	<button onclick="sendJSON()">컨트롤러에 JSON 객체 보내기</button>
	<button onclick="receiveJSON()">컨트롤러에 JSON 객체 가져오기</button>

	<button onclick="sendList()">컨트롤러에 ArrayList 객체 보내기(feat.JSON)</button>
	<button onclick="sendMap()">컨트롤러에 HashMap 객체 보내기(feat. JSON)</button>

	<button onclick="receiveList()">컨트롤러에 ArrayList 객체 받기(feat.JSON)</button>
	<button onclick="receiveMap()">컨트롤러에 HashMap 객체 받기(feat. JSON)</button>

</body>
</html>