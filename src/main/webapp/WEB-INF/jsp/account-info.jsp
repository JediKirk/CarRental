<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://fonts.googleapis.com/css?family=Exo+2:400,500|Montserrat:300,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
    <title>Document</title>
    <script type="text/javascript">
        <%@include file="/WEB-INF/script/reg.js" %>
    </script>
    <style>
        <%@include file="/css/style.css" %>
    </style>


</head>
<body>
<section class="section__outer section__inner">
    <div class="main__content">
        <div class="main__content__header">
            <div class="main__content__header--title">
                <h1>ЛИЧНЫЕ ДАННЫЕ</h1>
            </div>
            <div class="main__content__header--links">
                <div class="links">
                    <div class="button back"><a href="./">&lsaquo;</a></div>
                </div>
            </div>
        </div>
        <div class="main__content__list">
            <div class="item__image personal">
            </div>
            <div class="main__content__list--info">
                <ul class="full__info"><span class="title">Ваши данные:</span>
                    <li>Ваше Имя:<c:out value="${userInfo.firstName}"/></li>
                    <li>Фамилия: <c:out value="${userInfo.secondName}"/></li>
                    <li>Год рождения:<c:out value="${userInfo.dateOfBirth}"/></li>
                    <li>Пол:<c:out value="${userInfo.gender}"/></li>
                    <li>Страна:<c:out value="${userInfo.address.country}"/></li>
                    <li>Город:<c:out value="${userInfo.address.city}"/></li>
                    <li>Улица:<c:out value="${userInfo.address.street}"/></li>
                    <li>Дом:<c:out value="${userInfo.address.building}"/></li>
                    <li>Квартира:<c:out value="${userInfo.apartment}"/></li>
                    <li>Номер телефона:<c:out value="${userInfo.user.phoneNumber}"/></li>
                </ul>
            </div>
        </div>
    </div>
</section>
</body>

</html>