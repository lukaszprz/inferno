<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="page.title.person.list" /></title>
<link rel="stylesheet" href="css/wro.css" />
</head>
<body>
	<div class="container">
		<h1>
			<spring:message code="person.list" />
		</h1>
		<ul>
			<%--@elvariable id="persons" type="java.util.List"--%>
			<c:forEach items="${persons}" var="person">
				<li><c:out value="${person.getId()}" /></li>
			</c:forEach>
		</ul>

		<a href="<spring:url value="/person_create.html" />"><spring:message code="person.create" /></a>
	</div>

	<script type="text/javascript" src="js/wro.js" />
</body>
</html>