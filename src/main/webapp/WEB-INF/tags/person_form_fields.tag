<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<spring:bind path="firstName">
	<div class="form-group ${status.error ? 'has-error' : ''}">
		<form:label path="firstName" for="firstName">
			<spring:message code="person.firstName" />
		</form:label>
		<form:input path="firstName" />
		<form:errors path="firstName" />
	</div>
</spring:bind>
<spring:bind path="lastName">
	<div class="form-group ${status.error ? 'has-error' : ''}">
		<form:label path="lastName" for="lastName">
			<spring:message code="person.lastName" />
		</form:label>
		<form:input path="lastName" />
		<form:errors path="lastName" />
	</div>
</spring:bind>
<spring:bind path="street">
	<div class="form-group ${status.error ? 'has-error' : ''}">
		<form:label path="street" for="street">
			<spring:message code="person.street" />
		</form:label>
		<form:input path="street" />
		<form:errors path="street" />
	</div>
</spring:bind>
<spring:bind path="buildingNumber">
	<div class="form-group ${status.error ? 'has-error' : ''}">
		<form:label path="buildingNumber" for="buildingNumber">
			<spring:message code="person.buildingNumber" />
		</form:label>
		<form:input path="buildingNumber" />
		<form:errors path="buildingNumber" />
	</div>
</spring:bind>
<spring:bind path="flatNumber">
	<div class="form-group ${status.error ? 'has-error' : ''}">
		<form:label path="flatNumber" for="flatNumber">
			<spring:message code="person.flatNumber" />
		</form:label>
		<form:input path="flatNumber" />
		<form:errors path="flatNumber" />
	</div>
</spring:bind>
<spring:bind path="city">
	<div class="form-group ${status.error ? 'has-error' : ''}">
		<form:label path="city" for="city">
			<spring:message code="person.city" />
		</form:label>
		<form:input path="city" />
		<form:errors path="city" />
	</div>
</spring:bind>
<spring:bind path="postCode">
	<div class="form-group ${status.error ? 'has-error' : ''}">
		<form:label path="postCode" for="postCode">
			<spring:message code="person.postCode" />
		</form:label>
		<form:input path="postCode" />
		<form:errors path="postCode" />
	</div>
</spring:bind>
<spring:bind path="district">
	<div class="form-group ${status.error ? 'has-error' : ''}">
		<form:label path="district" for="district">
			<spring:message code="person.district" />
		</form:label>
		<form:input path="district" />
		<form:errors path="district" />
	</div>
</spring:bind>