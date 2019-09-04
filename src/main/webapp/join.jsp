<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

    <!DOCTYPE html PUBLIC "-//W3C/DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
	<center>
		<h1>회원가입</h1>
		
		
		<hr>
		<form action="join.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="green">아이디</td>
					<td><input type="text" name="id"/></td>
				</tr>
				<tr>
					<td bgcolor="green">패스워드</td>
					<td><input type="password" name="password"/></td>
				</tr>
				<tr>
					<td bgcolor="green">이름</td>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td bgcolor="green">성별</td>
					<td><input type="radio" name="gender" id="male" value="m" checked/>
						<label for="g">남자</label>
						<input type="radio" name="gender" id="female" value="f"/>
						<label for="g">여자</label>
					</td>
				</tr>
				<tr>
					<td bgcolor="green">생년월일</td>
					<td><input type="date" id="day" name="birth"
					   	 min="1900-01-01" max="2020-01-01"  value="2019-01-01"/></td>
				</tr>								
											
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="가입" />
					</td>
				</tr>	
			</table>
		</form>
		<hr>
	</center>
</body>
</html>