<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KOSA</title>
</head>
<body>
<h1>접종자 정보</h1>
<p><a href='<c:url value="/patient/insert"/>'>정보입력</a></p>
<p><a href='<c:url value="/patient/getInfo"/>'>접종자 조회</a></p>
<p><a href='<c:url value="/patient/count"/>'>접종자수 조회</a></p>

<h1>백신정보 현황</h1>
<p><a href='<c:url value="/vaccine/getvacInfo"/>'>백신정보</a></p>
<p><a href='<c:url value="/vaccine/insert"/>'>백신정보입력</a></p>
<p><a href='<c:url value="/vaccine/deletevacInfo"/>'>백신정보 삭제</a></p>
</body>
</html>