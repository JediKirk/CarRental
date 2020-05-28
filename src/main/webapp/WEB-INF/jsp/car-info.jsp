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
        <%@include file="/WEB-INF/script/reg_add.js"%>
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
                    <div class="button back"><a href="/CarRental_war_exploded/">&lsaquo;</a></div>
                    <div class="button register"><a href="/CarRental_war_exploded/sign-up">Регистрация</a></div>
                    <div class="button login"><a href="/CarRental_war_exploded/sign-in">Вход</a></div>
                </div>
            </div>
        </div>
        <div class="main__content__list">
            <div class="main__content__list--item">
                <div class="item__image">
                    <img src="img/genesis-g80.jpg" alt="car-image">
                </div>
                <div class="item__disciption">
                    <div class="item__disciption--class">
                        Бизнес
                    </div>
                    <div class="item__disciption--title">
                        <a><c:out value="${car.brand}"/> <c:out value="${car.model}"/> <br>
                            <span class="subtitle--year"><c:out value="${car.yearOfIssue}"/> год</span></a><br>
                        <span class="subtitle--price"></span>Цена: от <c:out value="${car.rentalDayPrice}"/> р.</span>
                    </div>
                    <button class="item__disciption--order">Забронировать</button>
                </div>
            </div>
            <div class="main__content__list--info">
                <ul class="full__info"><span class="title">Описание:</span>
                    <li>Регистрационный номер:<c:out value="${car.registeredCarNumber}"/></li>
                    <li>Тип двигателя:<c:out value="${car.engineType}"/></li>
                    <li>Год выпуска:<c:out value="${car.yearOfIssue}"/></li>
                    <li>Брэнд: <c:out value="${car.brand}"/></li>
                    <li>Модель:<c:out value="${car.model}"/></li>
                    <li>Класс:<c:out value="${car.carClass.carClass}"/></li>
                    <li>Тип трансмиссии: <c:out value="${car.carClass.transmissionType}"/></li>
                    <li>Кондиционер:<c:out value="${car.carClass.airConditioning}"/></li>
                    <li>Цена: <c:out value="${car.rentalDayPrice}"/></li>
                </ul>
            </div>

        </div>
    </div>
</section>
</body>
</html>