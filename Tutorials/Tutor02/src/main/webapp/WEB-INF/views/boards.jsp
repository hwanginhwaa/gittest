<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="javatime" uri="http://sargue.net/jsptags/time" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boards</title>
</head>
<body>
	<h1>게시판 전체 목록</h1>
	<a href="register">새로작성</a>
	<table border="1">
		<tr>
			<th align="conter" width="80">번호</th>
			<th align="conter" width="320">제목</th>
			<th align="conter" width="100">작성자</th>
			<th align="conter" width="180">작성일</th>
		</tr>
		
	<c:choose>
		<c:when test= "${empty boards}">
			<tr>
				<td colspan="4">
					List is empty.
				</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach items= "${boards}" var="board">
				<tr>
					<td align="center">${board.boardNo}</td>
					<td align="left"><a href="/board/read?boardNo=${board.boardNo}">${board.title}</a></td>
					<td align="right">${board.writer}</td>
					<td align="center"><javatime:format value="${board.regDate}" pattern="yyyy-MM-dd HH:mm"	/></td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
	
	</table>
</body>
</html>