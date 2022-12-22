<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
      <!--구글링해서 블로그에서 찾았는데 이 링크는 어디서 받아오는지 물어보기  -->
   

</head>
<body>
<div>
<a href="/account/login">로그아웃</a>
</div>
<div>
<a href="/notice/register">글쓰기</a>
</div>

<div>
	<label>NT_NO</label>
	<input name='NT_NO' value='<c:out value="${details.NT_NO}" />' readonly="readonly">
 </div>	
 	
 	
 <div>
 	<label>NT_TITLE</label>
 	<input name='NT_TITLE' value='<c:out value="${details.NT_TITLE}" />' readonly="readonly">
 </div>	
 	
 <div>
 	<label>NT_CONTENT</label>
 	<input name='NT_CONTENT' value='<c:out value="${details.NT_CONTENT}" />' readonly="readonly">
 </div>	


<div>
	<label>NT_WRITER</label>
	<input name='NT_WRITER' value='<c:out value="${details.NT_WRITER}" />' readonly="readonly">
</div>

<button data-oper="modify"
	<%-- onclick="location.href='/notice/modify?NT_NO=<c:out value="${details.NT_NO }"/>'" --%>
	>수정</button>
<button data-oper="list">목록</button>

<!-- 공지사항 상세페이지에서는 수정과 삭제가 필요한 페이지로 링크를 처리해야 하는데 
다양한 상황을 처리하기 위해 <form>태그를 이용해서 수정링크로 갔음 -->

 <form id='operForm' action="/notice/modify" method="get">
	<input type="hidden" id="NT_NO" name="NT_NO" value='<c:out value="${details.NT_NO }"/>'>
</form>


<script>
$(document).ready(function(){
var operForm = $("#operForm");

	$("button[data-oper='modify']").on("click", function(e){
	operForm.attr("action", "/notice/modify").submit();
	
	});
	
$("button[data-oper='list']").on("click", function(e){
	operForm.find("#NT_NO").remove();
	operForm.attr("action", "/notice/list")
	operForm.submit();
});	
	});
	
	/* 수정버튼을 누르는 경우에는 NT_NO값을 같이 전달하고 <form>태그를 submit시켜서 처리함.
	목록으로 이동하는 경우에는 아무런 데이터도 필요치 않아 <form>태그 내의 NT_NO를 지우고 submit을 통해서 리스트 페이지로 이동*/
</script>


</body>


</html>