<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>

		<script type="text/javascript">

			function boardCheck(){

				var board_title = document.getElementById('board_title').value;
				var board_context = document.getElementById('board_context').value;


				if(board_title == '' || board_tile.length==0){
						alert('제목을 입력해 주세요.')

				return false;
						
				} else if(board_title.length < 2 || board_title.length > 12){
					alert('제목은 2글자 이상 10글자 이하로 입력해 주세요.')

				return false;
						}

				if(board_context == '' || board_context.length==0){
					alert('내용을 입력해 주세요.')

				return false;

				}
				

				return true;
				}


		</script>


</head>
<body>

	<h1>[ 글 수정 ]</h1>
	
	<form action="/board/boardUpdate" method="post" onsubmit="return boardCheck()">

	글 제목 : <input type = "text" name="board_title" id="board_title" value=${map.BOARD_TITLE }> <br>
	글 내용 : <br>
	<textarea rows="10" cols="40" name="board_context" id="board_context" maxlength="300">${map.BOARD_CONTEXT }
	
	</textarea>
	
	<input type="hidden" name="board_no" value="${map.BOARD_NO }">
	<br>
	<input type="submit" value="글 수정">
	
	</form>
	
	<br>
	<a href="/board/boardList">목록으로 이동</a>
	
</body>
</html>