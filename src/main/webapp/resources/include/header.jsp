<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<div class="container">
		<div class="quick-menu">
			<c:if test="${user!=null}">
				<a>${user.userID}님</a>
				<c:url value="/user/logout" var="url"/><a href="${url}">로그아웃</a>				
			</c:if>		
			<c:if test="${user==null}">
				<c:url value="/user/login" var="url"/><a href="${url}">로그인</a>
			</c:if>
			<a href="http://www.kpu.ac.kr/index.do?sso=ok" target="_blank">학교홈페이지가기</a>
		</div>
		<div class="title">
			<p>이클래스 개인 페이지</p>
			<h1><a href="http://www.kpu.ac.kr/index.do?sso=ok" target="_blank">www.kpu.ac.kr</a></h1>
		</div>
	</div>