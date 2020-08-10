<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
</head>
<body>

	<h1>회원 목록 페이지</h1>

	<table border="1" style="border-collapse:collapse;">
	
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>날짜</th>
			<th>Del</th>
			<!-- <th>Upd</th> -->
			
		</tr>
	
	<c:forEach var="member" items="${memberList }" varStatus="status">
	
		<tr>
			<td>${status.count }</td>
			<td>${member.member_id }</td>
			<td>${member.member_pw }</td>
			<td><a href = "/member/updateForm?member_id=${member.member_id }&member_pw=${member.member_pw}&member_nm=${member.member_nm}&member_indate=${member.member_indate}">${member.member_nm }</a></td>
			<td>${member.member_indate }</td>
		
		<!-- 
			Jsp에서 삭제 클릭 
			(해당하는 회원의 id(primary key)의 값을 전달)
			
			삭제 요청이 컨트롤러에 전달
			
			DB에서 해당하는 회원의 정보를 삭제
			
			회원 목록 화면으로 돌아옴, 처리 된 이후로 보여진다
		 -->
		
			<td>
				<!-- 쿼리 스트링 방식 사용 -> ? 표시하려는 값 = EL태그 사용, 위의 변수명.값 입력 -->
				<!-- 요청주소?변수명=값&변수명 = 값&변수명 -->
				<!-- 해당하는 리스트에 있는 삭제를 클릭 시 선택한 아이디만 삭제된다 -->
				
				<a href = "/member/delete?member_id=${member.member_id }">삭제</a>
			</td>
			
			</tr>
	
	</c:forEach>
	
	</table>
	
	<ul>
		<li>
			<a href="/">홈으로 이동하기</a>
		</li>
	</ul>

</body>
</html>