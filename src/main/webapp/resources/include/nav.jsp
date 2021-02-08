<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<div class="container">
		<nav id="Nav-Menu">
	  	  <ul>
		 	 <li><a class="menubar" href="${pageContext.request.contextPath}">메인</a></li>
		 	 
		 	 
			 <li><c:url value="/lecture/evaluation" var="url"/><a class="menubar" href="${url}">강의평가</a></li>
			 
			 
			 <li><c:url value="/user/score" var="url"/><a class="menubar" href="${url}">성적확인</a></li>
			 
			 
		 	 <li><c:url value="/user/modify" var="url"/><a class="menubar" href="${url}">회원정보</a></li>
		  </ul>
	    </nav> 
 	</div>