<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서등록</title>

	<script type="text/javascript">

		var book_user
		var book_pw
		var book_pw_check
		var book_name
		var book_auth
		var book_pub
		var book_loc
		var book_price
	


	</script>

</head>
<body>

	<h1>[ 도서등록 ]</h1>


	<form action="/book/insert" method="post" onsubmit="return formCheck">
	
		<!-- ID : <input type="text" name="book_id" id="book_id" disabled><br> -->
		USER : <input type="text" name="book_user" id="book_user"><br>
		PW : <input type="password" name="book_pw" id="book_pw"><br>
		PW_CHECK : <input type="password" name="book_pw_check" id="book_pw_check"><br>
		NAME : <input type="text" name="book_name" id="book_name"><br>
		Auth : <input type="text" name="book_auth" id="book_auth"><br>
		PUB : <input type="text" name="book_pub" id="book_pub"><br>
		LOC : <input type="text" name="book_loc" id="book_loc"><br>
		PRICE : <input type="number" name="book_price" id="book_price"> 원<br>
	
		<input type="submit" value="등록">
	</form>



	<a href="/">메인으로</a>
</body>
</html>