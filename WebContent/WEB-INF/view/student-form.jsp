<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
	<title>Student Form!</title>
</head>

<body>

	<form:form action = "processForm" modelAttribute="student">
	First name: <form:input path = "firstName"/>
	<br>
	
	Last name: <form:input path = "lastName"/>
	<br>
	
	Country: 
	<form:select path = "country">
		<form:options items = "${student.countryOptions}"/>
	</form:select>	
	<br><br>
	
	Favorite Programming Language:
	<form:radiobuttons path="favoriteLanguage" items = "${student.languageOptions}" />
	<br><br>
	
	Operating System:
	
	Linux<form:checkbox path="operatingSystem" value = "Linux"/>
	Windows<form:checkbox path="operatingSystem" value = "Windows"/>
	MacOS<form:checkbox path="operatingSystem" value = "MacOS"/>
	
	<input type = "submit" value = "Submit"/>
	
	</form:form>
</body>

</html>