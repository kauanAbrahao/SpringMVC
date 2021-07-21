<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
</head>

<body>
	<form:form action="processAluno" modelAttribute="aluno">
	
		First name: <form:input path="primeiroNome" /> <!-- Isso serve como getFirstname() e setFirstname() -->
		<br>
		Last name: <form:input path="segundoNome" />
		<br>
		<!-- Ao invés de HardCode, podemos usar uma HashMap
		Country: <form:select path="pais">
					<form:option value="Brasil" label="BRA" />
					<form:option value="Argentina" label="ARG" />
					<form:option value="Uruguai" label="URU" />
				</form:select>
		VEJA ABAIXO: -->
		<form:select path="pais">
			<form:options items="${paises}"/>
		</form:select>
		
		<!--  Outra forma ainda é usar um .properties. Veja countries.properties -->
			
		<input type="submit" value="Submit"/>
		
	</form:form>

</body>
</html>