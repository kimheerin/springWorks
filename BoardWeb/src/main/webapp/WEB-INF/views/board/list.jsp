<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
	<h2>게시글 목록</h2>
	<div>
		<table>
			<thead>
				<tr>
					<th>No</th><th>제목</th><th>작성자</th><th>작성일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${boardList}">
					<tr>
						<td>${board.id}</td>
						<td><a href="/board?id=${board.id}">${board.btitle}</a></td>
						<td>${board.bwriter}</td>
						<td>${board.bcontent}</td>
						<td>${board.createdDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>