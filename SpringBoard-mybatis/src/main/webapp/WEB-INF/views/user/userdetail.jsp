<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
	<div id="content">
      <h2>회원 정보</h2>
      <table>
      	<tr>
      		<td>
      			<label>아이디</label>
      			<input type="text" name="userId" value="${user.userId}">
      		</td>
      	</tr>
      	<tr>
      		<td>
      			<label>비밀번호</label>
      			<input type="password" name="userPasswd" value="${user.userPasswd}">
      		</td>
      	</tr>
      	<tr>
      		<td>
      			<label>이름</label>
      			<input type="text" name="userName" value="${user.userName}">
      		</td>
      	</tr>
      	<tr>
      		<td>
      			<label>나이</label>
      			<input type="text" name="userAge" value="${user.userAge}">
      		</td>
      	</tr>
      	<tr>
      		<td colspan="2">
				<button onclick="list()">목록</button>
      		</td>
      	</tr>
      </table>
   </div>
   
   <script>
   		let list = function() {
   			location.href="/user/";
   		}
   </script>
</body>
</html>