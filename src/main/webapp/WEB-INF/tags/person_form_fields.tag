<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<spring:bind path="firstName">
	<div class="row form-group ${status.error ? 'has-error' : ''}">
		<div class="col-xs-12 col-sm-6 col-md-2 text-right">
			<form:label path="firstName" for="firstName" cssClass="control-label">
				<spring:message code="form.person.label.firstName" />
			</form:label>
		</div>
		<div class="col-xs-12 col-sm-6 col-md-4">
			<form:input path="firstName" cssErrorClass="form-control has-error" cssClass="form-control" />
		</div>
		<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
			<form:errors path="firstName" element="i" />
		</div>
	</div>
</spring:bind>
<spring:bind path="lastName">
	<div class="row form-group ${status.error ? 'has-error' : ''}">
		<form:label path="lastName" for="lastName" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
			<spring:message code="form.person.label.lastName" />
		</form:label>
		<div class="col-xs-12 col-sm-6 col-md-4">
			<form:input path="lastName" cssClass="form-control" />
		</div>
		<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
			<form:errors path="lastName" element="i" />
		</div>
	</div>
</spring:bind>
<spring:bind path="pesel">
	<div class="row form-group ${status.error ? 'has-error' : ''}">
		<form:label path="pesel" for="pesel" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
			<spring:message code="form.address.label.pesel" />
		</form:label>
		<div class="col-xs-12 col-sm-6 col-md-4">
			<form:input path="pesel" cssClass="form-control" />
		</div>
		<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
			<form:errors path="pesel" element="i" />
		</div>
	</div>
</spring:bind>
<spring:bind path="address.street">
	<div class="row form-group ${status.error ? 'has-error' : ''}">
		<form:label path="address.street" for="address.street" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
			<spring:message code="form.address.label.street" />
		</form:label>
		<div class="col-xs-12 col-sm-6 col-md-4">
			<form:input path="address.street" cssClass="form-control" />
		</div>
		<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
			<form:errors path="address.street" element="i" />
		</div>
	</div>
</spring:bind>
<spring:bind path="address.buildingNumber">
	<div class="row form-group ${status.error ? 'has-error' : ''}">
		<form:label path="address.buildingNumber" for="address.buildingNumber" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
			<spring:message code="form.address.label.buildingNumber" />
		</form:label>
		<div class="col-xs-12 col-sm-6 col-md-4">
			<form:input path="address.buildingNumber" cssClass="form-control" />
		</div>
		<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
			<form:errors path="address.buildingNumber" element="i" />
		</div>
	</div>
</spring:bind>
<spring:bind path="address.flatNumber">
	<div class="row form-group ${status.error ? 'has-error' : ''}">
		<form:label path="address.flatNumber" for="address.flatNumber" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
			<spring:message code="form.address.label.flatNumber" />
		</form:label>
		<div class="col-xs-12 col-sm-6 col-md-4">
			<form:input path="address.flatNumber" cssClass="form-control" />
		</div>
		<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
			<form:errors path="address.flatNumber" element="i" delimiter="<li>" />
		</div>
	</div>
</spring:bind>
<spring:bind path="address.city">
	<div class="row form-group ${status.error ? 'has-error' : ''}">
		<form:label path="address.city" for="address.city" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
			<spring:message code="form.address.label.city" />
		</form:label>
		<div class="col-xs-12 col-sm-6 col-md-4">
			<form:input path="address.city" cssClass="form-control" />
		</div>
		<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
			<form:errors path="address.city" element="i" />
		</div>
	</div>
</spring:bind>
<spring:bind path="address.postCode">
	<div class="row form-group ${status.error ? 'has-error' : ''}">
		<form:label path="address.postCode" for="address.postCode" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
			<spring:message code="form.address.label.postCode" />
		</form:label>
		<div class="col-xs-12 col-sm-6 col-md-4">
			<form:input path="address.postCode" cssClass="form-control" />
		</div>
		<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
			<form:errors path="address.postCode" element="i" />
		</div>
	</div>
</spring:bind>
<spring:bind path="address.district">
	<div class="row form-group ${status.error ? 'has-error' : ''}">
		<form:label path="address.district" for="address.district" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
			<spring:message code="form.address.label.district" />
		</form:label>
		<div class="col-xs-12 col-sm-6 col-md-4">
			<form:input path="address.district" cssClass="form-control" />
		</div>
		<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
			<form:errors path="address.district" element="i" />
		</div>
	</div>
