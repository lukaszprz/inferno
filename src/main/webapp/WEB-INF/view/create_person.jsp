<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="page.title.person.create" /></title>
<link rel="stylesheet" href="css/wro.css" />
</head>
<body>
	<div class="container">
		<h1>
			<spring:message code="person.create" />
		</h1>
		<a href="<spring:url value="/user_list.html" />"><spring:message code="person.list" /></a>
		<form:form method="POST" action="/person_create.html" modelAttribute="form">
			<form:errors path="" element="div" cssClass="alert alert-danger" />
			<div class="form-group">
				<form:label path="firstName" for="firstName"><spring:message code="person.firstName" /></form:label>
				<form:input path="firstName"/>
				<form:errors path="firstName" />
			</div>
			<div class="form-group">
				<form:label path="lastName" for="lastName"><spring:message code="person.lastName" /></form:label>
				<form:input path="lastName"/>
				<form:errors path="lastName" />
			</div>
			<div class="form-group">
				<form:label path="street" for="street"><spring:message code="person.street" /></form:label>
				<form:input path="street"/>
				<form:errors path="street" />
			</div>
			<div class="form-group">
				<form:label path="buildingNumber" for="buildingNumber"><spring:message code="person.buildingNumber" /></form:label>
				<form:input path="buildingNumber"/>
				<form:errors path="buildingNumber" />
			</div>
			<div class="form-group">
				<form:label path="flatNumber" for="flatNumber"><spring:message code="person.flatNumber" /></form:label>
				<form:input path="flatNumber"/>
				<form:errors path="flatNumber" />
			</div>
			<div class="form-group">
				<form:label path="city" for="city"><spring:message code="person.city" /></form:label>
				<form:input path="city"/>
				<form:errors path="city" />
			</div>
			<div class="form-group">
				<form:label path="postCode" for="postCode"><spring:message code="person.postCode" /></form:label>
				<form:input path="postCode"/>
				<form:errors path="postCode" />
			</div>
			<div class="form-group">
				<form:label path="district" for="district"><spring:message code="person.district" /></form:label>
				<form:input path="district"/>
				<form:errors path="district" />
			</div>
			<div>
				<button type="submit" class="btn btn-primary"><spring:message code="page.button.submit.person" /></button>
			</div>
		</form:form>
	</div>
	<script type="text/javascript" src="js/wro.js"/>
</body>
</html>