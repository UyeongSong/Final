<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>접종자 정보 삭제</h1>
${patient.name}님의 정보를 삭제합니다.<p>
삭제 후 데이터는 복구될 수 없습니다.<p>
${patient.name}님의 전화번호를 입력하세요. <p>
<form action="./delete" method="post">
전화번호: <input type="text" name="phoneNum">
<input type="hidden" name="rotNum" value="${patient.rotNum}">
<input type="submit" value="삭제">
</form>
</body>
</html>