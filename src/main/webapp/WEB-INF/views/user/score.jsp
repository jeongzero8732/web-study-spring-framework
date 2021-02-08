<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			
			<!-- Base css -->
			<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/normalize.css"> 
			<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css"> 
			
			<!-- page css -->
			<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/index.css">
			<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
			<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
			
			<script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>
			<title>이클립스 개인 페이지</title>
	</head>
	<body>
		<div id="wrap">
			<div id="header">
				<%@ include file="/resources/include/header.jsp" %>
				
			</div>
			<!-- header -->
			<div id="contents-log">
				<div id="cont-nav">
					<div class="container">
						<%@ include file="/resources/include/nav.jsp" %>
					</div>
				</div>
			
				<div id="cont-log" style="text-align:center;">
					<div >
						<div id="chart">
					   
						</div>
					</div>
				</div>
			</div>	
			<!-- contents -->
			<div id="footer">
				<%@include file="/resources/include/footer.jsp" %>
				
			</div>
				<!-- Hidden Layer -->
			<div class="hidden">
					<ul class="hidden">
						<li class="invisible">${student.scoreFF}</li>
						<li class="invisible">${student.scoreFS}</li>
						<li class="invisible">${student.scoreSF}</li>
						<li class="invisible">${student.scoreSS}</li>
						<li class="invisible">${student.scoreTF}</li>
						<li class="invisible">${student.scoreTS}</li>
						<li class="invisible">${student.scoreFFF}</li>
						<li class="invisible">${student.scoreFFS}</li>
				</ul>
			</div>
		</div>
		
	
		<!-- wrap -->
   		
   		<!-- END HTML -->
   		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/score.js"></script>	
	</body>
</html>