<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- =====BOX ICONS===== -->
        <link href='https://cdn.jsdelivr.net/npm/boxicons@2.0.5/css/boxicons.min.css' rel='stylesheet'>

        <!-- ===== CSS ===== -->
        <link rel="stylesheet" href="styles.css">

        <title>Ifood</title>
    </head>
    <body>
        <!--===== HEADER =====-->
        <header class="l-header">
            <nav class="nav bd-grid">
                <div>
                    <a href="#" class="nav__logo">Ifood</a>
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
                        <li class="nav__item"><a href="listarRestaurante.jsp" class="nav__link">Editar o Cadastro</a></li>
                    </ul>
                </div>
            </nav>
        </header>

        <main class="l-main">
            <!--===== HOME =====-->
            <section class="home" id="home">
                <div class="home__container bd-grid">
                <div class="home__img">
                        <img src="img/food.png" alt="" data-speed="2" class="move">
                    </div>
                    
                    <div class="home__data">
                        <h1 class="home__title">Ifood</h1>
                        <p class="home__description">Tirando a sua fome <br> everday.</p>
                        <a href="#" class="home__button">Faça seu cadastro</a>
                    </div>
                </div>
            </section>
        </main>

        <!--===== GSAP =====-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/gsap.min.js"></script>

        <!--===== MAIN JS =====-->
        <script src="main.js"></script>
    </body>
</html>
