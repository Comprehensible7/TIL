<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 등록 리스트 ]</title>
</head>
<body>
		<h1>[ 등록 리스트 ]</h1>
		
		<table border="1" style="border-collapse:collapse">
		
		<c:forEach items="${hosList }" var="hs">
		
			<tr>
				<th>등록순번</th>
				<td>${hs.row_num }</td>
				
				<th>차트번호</th>
				<td>${hs.h_no }</td>
				
				<th>환자번호</th>
				<td><a href="/hospital/selectForm?h_no=${hs.h_no }">${hs.h_hnum }</a></td>
				
				<th>진료과</th>
				<td>${hs.h_sec }</td>
			</tr>
			
			<tr>
				<th>위치</th>
				<td>${hs.h_loc }</td>
				
				<th>의사명</th>
				<td>${hs.h_doc }</td>
				
				<th>환자명</th>	
				<td>${hs.h_name }</td>
				
				<th>담당간호사</th>
				<td>${hs.h_sup }</td>
			</tr>
				
			<tr>
				<th>환자기록</th>
				<td>${hs.h_info }</td>
				
				<th>진단명</th>
				<td>${hs.h_res }</td>
				
				<th>진료비</th>
				<td>${hs.h_price }원</td>
				
				<th>진료날짜</th>
				<td>${hs.h_indate }</td>
			
			</tr>
			
				

			<tr>
				<td><a href="/hospital/deleteInfo?h_no=${hs.h_no }">삭제</a></td>
			</tr>
					
					
				
			</c:forEach>
		</table>
		
		<br>
		
		<a href="/">메인으로</a>
</body>
</html>