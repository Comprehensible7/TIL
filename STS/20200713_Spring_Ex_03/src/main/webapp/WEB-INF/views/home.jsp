<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>日本語食べません。</title>
</head>
<body>

<h1>
	[ ホームページ ]
</h1>

<h2>
	${level }
	${level2 }
</h2>


<ul>
	<li>
	
	<a href="/ex/example1?name=test">JSP 파일 이동1</a> <br>
	<a href="/ex/example2?phone=number">JSP 파일 이동2</a> <br>
	<a href="/ex/example3?age=123">JSP 파일 이동3</a>
	
	</li>


</ul>

</body>
</html>
