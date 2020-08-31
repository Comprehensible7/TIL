<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${board.title }</title>
<style type="text/css">
	table {
		margin: 0 auto;
		width: 800px;
		text-align: center;
	}
	
	#contentTd {
		text-align: left;
		vertical-align: top;
	}
</style>
<script type="text/javascript" src="/resources/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		// 페이지 로딩이 완료되면 ajax를 이용해서 db로부터 댓글 목록을 가져온다.
		readReply();

		// 글 본문 영역의 높이가 300px보다 작으면 300px만큼 바꿔줌.
		// 테이블 칸끼리 너무 붙어 있어서 가독성을 높이려는 용도.
		if ($("#contentTd").height() < 300)
			$("#contentTd").height(300);
	});

	// 댓글 목록을 가져오는 함수
	function readReply() {
		$.ajax({
			url: "/board/readReply",
			type: "post",
			data: {
				boardNum: ${board.boardNum}
			},
			success: function(data) {
				// 데이터를 무사히 전달받으면 화면에 표시해주기 위해 output 함수를 실행한다.
				output(data);
			},
			error: function(e) {alert("통신 실패...");console.log(e);}
		});
	}

	// 컨트롤러로부터 전달받은 데이터를 화면에 표시해줄 함수
	function output(data) {
		// 문자열 형태로 화면에 표시해줄 html 요소를 만든다.
		var str = "";

		// 반복문을 이용해서 각각의 데이터를 테이블의 한 줄씩 구성한다.
		$.each(data, function(index, item) {
			str += "<tr>";
			str += "	<td>";
			str += "		" + item.writer;
			str += "	</td>";
			str += "	<td>";
			str += "		" + item.indate;
			str += "	</td>";
			str += "	<td>";
			str += "		" + item.content;
			str += "	</td>";
			str += "</tr>";
		});

		// 만든 html 요소 문자열을 적절한 위치에 추가한다.
		$("#replyTable").html(str);
	}
</script>
</head>
<body>
	<!-- 글 본문 테이블 -->
	<table border=1>
		<tr>
			<th colspan=2>${board.title }</th>
		</tr>
		<tr>
			<td>
				${board.writer }
			</td>
			<td>
				${board.indate }
			</td>
		</tr>
		<tr>
			<td colspan=2 id="contentTd">${board.content }</td>
		</tr>
	</table>
	
	<!-- 댓글 테이블 -->
	<table border=1 id="replyTable">
	
	</table>
	
	<!-- 추가 버튼들 및 가운데 정렬을 위한 div 태그 -->
	<div style="text-align: center;">
		<button onclick="location.href='/board/boardList'">게시판으로 이동</button>
		<button onclick="readReply();">댓글 다시 가져오기</button>
	</div>
</body>
</html>