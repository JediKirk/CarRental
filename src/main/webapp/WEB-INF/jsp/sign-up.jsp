<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://fonts.googleapis.com/css?family=Exo+2:400,500|Montserrat:300,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    <title>Document</title>
    <script type="text/javascript">
        <%@include file="/WEB-INF/script/reg.js"%>
    </script>

    <style>
        <%@include file="/css/style.css"%>
    </style>
</head>
<body>
<section class="section__outer section__inner">
    <div class="main__content">
        <div class="main__content__header">
            <div class="main__content__header--title">
                <h1>АВТОПАРК</h1>
            </div>
            <div class="main__content__header--links">
                <div class="links">
                    <div class="button back"><a href="./">&lsaquo;</a></div>
                    <div class="button login"><a href="./sign-in">Вход</a></div>
                </div>
            </div>
        </div>
        <div class="main__content--register">
            <form action="/CarRental_war_exploded/registration/sign-up" method="post">
                <div class="container">
                    <p>Заполните все поля для регистрации.</p>
                    <hr>

                    <label><b>Номер телефона</b></label>
                    <input type="text" placeholder="Введите номер телефона" name="phoneNumber" required>

                    <label><b>Пароль</b></label>
                    <input type="password" placeholder="Введите пароль" name="password" required>

                    <hr>

                    <button type="submit" class="registerbtn">Зарегестрироваться</button>
                </div>

                <div class="container login">
                    <p>Уже есть аккаунт? <a href="./sign-in">Войти</a>.</p>
                </div>
            </form>
        </div>
    </div>
</section>
</body>
</html>