</spring:bind>

<div class="row">
	<spring:bind path="otherCorrespondenceAddress">
		<div class="form-group">
			<form:label path="otherCorrespondenceAddress" for="otherCorrespondenceAddress">
				<spring:message code="form.address.label.different" />
			</form:label>
			<form:checkbox path="otherCorrespondenceAddress" />
		</div>
	</spring:bind>
</div>
<div id="correspondenceAddressSection">
	<p class="text-primary">
		<spring:message code="form.correspondence.address.label" />
	</p>

	<spring:bind path="correspondenceAddress.street">
		<div class="row form-group ${status.error ? 'has-error' : ''}">
			<form:label path="correspondenceAddress.street" for="correspondenceAddress.street" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label" >
				<spring:message code="form.address.label.street" />
			</form:label>
			<div class="col-xs-12 col-sm-6 col-md-4">
				<form:input path="correspondenceAddress.street" cssClass="form-control" />
			</div>
			<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
				<form:errors path="correspondenceAddress.street" element="i" />
			</div>
		</div>
	</spring:bind>
	<spring:bind path="correspondenceAddress.buildingNumber">
		<div class="row form-group ${status.error ? 'has-error' : ''}">
			<form:label path="correspondenceAddress.buildingNumber" for="correspondenceAddress.buildingNumber" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
				<spring:message code="form.address.label.buildingNumber" />
			</form:label>
			<div class="col-xs-12 col-sm-6 col-md-4">
				<form:input path="correspondenceAddress.buildingNumber" cssClass="form-control" />
			</div>
			<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
				<form:errors path="correspondenceAddress.buildingNumber" element="i" />
			</div>
		</div>
	</spring:bind>
	<spring:bind path="correspondenceAddress.flatNumber">
		<div class="row form-group ${status.error ? 'has-error' : ''}">
			<form:label path="correspondenceAddress.flatNumber" for="correspondenceAddress.flatNumber" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
				<spring:message code="form.address.label.flatNumber" />
			</form:label>
			<div class="col-xs-12 col-sm-6 col-md-4">
				<form:input path="correspondenceAddress.flatNumber" cssClass="form-control" />
			</div>
			<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
				<form:errors path="correspondenceAddress.flatNumber" element="i" />
			</div>
		</div>
	</spring:bind>
	<spring:bind path="correspondenceAddress.city">
		<div class="row form-group ${status.error ? 'has-error' : ''}">
			<form:label path="correspondenceAddress.city" for="correspondenceAddress.city" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
				<spring:message code="form.address.label.city" />
			</form:label>
			<div class="col-xs-12 col-sm-6 col-md-4">
				<form:input path="correspondenceAddress.city" cssClass="form-control" />
			</div>
			<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
				<form:errors path="correspondenceAddress.city" element="i" />
			</div>
		</div>
	</spring:bind>
	<spring:bind path="correspondenceAddress.postCode">
		<div class="row form-group ${status.error ? 'has-error' : ''}">
			<form:label path="correspondenceAddress.postCode" for="correspondenceAddress.postCode" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
				<spring:message code="form.address.label.postCode" />
			</form:label>
			<div class="col-xs-12 col-sm-6 col-md-4">
				<form:input path="correspondenceAddress.postCode" cssClass="form-control" />
			</div>
			<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
				<form:errors path="correspondenceAddress.postCode" element="i" />
			</div>
		</div>
	</spring:bind>
	<spring:bind path="correspondenceAddress.district">
		<div class="row form-group ${status.error ? 'has-error' : ''}">
			<form:label path="correspondenceAddress.district" for="correspondenceAddress.district" cssClass="col-xs-12 col-sm-6 col-md-2 text-right control-label">
				<spring:message code="form.address.label.district" />
			</form:label>
			<div class="col-xs-12 col-sm-6 col-md-4">
				<form:input path="correspondenceAddress.district" cssClass="form-control" />
			</div>
			<div class="col-xs-12 col-sm-6 col-md-6 help-block small">
				<form:errors path="correspondenceAddress.district" element="i" />
			</div>
		</div>
	</spring:bind>
</div>

