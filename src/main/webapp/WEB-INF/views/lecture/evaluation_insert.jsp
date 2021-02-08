<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib tagdir="/WEB-INF/tags/" prefix="evaltag" %>
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
		        	<font size="6" color="gray">강의평가 등록</font>
		        </div>
		        <br><br>
		        <form action="http://localhost:8080/eclass/lecture/register" method="post">
		            <table class="sign-table">
		                <tr>
		                    <td id="title">강의명</td>
		                    <td><input type="text" name="lectureName" maxlength="20" required></td>
		                    <td id="title">교수명</td>
		                    <td><input type="text" name="professorName" maxlength="20" required></td>
		                </tr>
		                        
		                <tr>
		                    <td id="title">수강연도</td>
		                    <td><input type="text" name="lectureYear" maxlength="15"></td>
		                    <td id="title">수강학기</td>
		                    <td><input type="text" name="semester" maxlength="40"></td>
		                </tr>
		           
		                    
		                <tr>
		                    <td id="title">강의구분</td>
		                    <td>
		                         <select name="lecture_kinds">
		                            <option>전공</option>
		                            <option>교양</option>
		                            <option>기타</option>                    
		                        </select>
		                    </td>
		                    <td id="title">강의력</td>
		                    <td>
		                    	 <select name="lecskill">
		                            <option>A</option>
		                            <option>B</option>
		                            <option>C</option>
		                            <option>D</option>                        
		                        </select>
		                    </td>
		                </tr>
		                    
		                <tr>
		                    <td id="title">난이도</td>
		                    <td>
		                        <select name="leclevel">
		                            <option>A</option>
		                            <option>B</option>
		                            <option>C</option>
		                            <option>D</option>                        
		                        </select>
		                    </td>
		                     <td id="title">종합</td>
		                    <td>
		                       <select name="totalScore">
		                            <option>A</option>
		                            <option>B</option>
		                            <option>C</option>
		                            <option>D</option>                        
		                        </select>		                
		                    </td>
		                </tr>		 		               
		            </table>
		            <br>
		             <table class="sign-table3">
		             	<tr>
		             		<td id="title">제목</td>
		             		<td><input type="text" size="54.5" name="evalutionTitle"/ required></td>
		             	</tr>
		                <tr>
		                    <td id="title">내용</td>
		                   
		                    <td>
		                        <textarea name="evalutionContent" maxlength="2048" style="height:180px;width:430px;" required></textarea>
		                    </td>
		                </tr>
		             </table>
		             <div class="reset_sign" style="text-align:center;">
			           	 <input type="submit" name="key" value="등록" />			        
			           	 <a href="${pageContext.request.contextPath}/lecture/evaluation">취소</a>
		            </div>
		        </form>
		   		</div>
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