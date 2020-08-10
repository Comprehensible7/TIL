<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

	<!-- 
		 action = form tag안에 있는 데이터가 전달될 요청 주소 
		
		 method = form tag안에 있는 데이터를 전달할 때 사용할 Http method 방식을 지정(get, post)
	-->

	<!-- 쿼리스트링 방식 -->
	<!-- 요청주소? 변수이름=값 & 변수이름=값 -->
	
	<!-- 보여줘도 전혀 상관없는 방식이 필요하면 GET방식 -->
	<!-- 안보여주려면 POST방식, Http Body부분에 숨어버리기때문에 값이 안보임 -->
	<!-- Tag의 name 속성에 지정한 값은 Java쪽의 변수명과 일치시켜야 한다. -->

	<!-- 객체만들때처럼 new는 작성할 필요 없다 -->
	<form action="/join2" method="post">
	
		ID : <input type="text" name="id"> <br>
		PW : <input type="password" name="pw"> <br>
		Name : <input type="text" name="name"> <br>
		Age : <input type="number" name="age"> <br>
		<input type="submit" value="가입">
		
	</form>



</body>
</html>
