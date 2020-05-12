create schema car_rental_service;
USE car_rental_service;

create table role
(
    id              bigint     not null,
    access_right    varchar(5) not null,
    constraint role_pk
        primary key (id)
);
create table user
(
    id           bigint      not null,
    phone_number int         not null UNIQUE,
    password     varchar(35) not null,
    role_id      bigint not null ,
    constraint car_class_pk
        primary key (id),
    foreign key (role_id) references role (id)
);

create table user_details
(
    id                     bigint      not null,
    first_name             varchar(25) not null,
    second_name            varchar(25) not null,
    date_of_birth          date        not null,
    sex                    varchar(10) not null,
    user_id                bigint      not null,
    country                varchar(30) not null,
    city                   varchar(30) not null,
    street                 varchar(30) not null,
    building               varchar(5)  not null,
    apartment              varchar(3)  null,
    passport_id            varchar(25) not null,
    passport_date_of_issue date        not null,
    passport_expiry_date   date        not null,
    place_of_birthday      varchar(30) not null,
    country_of_residence   varchar(30) not null,
    constraint car_class_pk
        primary key (id),
    foreign key (user_id) references user (id)
);

create table car_class
(
    id                bigint      not null,
    class             varchar(15) not null,
    transmission_type varchar(15) not null,
    air_conditioning  boolean     not null,
    constraint car_class_pk
        primary key (id)

);
create table car
(
    id                    bigint      not null,
    registered_car_number varchar(7)  not null,
    body_number           varchar(15) not null,
    engine_type           varchar(10) not null,
    year_of_issue         date        not null,
    brand                 varchar(10) not null,
    model                 varchar(15) not null,
    mileage               int         not null,
    price_auto            int         not null,
    rental_day_price      int         not null,
    car_class_id          bigint not null,
    constraint car_pk
        primary key (id),
    foreign key (car_class_id) references car_class (id)
);

create unique index car_body_number_uindex
    on car (body_number);
create unique index car_registered_car_number_uindex
    on car (registered_car_number);

create table pick_up_location
(
    id       bigint      not null,
    country  varchar(30) not null,
    city     varchar(30) not null,
    street   varchar(30) not null,
    building varchar(5)  not null,
    constraint pick_up_location_pk
        primary key (id)
);

create table rental_information
(
    id                  bigint not null,
    date_of_issue       date   not null,
    rental_time         int    not null,
    return_date         date   not null,
    car_id              bigint not null,
    user_id         bigint not null,
    rental_price        int    not null,
    pick_up_location_id bigint not null,
    constraint rental_information_pk
        primary key (id),
    foreign key (user_id) references user (id),
    foreign key (car_id) references car (id),
    foreign key (pick_up_location_id) references pick_up_location (id)
);

create table car_pick_up_location
(
    id                  bigint not null,
    car_id              bigint not null,
    pick_up_location_id bigint not null,
    constraint car_pick_up_location_pk
        primary key (id),
    foreign key (car_id) references car (id),
    foreign key (pick_up_location_id) references pick_up_location (id)
);



