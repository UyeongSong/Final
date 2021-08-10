<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KOSAVAC</title>
</head>
<body>
<h1>접종자 정보 조회</h1>
<form action= "./getInfo" method="post">
<table border="1">
<tr>
	<th>ROT number</th>
	<td><input type="text" name="rotNum"/></td>
</tr>
</table>
	<input type="submit" value="조회"/>	
</form>	
</body>
</html>