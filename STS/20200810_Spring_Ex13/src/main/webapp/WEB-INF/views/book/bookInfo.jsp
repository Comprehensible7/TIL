<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[ 도서 정보 ]</title>

		<script type="text/javascript">

			function bookUpdate(){

				var book_id = document.getElementById('book_id').value;

				location.href = "/book/updateBookForm?book_id=" +book_id;

			}




		</script>
</head>
<body>
		<h1>[ 도서 정보 ]</h1>
		
		등록순서 : ${bookList.book_row }<br>
		사용자 : ${bookList.book_id }<br>
		분류번호 : ${bookList.book_user}<br>
		비밀번호 : ${bookList.book_pw }<br>
		도서명 : ${bookList.book_name }<br>
		저자명 : ${bookList.book_auth }<br>
		출판사 : ${bookList.book_pub }<br>
		도서장르 : ${bookList.book_loc }<br>
		도서가격 : ${bookList.book_price }<br>
		등록일자 : ${bookList.book_indate }<br>
	
		<input type="button" value="수정" onclick="bookUpdate()">
		<input type="hidden" id="book_id" value="${bookList.book_id }"><br>
		
		<a href="/">메인으로</a>
</body>
</html>