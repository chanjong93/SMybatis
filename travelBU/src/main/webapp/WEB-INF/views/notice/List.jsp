<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<a href="/account/login">로그아웃</a>
</div>
<div>
<a href="/notice/register">글쓰기</a>
</div>


<div>
	<table>
 	<thead>
 		<tr>
 			<th>No</th>
 			<th>제목</th>
 			<th>작성자</th>
 			<th>작성일</th>
 			<th>조회수</th>
 		</tr>
 	</thead>
 
 	
 	<tbody>
 	
 		<c:forEach var="vo" items="${list}">
 			<tr>
 				<td><c:out value="${vo.NT_NO }"/></td>
 				<td>
 				<a href="/notice/detail?NT_NO=<c:out value="${vo.NT_NO }"/>">
 				<c:out value="${vo.NT_TITLE }"/></a></td>
 				<td><c:out value="${vo.NT_WRITER }"/></td>
 				<td><c:out value="${vo.NT_WRITEDATE }"/></td>
 				<td><c:out value="${vo.NT_HITS }"/></td>
 			</tr>
 		</c:forEach>
 	</tbody>
 </table>
 
 </div>
 	
 	
 	

</body>


</html>