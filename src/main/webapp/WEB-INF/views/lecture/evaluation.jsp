<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>

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
			
			<!-- jquery plugin -->
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
			<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

			<title>이클립스 개인 페이지</title>
	</head>
	<body>
		
		<div id="wrap">
			<div id="header">
				<%@ include file="/resources/include/header.jsp" %>
			</div>
			<!-- header -->
			<div id="contents">
				<div id="cont-nav">
				<%@ include file="/resources/include/nav.jsp" %>
				</div>		
				<div id="cont-cont">
					<div class="ss-cont">
						<section class="select-container">
							 <form action="http://localhost:8080/eclass/lecture/search" method="post" class="form-inline">
								<select name="Lecture-div" class="form-control1">
									<option  value="전체">전체</option>
									<option  value="전공">전공</option>
									<option  value="교양">교양</option>
									<option  value="기타">기타</option>
								</select>
								<input type="text" name="search" class="form-control2" placeholder="내용을 입력하세요">
								<input type="submit" name="key" class="btn-lec1" value="검색" ></button>							
								<c:url value="/lecture/register" var="url"/><a class="btn-lec2" href="${url}">등록하기</a>							
							</form>
							
						</section>
					</div>
				</div>
				<!-- card -->
				
			
			<c:forEach var="lecture" items="${lecture}" >
				<div class="card">
			
					<div class="card-header">
						<div class="row">
							
							<div class="col-left">강의명: ${lecture.lectureName}&nbsp;</div>
							<div class="col-right">종합:<span style="color:red;"></span></div>
						</div>
							<br>
						<div class="col-leftt"><small>교수: ${lecture.professorName}</small></div>
						<div class="col-leftt" style="margin-left:5px;">작성자: ${lecture.userID} &nbsp;</div>
						<br>
						<hr>
					</div>
					<div class="card-body">
						<h5 class="card-title">
							제목 : ${lecture.evalutionTitle}</small>
						</h5>
						<br>
						<p class="card-text">내용 : ${lecture.evalutionContent}</p>
						<hr>
						<div class="row">
							<div class="col-left">
								강의력<span style="color:red;">${lecture.lecskill}</span>
								난이도<span style="color:red;">${lecture.leclevel}</span>			
							</div>
							<div class="col-text-right">
								<c:url value="/lecture/modify?evalutionID=${lecture.evalutionID}" var="url"/><a href="${url}">수정</a>
								
							</div>
						</div>
					</div>
		    	</div>
		   </c:forEach>
		    </div>	
			<!-- contents -->
			<div id="footer">	
				<%@include file="/resources/include/footer.jsp" %>
			</div>
		</div>
		
		<!-- wrap -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/imgslide.js"></script>
	</body>
</html>