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
        <%@include file="/WEB-INF/css/style.css"%>
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
                        <div class="button back"><a href="./index.html">&lsaquo;</a></div>
                        <div class="button register"><a href="./sign-up">Регистрация</a></div>
                        <div class="button login"><a href="">Вход</a></div>
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
                            <a>Hyundai Genesis G80<br>
                            <span class="subtitle--year">(2017 год)</span></a><br>
                            <span class="subtitle--price"></span>Цена: от 170 р.</span>
                        </div>
                        <button class="item__disciption--order">Забронировать</button>
                    </div>
                </div>
                <div class="main__content__list--info">
                    <ul class="full__info"><span class="title">Описание:</span>
                        <li>Регистрационный номер: </li>
                        <li>Тип двигателя: </li>
                        <li>Год выпуска: </li>
                        <li>Брэнд: </li>
                        <li>Модель: </li>
                        <li>Класс: </li>
                        <li>Тип трансмиссии: </li>
                        <li>Кондиционер: </li>
                        <li>Цена: </li>
                    </ul>
                    <ul class="rent__info"><span class="title">Информация по аренде:</span>
                        <li>Страна: </li>
                        <li>Город: </li>
                        <li>Адрес: </li>
                    </ul>
                </div>
                
            </div>
        </div>
    </section>
</body>
</html>