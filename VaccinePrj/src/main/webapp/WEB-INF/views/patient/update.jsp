<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>정보 수정</h1>
<form action="./update" method="post">
<table border="1">
<tr>
	<th>이름</th>
	<td><input type= "text" name="name" value="${patient.name}"></td>
</tr>

<tr>
	<th>생년월일</th>
	<td><input type= "text" name="birthDate" value="${patient.birthDate}"></td>
</tr>

<tr>
	<th>전화번호</th>
	<td><input type= "text" name="phoneNum" value="${patient.phoneNum}"></td>
</tr>

<tr>
	<th>성별</th>
	<td><input type= "text" name="gender" value="${patient.gender}"></td>
</tr>

<tr>
	<th>로트넘버</th>
	<td><input type= "text" name="rotNum" value="${patient.rotNum}" readonly></td>
</tr>

<tr>
	<th>1차 접종</th>
	<td><input type= "text" name="firstDose" value="${patient.firstDose}"></td>
</tr>

<tr>
	<th>2차 접종</th>
	<td><input type= "text" name="secondDose" value="${patient.secondDose}"></td>
</tr>
<tr>
<td></td>
<td>
<input type="submit" value=" 수정 "><input type="reset" value=" 취소 ">
</td>
</table>
</form>
</body>
</html>