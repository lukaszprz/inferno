<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="page.title.user.create" /></title>
<link rel="stylesheet" href="css/wro.css" />
</head>
<body>
	<div class="container">
		<h1>
			<spring:message code="user.create" />
		</h1>
		<a href="<spring:url value="/user_list.html" />"><spring:message code="user.list" /></a>
		<form method="POST" action="/user_create.html" id="createUserForm">
			<form:errors path="" element="div" cssClass="alert alert-danger" />

			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label path="username" for="username"> <spring:message code="user.username" />
				</label> <input id="username" name="username" type="text" />
				<form:errors path="username" />
			</div>

			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label id="password" for="password"> <spring:message code="user.password" />
				</label> <input id="password" name="password" type="password" />
				<form:errors path="password" />
			</div>
			
			<div class="${status.error ? 'has-error' : ''}">${status.error}</div>

			<div>
				<button id="submitUser" type="submit" class="btn btn-primary">
					<spring:message code="page.button.submit.user" />
				</button>
			</div>
		</form>
	</div>
	<script type="text/javascript" src="js/wro.js"></script>
	<script type="text/javascript">
	jQuery(document).ready(function($) {
		console.log("Skrypt");
		$('#createUserForm').on('submit', function(e) {
			e.preventDefault();
			console.log("submit");
			$.ajax({
				method: "POST",
				url: "/user_create.html",
				data: $("form").serialize(),
				success: function(result) {
					console.log("done");
					
					window.location.href = "/user_create.html";
				}
			});
		});
	});
	</script>
</body>
</html>