<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Formulário</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0 maximum-scale=1.0">
   	<link href='https://cdn.jsdelivr.net/npm/boxicons@2.0.5/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="css/form.css">
</head>
<body>
<!--===== HEADER =====-->
<header class="l-header">
 <nav class="nav bd-grid">
   <div>
      <a href="home.jsp" class="nav__logo">Ifood</a>
   </div>
                
   <div class="nav__toggle" id="nav-toggle">
   <i class='bx bx-menu'></i>
   </div>

   <div class="nav__menu" id="nav-menu">
     <div class="nav__close" id="nav-close">
        <i class='bx bx-x'></i>
     </div>

     <ul class="nav__list">
         <li class="nav__item"><a href="home.jsp" class="nav__link">Home</a></li>
         <li class="nav__item"><a href="listarRestaurante.jsp" class="nav__link">Lista de Restaurantes</a></li>
         <li class="nav__item"><a href="cadastrarRestaurante.jsp" class="nav__link">Cadastro de Restaurante</a></li>
         <li class="nav__item"><a href="" class="nav__link">Editar seu Cadastro</a></li>
      </ul>
    </div>
   </nav>
</header>
	<main>
	<form action="ListarRestaurante" method="post">
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