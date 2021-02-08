<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
				
			<!-- Base css -->
			<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/index.css">
			<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css"> 
			
			<!-- page css -->
			<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/normalize.css">
			<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
			
			<!-- jquery plugin -->
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
			<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

			<title>이클립스 개인 페이지</title>
	</head>
	<body>

		<div id="wrap">
			<div id="header">
				<%@ include file="../../resources/include/header.jsp" %>
			</div>
			<!-- header -->
			<div id="contents">
				<div id="cont-nav">
					<%@ include file="../../resources/include/nav.jsp" %>
				</div>
				<div id="cont-tit">
					<div class="container">
						<ul class="slider"> 
							<li><a href="https://news.naver.com/main/read.nhn?mode=LSD&mid=sec&sid1=102&oid=025&aid=0002859889" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/1.png" /></a></li>
							<li><a href="http://news.unn.net/news/articleView.html?idxno=190871" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/2.png" /></a></li>
							<li><a href="https://news.naver.com/main/read.nhn?mode=LSD&mid=sec&sid1=101&oid=015&aid=0003962104" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/3.png" /></a></li>
							<li><a href="https://www.msn.com/ko-kr/news/national/%ED%95%9C%EA%B5%AD%EC%82%B0%EA%B8%B0%EB%8C%80-%ED%8A%B9%ED%99%94%ED%98%95-%EC%B0%BD%EC%97%85%EC%84%A0%EB%8F%84%EB%8C%80%ED%95%99-%EC%84%A0%EC%A0%95%E2%80%A63%EB%85%84%EA%B0%84-15%EC%96%B5-%EC%A7%80%EC%9B%90/ar-AAy2LTd" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/4.png" /></a></li>
							<li><a href="http://news.kbs.co.kr/news/view.do?ncd=4034085&ref=A" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/5.png" /></a></li>
						</ul>

					</div>
				</div>
				<div id="cont-cont">
					<div class="container">
						<div class="cont">
							<div class="box box1">
								<a href="http://www.kpu.ac.kr/download_file/BK21plus.pdf" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/6.png" /></a>
							</div>
							<div class="box box2">
								<a href="https://startup.kpu.ac.kr/info/view/notice?seq_no=2201" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/7.png"/></a>
							</div>
							<div class="box box3">
								<a href="http://www.ygoon.com/mall/signUp/uniStepOne?affiliateId=524" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/8.png" /></a>
							</div>
							<div class="box box4">
								<a href="http://www.kpu.ac.kr/counseling/index.do" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/9.png" /></a>
							</div>
							<div class="box box5">
								<a href="http://edu.labs.go.kr/MainHome.do?cmd=indexMain" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/10.png" /></a>
							</div>
							<div class="box box6">
								<a href="http://www.academyinfo.go.kr/UIPISA/uipnh/unt/ipsrch/UntUnvAcdtSrchPupExtrn.do?schlId=0000247" target="_blank"><img src="${pageContext.request.contextPath}/resources/img/11.png" /></a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- contents -->
			<div id="footer">	
				<%@include file="../../resources/include/footer.jsp" %>
			</div>
		</div>
		<!-- wrap -->
    	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/imgslide.js"></script>
	</body>
</html>