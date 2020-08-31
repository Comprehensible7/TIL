<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">	
	function first(){

		$.ajax({
			url: "/first",
			success: function(){
				alert('통신 성공!');
			}
		})
	}

	// 데이터 보내기
	function second(){

		var data = {
				msg: "안녕하세요?"
			}

		var settings = {

			url: "/second",
			//data: "안녕하세요?",
			//data: {msg: "안녕하세요?"},
			data: data,
			success: function(){
				alert('통신 성공!');
			}
		}
		$.ajax(settings);
	}

	// 컨트롤로에서 데이터 받기
	function third(){
		$.ajax({
			url: "/third",
			success: function(data){
					alert('통신 성공!')
					alert('컨트롤로에서 받은 데이터: ' + data)
					
				}
			});
		}

	function fourth(){
			$.ajax({
				url: "/fourth",
				type: "POST",
				data: {
					msg: "안녕하세요!"
				},
				success: function(data){
					alert('통신 성공!');
					alert('컨트롤러에서 받은 데이터: ' + data);
				}
			})
		}
	
	</script>
</head>
<body>
		<button onclick="first()">AJAX로 단순 통신하기</button>
		<button onclick="second()">컨트롤러로 문자열 보내기</button>
		<button onclick="third()">컨트롤러에서 문자열 받기</button>
		<button onclick="fourth()">컨트롤러로 문자열 보내고 받기</button>
</body>
</html>