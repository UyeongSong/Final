<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>백신접종자 관리 페이지</title>
<style type="text/css">
	table{
		border: 1px solid green;
		border-collapse: collapse;
		width: 300px;
	}
	th, td{
		border: 1px solid green;
	}
</style>
</head>
<body>
	<h1>백신접종자 관리 페이지</h1>
	<form action= "./login" method="post">
		<input type="hidden" name="command" value="login">
		<table>
			<tr>
				<th>ID</th>
				<td>
					<input type="text" name="id">
				</td>
			</tr>	
			<tr>
				<th>PASSWORD</th>
				<td>
					<input type="password" name="password">
				</td>
			</tr>	
		</table>

			<tr>
				<th colspan=2></th>
					<input type="submit" value="로그인">
					<!-- 회원가입폼 -->
					<input type="button" value="회원가입" onClick="regiForm()">				
			</tr>	
	</form>
</body>
</html>