<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 쓰기</title>
<%@include file="../include/member_header.jsp" %>
<script>
$(document).ready(function() {
	$("#btnSave").click(function() {
		var title=$("#title").val();
		var content=$("#content").val();
		var writer=$("#writer").val();
		if(title=="") {
			alert("제목을 입력하세요.");
			document.form1.title.focus();
			return;
		}
		if(content=="") {
			alert("내용을 입력하세요.");
			document.form1.content.focus();
			return;
		}
		if(writer=="") {
			alert("이름을 입력하세요.");
			document.form1.writer.focus();
			return;
		}
		document.form1.submit();
	});
});

</script>

</head>
<body>
<%@include file="../include/member_menu.jsp" %>
<h2>게시글 작성</h2>


<form name="form1" method="post" action="${path}/board/insert.do">
	<div> 제목
		<input name="title" id="title" size="80" placeholder="제목을 입력하세요.">	
	</div>
	<br>
	<div> 내용
		<textarea name="content" id="content" rows="4" cols="80" placeholder="내용을 입력하세요."></textarea>
	</div>
	<div> 이름
		<input name="writer" id="writer" placeholder="이름을 입력하세요.">
	</div>
	<br><br>
	<div style="width: 650px; text-align: center;">
		<button type="button" id="btnSave">확인</button>
		<button type="reset">취소</button>
	</div>
</form>


</body>
</html>