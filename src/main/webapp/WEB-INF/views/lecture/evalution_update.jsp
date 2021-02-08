<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
		        	<font size="6" color="gray">강의평가 수정</font>
		        </div>
		        <br><br>
		        <form action="http://localhost:8080/eclass/lecture/modify" method="post" name="eval_update" >
		            <table class="sign-table">
		                <tr>
		                    <td id="title">강의명</td>
		                    <td><input type="text" name=lectureName maxlength="20" value="${eval.lectureName}" required/></td>
		                    <td id="title">교수명</td>
		                    <td><input type="text" name="professorName" maxlength="20" value="${eval.professorName}" required/></td>
		                </tr>
		                        
		                <tr>
		                    <td id="title">수강연도</td>
		                    <td><input type="text" name="lectureYear" maxlength="15" value="${eval.lectureYear }"/></td>
		                    <td id="title">수강학기</td>
		                    <td><input type="text" name="semester" maxlength="40" value="${eval.semester}"/></td>
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
		             		<td><input type="text" size="54.5" name="evalutionTitle" value="${eval.evalutionTitle}"/ required></td>
		             	</tr>
		                <tr>
		                    <td id="title">내용<input type="hidden" name=userID value="${eval.userID}" required>
		                      <input type="hidden" name=evalutionID value="${eval.evalutionID}">
		                    
		                     </td>

		                    <td>
		                        <textarea name="evalutionContent" value="${eval.evalutionContent}" maxlength="2048" style="height:180px;width:430px;"></textarea>
		                    </td>
		                </tr>
		             </table>
		             <div class="reset_sign" style="text-align:center;">
			           	 <input type="submit" name="key" value="수정" />	
			           
			           	 <c:url value="/lecture/delete?evalutionID=${eval.evalutionID}&userID=${eval.userID}" var="url"/><a href="${url}">삭제</a>	        
			           	 <a href="http://localhost:8080/eclass/lecture/evaluation">취소</a>
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