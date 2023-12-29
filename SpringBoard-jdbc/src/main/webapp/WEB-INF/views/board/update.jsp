<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
   <div id="content">
      <h2>글 수정</h2>
      <form action="/board/update" method="post">
      <input type="hidden" name="id" value="${board.id}">
	      <table>
	      	<tr>
	      		<td>
	      			<label></label>
	      			<input type="text" name="boardTitle"
	      			value="${board.boardTitle}"
	      			placeholder="글제목">
	      		</td>
	      	</tr>
	      	<tr>
	      		<td>
	      			<label></label>
	      			<input type="text" name="boardWriter"
	      			value="${board.boardWriter}"
	      			placeholder="작성자" readonly>
	      		</td>
	      	</tr>
	      	<tr>
	      		<td>
	      			<label></label>
	      			<textarea rows="5" cols="50" name="boardContent"
	      			placeholder="글내용">${board.boardContent}</textarea>
	      		</td>
	      	</tr>
	      	<tr>
	      		<td>
   					<button type="submit">수정</button>
	      		</td>
	      	</tr>
	      </table>
      </form>
   </div>
</body>
</html>