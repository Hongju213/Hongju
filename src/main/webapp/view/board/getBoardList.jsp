<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
		 "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<title>게시판</title>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script src ="getBoardList.js"></script>
	</head>
	<body>
	<center>
		<h1>게시판</h1>
		<h3>${userName }님 환영합니다.<a href="logout.do">Log-out</a>
		</h3>

		
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="white" width="100">번호</th>
				<th bgcolor="white" width="200">제목</th>
				<th bgcolor="white" width="150">작성자</th>
				<th bgcolor="white" width="150">등록일</th>
				<th bgcolor="white" width="100">조회수</th>
			</tr>
			
			<c:forEach items="${boardList }" var="board">
			<tr>
				<td>${board.seq }</td>
				<td align="left"><a href="getBoard.do?seq=${board.seq }">${board.title }</a></td>
				<td>${board.writer }</td>
				<td>${board.regDate }</td>
				<td>${board.cnt }</td>
			</tr>
			</c:forEach>
		</table>
		
		<!-- 검색 시작 -->
		
		<form action="getBoardList.do" method="post">
			<br>
				<center>
					<select name="searchCondition">
					<c:forEach items="${conditionMap }" var="option">
						<option value="${option.value }">${option.key }
					</c:forEach>	
					</select> 
				<input name="searchKeyword" type="text" /> 
				<input type="submit" value="검색" />
				</center>
			
		</form>
		<!-- 검색 종료 -->
		
		
		<br> 
			<input type="button" value="새글 등록" onClick="location.href='/insertBoard.jsp'">
			 
	</center>
</body>
</html>