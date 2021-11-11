<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Ifood</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href='https://cdn.jsdelivr.net/npm/boxicons@2.0.5/css/boxicons.min.css' rel='stylesheet'>
        <link rel="stylesheet" href="css/sucesso.css">

    </head>
    <body>
        <!--===== HEADER =====-->
        <header class="l-header-sucesso">
            <nav class="nav bd-grid-sucesso">
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
                        <li class="nav__item"><a href="cadastrarRestaurante.jsp" class="nav__link">Cadastro de Restaurantes</a></li>
                        <li class="nav__item"><a href="" class="nav__link">Editar o Cadastro</a></li>
                    </ul>
                </div>
            </nav>
        </header>

        <main class="l-main">
            <!--===== HOME =====-->
            <section class="home-sucesso" id="home">
                <div class="home__container-sucesso bd-grid">
                <div class="home__img-sucesso">
                        <img src="img/2.png" alt="" data-speed="2" class="move">
                    </div>
                    
                    <div class="home__data-sucesso">
                        <h1 class="home__title-sucesso">Cadatro feito com sucesso!</h1>
                        <p class="home__description-sucesso">Seja <br> Bem-vinde.</p>
                    </div>
                </div>
            </section>
        </main>

        <!--===== GSAP =====-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/gsap.min.js"></script>

        <!--===== MAIN JS =====-->
        <script src="js/main.js"></script>
    </body>
</html>
