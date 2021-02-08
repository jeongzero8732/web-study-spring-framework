<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<title>이클립스 개인 페이지${login.userID}234234</title>
	</head>
	<body>
			${login.userID}
			 <script>
       			    alert("로그인성공!!!");
       			    self.location="http://localhost:8080/eclass";
       	     </script
	</body>
</html>