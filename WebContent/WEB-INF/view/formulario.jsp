<!DOCTYPE HTML>

<html>
	<head>
		<title> FORMUL�RIO DE ALUNO! </title>
		
		<link rel="stylesheet" type="text/css"
			href = "${pageContext.request.contextPath}/resources/css/styleTest.css">
	</head>

	<body>
	
	<!-- Esse � para o formul�rio normal -->
		<form action="formularioProcessado" method="GET">
		
			<input type = "text" name="nomeEstudante"
				placeholder="Digite seu nome" />
				
				<input type="submit"/>
		</form>
				
	<!-- Esse � para o formul�rio do @RequestMapping("/formularioLendoModel") 
	<div>
		<form action="formularioLendoModel" method="GET">
		
			<input type = "text" name="nomeEstudante"
				placeholder="Digite seu nome model" />
				
				<input type="submit"/>
				
		</form>
	</div>
	-->
	
		<!-- Esse � para o formul�rio do @RequestMapping("/formularioRequestParam") com @RequestParam -->
	<div>
		<form action="formularioRequestParam" method="GET">
		
			<input type = "text" name="nomeEstudante"
				placeholder="Digite seu nome model" />
				
				<input type="submit"/>
				
		</form>
	</div>
	
	</body>


</html>