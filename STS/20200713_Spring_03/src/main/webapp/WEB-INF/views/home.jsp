<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>메인화면</title>
</head>
<body>

<h1>
   [ 메인 화면 ]
</h1>

<h2>
	<%-- ${}--%>
	<!-- EL표현식 -->
	<!-- 자바에서 내가 등록한 값을 jsp에서 표현하기 위해서 사용 하는 값 -->
   
	${gisu }
	${gisu2 }
   
</h2>

<ul>
   <li>
   <!-- a태그는 get방식으로만 보낼 수 있음 -->
   
   <!-- 요청 주소를 작성할 때 반드시 지켜야 하는 규칙
   		
   		동일한 요청주소를 작성하지 않는다. 요청주소는 고유해야한다.(유니크)
   		
   		회원파트
   		
   		이종호 : /member/pay/
   		이재상 : /member/board/
   		
   	
   	
   		쿼리스트링 방식
   		
   		요청주소?변수명=값&변수명=값
   		
   		location.href="http://www.naver.com";
   		location.href="http://localhost:9090/ex/example?name=abcd";
   		
   	-->
   
      <a href="/ex/example1?name=test">JSP 파일 이동1</a><br>
      <a href="/ex/example2?phone=test2">JSP 파일 이동2</a><br>
      <a href="/ex/example3">JSP 파일 이동3</a>
   </li>
</ul>    

</body>
</html>



