<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!-- 다운로드해서 연결해주는 방식 -->
	<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
	<!-- cdn연결방식 -->
	<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
	<script type="text/javascript">

	/* document는 자동생성되는 객체, 객체를 호출함 
	.ready라는 함수를 사용, ready는 페이지의 로딩이 끝나면 실행하라는 jquery의 문법임 */
	/* 익명함수를 바로 작성해서 실행 */
	
	/* window.onload = function(){alert('Hello World!');}  */
		
		$(document).ready(function(){
			alert('Hello World!')
			});

		/* 생략 가능 */
		$(function(){
			alert('Hello World!')
			});


		/* 함수를 변수처럼 사용할 수 있다 */
		/* var a = function(){
		}
		alert(typeof a) // function */	
	</script>
</head>
<body>


</body>
</html>