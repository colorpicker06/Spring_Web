<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
<%@include file="../include/member_header.jsp" %>
</head>
<style>
body{
text-align:center;
}
</style>
<body>
<%@include file="../include/member_menu.jsp" %>
<h2>회원 가입</h2>
<body>

<form name="form1" method="post" action="${path}/member/insert.do">
<table border="1" width="400px">

	<tr>
	<td>아이디</td>
	<td><input name="userId"></td>
	</tr>
	
	<tr>
	<td>비밀번호</td>
	<td><input type="password" name="userPw"></td>
	</tr>
	
	<tr>
	<td>이름</td>
	<td><input name="userName"></td>
	</tr>
	
	<tr>
	<td>이메일주소</td>
	<td><input name="userEmail"></td>
	</tr>
	
	<tr>
	<td colspan="2"><input type="submit" value="확인"><input type="reset" value="취소"></td>
	</tr>

	

</table>

</form>

</body>
</html>