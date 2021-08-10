<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KOSA</title>
</head>
<body>
<form action="./insert" method="post">
<table border="1">

<tr>
			<th>이름</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>생년월일</th>
			<td><input type="text" name="birthDate"></td>
		</tr>	
		<tr>
			<th>전화번호</th>
			<td><input type="text" name="phoneNum"></td>
		</tr>	
		<tr>
			<th>성별</th>
			<td><input type="text" name="gender"></td>
		</tr>	
		<tr>
			<th>로트넘버</th>
			<td><input type="text" name="rotNum"></td>
		</tr>	
		<tr>
			<th>1차 접종</th>
			<td><input type="text" name="firstDose"></td>
		</tr>	
		<tr>
			<th>2차 접종</th>
			<td><input type="text" name="secondDose"></td>
		</tr>	
		<tr>
			<th>&nbsp;</th>
			<td>
				<input type="submit" value="저장">
				<input type="reset" value="취소">
			</td>
		</tr>		
</table>
</form>
</body>
</html>