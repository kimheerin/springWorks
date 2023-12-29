<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
   <div id="content">
      <h2>글쓰기</h2>
      <form action="/board/write" method="post">
      <table>
      	<tr>
      		<td>
      			<label></label>
      			<input type="text" name="boardTitle" placeholder="글제목">
      		</td>
      	</tr>
      	<tr>
      		<td>
      			<label></label>
      			<input type="text" name="boardWriter" value="${sessionId}">
      		</td>
      	</tr>
      	<tr>
      		<td>
      			<label></label>
      			<textarea rows="5" cols="50" name="boardContent" placeholder="글내용"></textarea>
      		</td>
      	</tr>
      	<tr>
      		<td colspan="2">
      			<input type="submit" value="등록">
      			<input type="reset" value="취소">
      		</td>
      	</tr>
      </table>
      </form>
   </div>
</body>
</html>