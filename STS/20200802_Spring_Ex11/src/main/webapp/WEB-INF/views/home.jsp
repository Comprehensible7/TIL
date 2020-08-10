<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="UTF-8">
	<title>[ 메인 화면 ]</title>
</head>
<body>
<h1>
	메뉴를 선택해 주세요.  
</h1>

	<ul>

		<c:choose>
			<c:when test="${not empty sessionScope.loginId }">
				${sessionScope.loginId }님 환영합니다.
				<li><a href = "/student/joinList">회원 목록 조회</a></li>
				<li><a href = "/student/searchForm">회원 검색</a></li>
				<li><a href = "/student/logout">로그아웃</a></li>
			</c:when>
	
	
			<c:otherwise>
				<li><a href = "/student/loginForm">로그인</a></li>	
				<li><a href = "/student/joinForm">회원가입</a></li>
			</c:otherwise>	
		</c:choose>	
	</ul>



</body>
</html>
