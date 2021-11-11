<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
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
      <a href="home.jsp" class="nav__logo">Ifood </a>
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
    <section class="content-bg"></section>
    <section class="content">
        <div class="center">
            <div class="title">
            <br>
                <h2>Formulário de Cadastro</h2>
            </div>

		<form action="CadastrarRestaurante" method="post">
            <div class="form-container">
                <div class="form-info">
                    <span>Nome do Restaurante:</span>
                    <input type="text" name="name" placeholder="Nome fantasia" required>
                </div>
                
                <div class="form-info">
                    <span>CNPJ:</span>
                    <input type="text" name="cnpj" placeholder="xx.xxx.xxx/xxxx-xx" required>
                </div>

                <div class="form-info">
                    <span>Data da inauguração:</span>
                    <input type="text" name="date" placeholder="00/00/0000" required>
                </div>

				<div class="form-info">
                    <span>Categoria:</span>
                    <input type="text" name="categoria" placeholder="Comida Italiana" required>
                </div>
                	
                <div class="button">
                    <input type="submit" name="salvar" value="Enviar cadastro"/>
                </div>
                <br>            
            </div>
            </form>
        </div><!--center-->
        <br>
    </section><!--content-->   
    
     <!--===== GSAP =====-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/gsap.min.js"></script>

        <!--===== MAIN JS =====-->
        <script src="main.js"></script>
        
</body>
</html>