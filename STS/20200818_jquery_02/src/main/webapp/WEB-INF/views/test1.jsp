<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

		var arr = ['https://naver.com', 'https://daum.net', 'https://google.co.kr']

		/* 이 코드가 없으면 a태그값은 실행안됨 */
		$(function(){

		/* 태그선택자 */
		$('a').each(function(index, item){
				/* attr은 속성과 관련된 함수를 관리 */
				$(item).attr('href', arr[index])
			});
		});

		function removeLink(){

			/* $('a').each(function(index, item){ */
				/* 링크값을 가져옴 */
				/* if($(item).attr('href') == 'https://naver.com') */
					/* 네이버면 지워라 */
				/* 	$(item).removeAttr('href') */
				/* })   */
				
				/* 아이디값중에 다음만 지워라 */				
				/* $('#daum').removeAttr('href')  */
				
			/* 	$('a').removeAttr('href');  */
		
				var txt = $('input[type=text]').val()

				$('a').each(function(index, item){
						if($(item).attr('href') == txt)
							$(item).removeAttr('href')
					})
		}

</script>
</head>
<body>

	<a>네이버로 이동</a><br>
	<a id="daum">다음으로 이동</a><br>
	<a>구글로 이동</a><br>
	
	<input type="text">
	
	<button onclick="removeLink()">링크 삭제</button>
	
</body>
</html>