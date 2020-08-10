<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
		${"10" + 1 }<br>
		${1000 < 2000 }<br>
				
		
		<!-- var값 출력하기 -->
		<!-- 	변수생성		값  scope="request" -->
		<c:set var="id" value="test" scope="request"></c:set>
		
		${id }<br>
				
		<!-- test를 출력함 -->
		<!-- 스코프는 지정안해주면 디폴트로 page가 들어감 -->
		<!-- id를 지우고 !!!를 출력함 -->
		<c:remove var="id"/>
		${id } !!! <br>
		
		
		<!-- true false -->
		<c:if test="${3<5 }">
			3은 5보다 작다.
		</c:if>
		
		<br>
 --%>
</body>
</html>