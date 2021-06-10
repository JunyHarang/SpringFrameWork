<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- jstl -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 폼테그를 쓰기위한 라이브러리 -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		.err{color: red; font-size: 9pt ; font-weight: bold ;}
	</style>
</head>
<body>
	<h2>회원 가입 하기</h2>

	<c:set var="apppath" value="<%=request.getContextPath()%>" />
	<!-- form:form 사용할때는 jsp 표현식이 적용이 안됨 ${apppath} 대신 request.getContextPath() 사용이 안됨-->
	<form:form commandName="human" action="${apppath}/mycaller.hm" method="post">
		<table border="1">
			<tr>
				<td>아아디</td>
				<td>
					<!-- path : 파라미터이름(name), 필수입력사항 -->
					<form:input path="id"/>
					<form:errors path="id" cssClass="err"></form:errors>
					<!-- <input type="text" id="id" name="id"> -->
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>
					<form:input path="name"/>
					<form:errors path="name" cssClass="err"></form:errors>
					<!-- <input type="text" id="name" name="name"> -->
				</td>
			</tr>
			<tr>
				<td>취미</td>
				<td>
					<form:radiobuttons path="hobby" items="${hobbies}"
						itemLabel="korean" itemValue="english"/>
					<form:errors path="hobby" cssClass="err"></form:errors>
					<!-- <input type="radio" id="hobby1" name="hobby" value="독서">독서
					<input type="radio" id="hobby2" name="hobby" value="야구">야구 -->
				</td>
			</tr>
			<tr>
				<td>특기</td>
				<td>
					<form:checkboxes items="${specialist}" path="special"/>
					<form:errors path="special" cssClass="err"></form:errors>
					<!-- <input type="checkbox" id="special" name="special"value="마라톤">마라톤 
					<input type="checkbox" id="special" name="special" value="아랍어">아랍어 -->
				</td>
			</tr>
			<tr>
				<td>생일</td>
				<td>
					<form:input path="birth"/>
					<form:errors path="birth" cssClass="err"></form:errors>
					<!-- <input type="text" id="birth" name="birth"> -->
				</td>
			</tr>
			<tr>
				<td>직업</td>
				<td>
					<%-- 모두 글자로 보여주고자 하면 itemLabel=name, itemValue=name 두개 같은걸적어도된다. --%>
					<form:select path="job" items="${joblists}"
						itemLabel="name" itemValue="code"/>
					<form:errors path="job" cssClass="err"></form:errors>
					<!-- <select id="job" name="job">
							<option value="학생">학생
							<option value="강사">강사
							<option value="직원">직원
					</select></td> -->
			</tr>
			<tr>
				<td>가입일자</td>
				<td>
					<form:input path="regdate"/>
					<form:errors path="regdate" cssClass="err"></form:errors>
					<!-- <input type="text" id="regdate" name="regdate"> -->
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="가입하기"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>