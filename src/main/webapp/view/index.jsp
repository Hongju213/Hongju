<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <!DOCTYPE html PUBLIC "-//W3C/DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src ="index.js"></script>

	
</head>
<body>
	<center>
		<h1>로그인</h1>
		
		<hr>

		<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td> <label for ="id">아이디</label></td>
			<td> <input type ="text" id="id" name="id"></td>
		</tr>
		<tr>	
			<td> <label for ="pw">비밀번호</label></td>
			<td> <input type ="password" id="pw" name="pw"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="button" id="btnLogin" value="로그인">
			<input type="button" id="btnJoin" value="회원가입">
			</td>
		</tr>
		</table>

		<hr>
	</center>
</body>
</html>