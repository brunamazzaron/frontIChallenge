<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bananaStyle.css">

<meta charset="ISO-8859-1">
<title>Restaurante Ifood</title>
</head>
<body>
	<nav class="bananaNav">
		<ul>
			<li><a href="cadastrarRestaurante.jsp">Cadastrar Restaurante</a></li>
			<li><a href="listaRestaurante.jsp">Consultar Produto</a></li>
		</ul>
	</nav>
	<main class="bananaMain">
		<form action="" method="post" class="bananaForm">
			<div>
				<label><strong>Busca pela Descriçãoo:</strong></label><input type="text"
					name="descricao">
			</div>
			<br>
			<div>
				<input id="bananaButton" type="submit" name="salvar"
					value="Consultar Produto">
			</div>
		</form>
	</main>
</body>
</html>