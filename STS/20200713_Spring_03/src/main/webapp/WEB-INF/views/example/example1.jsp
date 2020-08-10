<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link href="/resources/css/style.css" rel="stylesheet">

</head>
<body>

	${gisu2 }
	
	<!-- alt는 이미지가 안보여질경우 화면에 표시하는 것 -->
	
	<!-- 상대경로, 절대경로 -->
	<!-- 앞의 /를 확인 필수 -->

	<!-- 얘는 절대경로임 => src="/resources/images/a.jpeg" 
		절대: 내 컴퓨터 기준으로 그 이미지가 어디있는지
	-->
	
	<!-- 얘는 상대경로임 => src="resources/images/a.jpeg" 
		상대: 그 이미지를 사용하고자 하는 파일에서 그 이미지가 어디있는지
	-->
	
	<!-- ../는 한칸 위로 올라간다는 의미 -->
	
	<img alt="이미지" src="../resources/images/a.jpeg">
	
</body>
</html>