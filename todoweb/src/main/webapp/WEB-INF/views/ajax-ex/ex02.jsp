<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax-study</title>
<style>
	.content{margin-left: 30px;}
</style>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
</head>
<body>
	<div class="content">
	<h2>2. POST</h2>
	<p>
		<button type="button" onclick="myFunction()"> 전송 </button>
	</p>
	</div>
	
<script>
	//ajax : 제이쿼리 라이브러리 임포트 필요
	//ajax 함수는 객체로 구성되고 형태는 {key: value}
	const myFunction = function(){
		//alert("test...");
		$.ajax({
			//요청 방식 : GET, 요청 주소 : /ex01, 성공, 실패(함수)
			type: "POST",
			url: "/ex02",
			success: function(res){ //res : 서버에서 보내 주는 자료
				console.log("성공", res);
			},
			error: function(){
				
				console.log("실패")
			}
		});
	}
</script>
</body>
</html>