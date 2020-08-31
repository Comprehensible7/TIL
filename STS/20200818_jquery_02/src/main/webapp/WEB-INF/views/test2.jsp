<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">


	var str = "<h1>새로운 제목</h1>"

	$(function(){

		// 스크립트 문법
		var div1 = document.getElementById('div1').innerHTML
		console.log('innerHTML:\n' + div1)

		/* innerHTML속성을 대체가능 */
		div1 = $('#div1').html()
		console.log('html():\n' + div1)
		
		div1 = document.getElementById('div1').innerText
		console.log('innerText:\n' + div1)

		// 쿼리 문법
		div1 = $('#div1').text()
		console.log('text():\n' + div1)
		
	})
	
	function appendStr(){

		var div1 = $('#div1').html()
		div1 += "<h3>추가된 부제목</h3>"
			$('#div1').html(div1)
	}

</script>
</head>
<body>
		
		<div id="div1">
		
		<h1>제목</h1>
		<p>본문</p>
		
		</div>
		
		<div id="div2">	</div>
		
		<button onclick="document.getElementById('div2').innerHTML=str">innerHTML로 내용 추가</button><br>
		<button onclick="$('#div2').html(str)">html()로 내용 추가</button><br>
		<button onclick="document.getElementById('div2').innerText=str">innerText로 내용 추가</button><br>
		<button onclick="$('#div2').text(str)">text()로 내용 추가</button><br>
		
		<button onclick="$('#div1').remove()">remove()</button><br>
		<button onclick="$('#div1').empty()">empty()</button><br>
		
		<button onclick="appendStr()">div1에 내용 추가</button>
		
		
		
</body>
</html>