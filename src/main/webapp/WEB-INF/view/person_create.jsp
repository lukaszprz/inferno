<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
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
		<a href="<spring:url value="/person_list.html" />"><spring:message code="person.list" /></a>
		<form:form method="POST" action="/person_create.html" modelAttribute="form">
			<form:errors path="" element="div" cssClass="alert alert-danger" />
				<tag:person_form_fields />
			<div>
				<button type="submit" class="btn btn-primary"><spring:message code="page.button.submit.person" /></button>
			</div>
		</form:form>
	</div>
	<script type="text/javascript" src="js/wro.js"/>
</body>
</html>