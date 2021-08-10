<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>KOSAVAC</title>
</head>
	<body>
			<table border="1">
		<tr>
			<th>이름</th>
			<td>${patient.name}</td>
		</tr>
		<tr>
			<th>생년월일</th>
			<td>${patient.birthDate}</td>
		</tr>	
		<tr>
			<th>전화번호</th>
			<td>${patient.phoneNum}</td>
		</tr>	
		<tr>
			<th>성별</th>
			<td>${patient.gender}</td>
		</tr>	
		<tr>
			<th>로트넘버</th>
			<td>${patient.rotNum}</td>
		</tr>	
		<tr>
			<th>1차 접종</th>
			<td>${patient.firstDose}</td>
		</tr>	
		<tr>
			<th>2차 접종</th>
			<td>${patient.secondDose}</td>
		</tr>	
	</table>
	<a href="./update?rotNum=${patient.rotNum}">수정하기</a>
	<a href="./delete?rotNum=${patient.rotNum}">삭제하기</a>
</body>
</html>