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
<form action="/notice/modify" method="post" role="form">


<div>
	<label>NT_NO</label>
	<input name='NT_NO' value='<c:out value="${details.NT_NO}" />' readonly="readonly">
 </div>	
 	
 	
 <div>
 	<label>NT_TITLE</label>
 	<input name='NT_TITLE' value='<c:out value="${details.NT_TITLE}" />' >
 </div>	
 	
 <div>
 	<label>NT_CONTENT</label>
 	<input name='NT_CONTENT' value='<c:out value="${details.NT_CONTENT}" />' >
 </div>	


<div>
	<label>NT_WRITER</label>
	<input name='NT_WRITER' value='<c:out value="${details.NT_WRITER}" />' readonly="readonly">
</div>

<button data-oper="modify"
	onclick="location.href='/notice/modify?NT_NO=<c:out value="${details.NT_NO }"/>'">수정</button>
	
<button data-oper="delete">삭제</button>
<button data-oper="list">목록</button>

</form>


<!-- JavaScript에서는 <button>태그의 'data-oper'속성을 이용해 원하는 기능을 동작하도록 처리가 가능함.
	 <form>태그의 모든 버튼은 기본적으로 submit으로 처리하기 때문에 e.preventDefault()로 기본 동작을 막고 마지막에 직접 submit()을 수행함
 -->
<script>
$(document).ready(function(){
	
	var formObj = $("form"); /* form 태그내 role속성을 이용 */
	$('button').on("click", function(e){
		e.preventDefault();
		var operation = $(this).data("oper");
		console.log(operation);
		
		if(operation === 'delete'){
			formObj.attr("action","/notice/delete");
		}else if(operation === 'list'){
			formObj.attr("action", "/notice/list").attr("method","get"); /*클릭한 버튼이 목록인 경우 action속성과 method속성을 변경  */
			formObj.empty(); /* "/notice/list"로의 이동은 아무런 파라미터가 없기 때문에 <form>태그의 모든 내용은 삭제한 상태에서  */
		}
		formObj.submit(); /* submit()을 진행 */
		
		
	});
});


</script>


</body>


</html>

