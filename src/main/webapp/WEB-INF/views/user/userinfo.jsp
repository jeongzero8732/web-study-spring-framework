<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="my.eclass.Domain.*"%>
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

			<title>이클립스 개인 페이지</title>
	</head>
	<body>
		<div id="wrap">
			<div id="header">
				<%@ include file="/resources/include/header.jsp" %>
				
			</div>
			<!-- header -->
			<div id="contents-sign">
				<div id="cont-nav">
					<%@ include file="/resources/include/nav.jsp" %>
				</div>
				<div id="sign">
		        <br><br>
		        
		        <div style="text-align:center;">
		        	<font size="6" color="gray">회원정보</font>
		        </div>
		        <br><br>
		        
		        <form action="http://localhost:8080/eclass/user/modify" method="post">	
		            <table class="sign-table">
		                <tr>
		                    <td id="title">아이디</td>
		                    <td>
		          
		                        <input type="text" name="userID" maxlength="20" value="${student.userID}" readonly>
		                    </td>
		                </tr>
		                        
		                <tr>
		                    <td id="title">비밀번호</td>
		                    <td>
		                        <input type="password" name="userPasswd" value="${student.userPasswd}"  maxlength="15">
		                    </td>
		                </tr>
		                
		                <tr>
		                </tr>
		                    
		                <tr>
		                    <td id="title">이름</td>
		                    <td>
		                        <input type="text" name="userName" value="${student.userName}"  maxlength="40">
		                    </td>
		                </tr>
		                    
		                <tr>
		                    <td id="title">성별</td>
		                    <td>
		                        <input type="radio" name="userSex" value="남" checked>남
		                        <input type="radio" name="userSex" value="여" checked>여
		                    </td>
		                </tr>
		                    
		                <tr>
		                    <td id="title">생일</td>
		                    <td>
		                        <input type="text" name="userBirth" value="${student.userBirth}" maxlength="6" placeholder="년(6자)" size="6" >		             
		                    </td>
		                </tr>
		                    
		                <tr>
		                    <td id="title">이메일</td>
		                    <td>
		                        <input type="text" name="userEmail"  value="${student.userEmail}" maxlength="30">	                      
		                    </td>
		                </tr>
		                <tr>
		                    <td id="title">주소</td>
		                    <td>
		                        <input type="text" value="${student.userHome}" size="50" name="userHome"/>
		                    </td>
		                </tr>
		            </table>
		            <br>
		             <table class="sign-table2">
		                <tr>
		                    <td id="title">1학년</td>
		                    <td>
		                        <input type="text" name="scoreFF" value="${student.scoreFF}" maxlength="10" placeholder="1학기 총 학점">  
		                        
		                    </td>
		                     <td>
		                        <input type="text" name="scoreFS" value="${student.scoreFS}" maxlength="10" placeholder="2학기 총 학점">  
		                    </td>
		                </tr>
		                        
		                <tr>
		                    <td id="title">2학년</td>
		                    <td>
		                        <input type="text" name="scoreSF" value="${student.scoreSF}" maxlength="15" placeholder="1학기 총 학점">
		                    </td>
		                     <td>
		                        <input type="text" name="scoreSS" value="${student.scoreSS}" maxlength="10" placeholder="2학기 총 학점">  
		                    </td>
		                </tr>
		                
		                <tr>
		                    <td id="title">3학년</td>
		                    <td>
		                        <input type="text" name="scoreTF" value="${student.scoreTF}" maxlength="15" placeholder="1학기 총 학점">
		                    </td>
		                     <td>
		                        <input type="text" name="scoreTS" value="${student.scoreTS}" maxlength="10" placeholder="2학기 총 학점">  
		                    </td>
		                </tr>
		                    
		                <tr>
		                    <td id="title">4학년</td>
		                    <td>
		                        <input type="text" name="scoreFFF" value="${student.scoreFFF}" maxlength="40" placeholder="1학기 총 학점">
		                    </td>
		                     <td>
		                        <input type="text" name="scoreFFS" value="${student.scoreFFS}" maxlength="10" placeholder="2학기 총 학점">  
		                    </td>
		                </tr>
		             </table>
		             <div class="reset_sign" style="text-align:center;">
			           	 <input type="submit" name="key" value="수정"/>
			           	 <a href="${pageContext.request.contextPath}">취소</a>
			           	 <c:url value="/user/delete?userID=${student.userID}" var="url"/><a href="${url}">회원탈퇴</a>
		            </div>
		        </form>
		   		</div>
			</div>
			<!-- contents -->
			<div id="footer">
	     		<%@ include file="/resources/include/footer.jsp" %>
			</div>
		</div>	
		<!-- wrap -->
    	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/imgslide.js"></script>
	</body>
</html>