<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <!DOCTYPE html PUBLIC "-//W3C/DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
</head>
<body>
	<center>
		<h1>로그인</h1>
		<hr>
		<form action="login.do" metiod="post">
			<table border="1" cellpaddiong="0" cellspacing="0">
				<tr>
					<td bgcolor="green">아이디</td>
					<td><input type="text" name="id" value="${user.id }" /></td>
				</tr>
				<tr>
					<td bgcolor="green">비밀번호</td>
					<td><input type="password" name="password" value="${user.password }"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="로그인" /></td>
				</tr>
			</table>
		</form>
		<hr>
	</center>
</body>
</html>