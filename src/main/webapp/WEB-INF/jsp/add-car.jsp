<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                <h1>ДОБАВИТЬ АВТОМОБИЛЬ</h1>
            </div>
            <div class="main__content__header--links">
                <div class="links">
                    <div class="button back"><a href="./admin-panel">&lsaquo;</a></div>
                </div>
            </div>
        </div>
        <div class="main__content--register">
            <form path="*" action="/CarRental_war_exploded/create-car" method="post">
                <div class="container">
                    <p>Заполните все поля, необходимые для добавления.</p>
                    <hr>
                    <c:choose>
                    <c:when test="${binding.size() > 0}">
                        <c:forEach var="j" begin="0" end="${binding.size()-1}" step="1">
                            <div class="main__content__list--item">
                                <div class="item__disciption">
                                    <div class="item__disciption--class">
                                        <c:out value="${binding.get(binding.size()-1-j).defaultMessage}"/>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </c:when>
                    </c:choose>
                    <label><b>Регистрационный номер</b></label>
                    <input type="text" placeholder="Введите номер автомобиля" name="registeredCarNumber"
                           autocomplete="text">

                    <label><b>Тип двигателя</b></label>
                    <input type="text" placeholder="Введите тип двигателя" name="engineType" autocomplete="text">

                    <label><b>Год выпуска</b></label>
                    <input id="date-mask" type="text" placeholder="Введите год выпуска" name="yearOfIssue"
                           autocomplete="text">

                    <label><b>Брэнд</b></label><br>
                    <input type="text" placeholder="Введите брэнд автомобиля" name="brand" autocomplete="text">

                    <label><b>Модель</b></label>
                    <input type="text" placeholder="Введите модель автомобиля" name="model" autocomplete="text">

                    <label><b>Класс</b></label><br>
                    <input type="radio" value="3" name="carClass" id="eco"><label for="eco">
                    Эконом</label><br>
                    <input type="radio" value="2" name="carClass" id="mid"><label for="mid">
                    Средний</label><br>
                    <input type="radio" value="1" name="carClass" id="busi"><label for="busi"> Бизнес
                </label><br><br>

                    <label><b>Цена</b></label>
                    <input type="text" placeholder="Введите цену ареды за день" name="rentalDayPrice"
                           autocomplete="text">

                    <hr>
                    <button type="submit" class="registerbtn">Подтвердить</button>
                </div>

                <div class="container login">
                </div>
            </form>
        </div>
    </div>
</section>
</body>
<script src="https://unpkg.com/imask"></script>
<script src="./script//reg_add.js"></script>

</html>