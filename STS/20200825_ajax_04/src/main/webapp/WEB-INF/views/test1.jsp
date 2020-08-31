<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX 심화 2</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function sendFile() {

		var formData = new FormData();
		var file = $("input:file")[0].files[0];
		console.log(file);
		formData.append("mfile", file);

		$.ajax({
			url : "/sendFile",
			type : "post",
			data : formData,
			contentType : false,
			processData : false,
			success : function() {
				alert("통신 성공!");
			},
			error : function(e) {
				alert("통신 실패...!");
				console.log(e);
			}
		});

	}

	function sendFileList() {
		var formData = new FormData();
		var fileList = $("#multi")[0].files;

		for (var i = 0; i < fileList.length; i++) {
			console.log(fileList[i]);
			formData.append("fileList", fileList[i]);
		}

		$.ajax({
			url : "/sendFileList",
			type : "post",
			data : formData,
			contentType : false,
			processData : false,
			success : function() {
				alert("통신성공!");
			},
			error : function(e) {
				alert("통신 실패...");
				console.log(e);
			}
		});
	}
</script>
</head>
<body>
	<form>
		<input type="file">
	</form>
	<button onclick="sendFile()">컨트롤러로 파일 보내기</button>
	<br>
	<br>
	<form>
		<input type="file" multiple="multiple" id="multi">
	</form>

	<button onclick="sendFileList()">컨트롤러로 다중 파일 보내기</button>
</body>
</html>