<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>

		${"10" + 1 }<br>
		${1000 < 2000 }<br>
				
		
		<!-- var값 출력하기 -->
		<!-- 	변수생성		값  scope="request" -->
		<c:set var="id" value="test" scope="session"></c:set>
		
		${id }<br>
				
		<!-- test를 출력함 -->
		<!-- 스코프는 지정안해주면 디폴트로 page가 들어감 -->
		<!-- id를 지우고 !!!를 출력함 -->
		<!-- 두개의 scope값이 일치해야 완전히 삭제되어야 한다. -->
		<c:remove var="id" scope="session"/>
		${id } !!! <br>
		
		
		<!-- true false -->
		<c:if test="${3<5 }">
			3은 5보다 작다.
		</c:if>
		
		<br>
		
		<c:if test="${!empty str }">
			<p>${str }님 환영합니다.</p>
		</c:if>
		
		
		<c:if test="${not empty str }">
			<p>${str }님 환영합니다.</p>
		</c:if>
		
		
		<c:choose>
			<c:when test="${num <10 }">
				${num }은 10보다 작다.
			</c:when>
		
			
		<c:otherwise>
			${num }은 10보다 크다.
		</c:otherwise>
		</c:choose>
		<br>
		
		<table border="1">
			<tr>
				<th>이름</th>
			</tr>
		<!-- 변수 s를 선언하고 아래에서 불러오면 지정된 값인 리스트를 불러온다 -->
		<c:forEach var="s" items="${list }">
			<tr>
				<td>${s }</td>	
			</tr>
		</c:forEach>
		</table>
		
		<br>
		
		<table border="1">
			<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>나이</th>
			</tr>
			
			<!-- varStatus는 변수의 속성, 변수명을 정해주고 인덱스를 넣는다 -->
			<!-- index또는 count사용 -->
			<!-- index는 0부터 시작 -->
			<!-- count는 1부터 시작 -->
			<c:forEach var="vo" items="${list2 }" varStatus="status">
				<tr>
					<td>${status.count }</td>
					<td>${vo.id }</td>
					<td>${vo.pw }</td>
					<td>${vo.age }</td>
				</tr>
			</c:forEach>
		
		
		</table>
		
		<br>
		
		<c:forEach var="i" begin="0" end="5" step="1">
			${i } <br>
		
		</c:forEach>
		
		<br>
		
		
		<table border="1">
			<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>나이</th>
			</tr>
			
			
		<!-- begin은 for문처럼 0부터 시작 -->
		<!-- step은 1씩 증가하는것을 나타냄(별도로 지정하지 않으면 자동으로 증가) -->
		<!-- i+1은 번호값, 리스트.사이즈 -1은 인덱스 값 조절 -->
		<!-- 아래의 식은 가져와야할 특정 값만 출력해야할때 사용한다 -->
			<c:forEach var="i" begin="0" end="${list2.size() -1 }">
				<tr>
					<td>${i + 1 }</td>
					<td>${list2[i].id }</td>
					<td>${list2[i].pw }</td>
					<td>${list2[i].age }</td>
				</tr>
			</c:forEach>
		
		</table>
		
		<br>
		
		<!-- 경로 지정해주기 -->
		<img alt="ㅇㅅㅇ" src="<c:url value='resources/images/0.jpeg'/>">
		
		<!-- 변수생성 -->
		 <!-- marquee는 우측에서 좌측으로 이동하는 효과를 나타냄 -->
		<c:set var="str3" value="<marquee>test</marquee>"/>
		 
		 ${str3 }<br>
		 
		 <!-- EL로 출력하면 HTML기능을 이용 -->
		 <!-- 아래의 코드는 코드가 그대로 다 나타남 -->
		 <c:out value="${str3 }"/>
		 
		
		 
</body>
</html>
