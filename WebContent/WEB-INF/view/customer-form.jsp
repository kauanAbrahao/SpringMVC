<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Customer Form</title>
		<style>
			.error{color:red}
			.error2{color:red}
		</style>
	</head>
	
	<body>
	 <i>fields means required.</i>
		<form:form action="processForm" modelAttribute="customer">
			First name: <form:input path = "firstName"/>
			<br><br>
			
			Last name(*): <form:input path="lastName"/>
			<form:errors path="lastName" cssClass ="error"/>
			
			<br><br>
			Free passes(*): <form:input path="freePasses"/>
			<form:errors path="freePasses" cssClass="error2"/>
			
			<br><br>
			Postal Code: <form:input path="postalCode"/>
			<form:errors path="postalCode" cssClass="error2"/>
			<br><br>
			
				<input type="submit" value="Submit"/>
		</form:form>
	</body>


</html>