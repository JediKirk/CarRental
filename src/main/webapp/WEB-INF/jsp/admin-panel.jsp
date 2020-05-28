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
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link href="https://fonts.googleapis.com/css?family=Exo+2:400,500|Montserrat:300,400&display=swap"
              rel="stylesheet">
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
                    <div class="button register"><a href="./add-car">Добавить авто</a></div>
                </div>
            </div>
        </div>
        <div class="main__content__list">
            <c:choose>
                <c:when test="${cars.size() > 0}">
                    <c:forEach var="j" begin="0" end="${cars.size()-1}" step="1">
                        <div class="main__content__list--item">
                            <div class="item__disciption">
                                <div class="item__disciption--class">
                                    <c:out value="${cars.get(j).carClass.carClass}"/>
                                </div>
                                <div class="item__disciption--title">
                                    <a href="./admin-car-info/${cars.get(j).id}">
                                        <c:out value="${cars.get(j).brand}"/> <c:out value="${cars.get(j).model}"/><br>
                                        <span class="subtitle--year">(<c:out
                                                value="${cars.get(j).yearOfIssue}"/> год)</span></a><br>
                                    <span class="subtitle--price"></span>Цена: от <c:out
                                        value="${cars.get(j).rentalDayPrice}"/>
                                    р.</span>
                                </div>
                                <form action="./delete/${cars.get(j).id}">
                                    <button class="item__disciption--order">Удалить</button>
                                </form>
                            </div>
                        </div>
                    </c:forEach>
                    <c:forEach var="j" begin="0" end="${totalPages-1}" step="1">
                        <div class="button account"><a href="./admin-panel?page=${j}">${j+1}</a></div>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <div class="main__content__list--item">
                        <div class="item__disciption">
                            <div class="item__disciption--class">
                            </div>
                            <h1>Автомобили отсутствуют</h1>
                        </div>
                    </div>
                </c:otherwise>
            </c:choose>
        </div>
    </div>
    </div>
</section>
</body>
</html>