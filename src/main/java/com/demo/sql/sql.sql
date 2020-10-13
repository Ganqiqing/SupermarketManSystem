#商品表
create table commodity
(
    `commodity_id`        int(10) primary key auto_increment,
    `commodity_name`      varchar(20) not null,
    `commodity_date`      date,
    `commodity_price`     int(100)    not null,
    `commodity_priceCode` varchar(25) not null,
    `commodity_typeCode`  int(5),
    FOREIGN KEY (commodity_typeCode) REFERENCES commodity_type (commodity_typeCode)
);

#商品类型表
create table commodity_type
(
    `commodity_typeCode` int(5) primary key auto_increment,
    `commodity_type`     varchar(25) not null
);

#收银表
create table cashier
(
    `staff_id`     int(5) primary key auto_increment,
    `commodity_id` int(10)  not null,
    `number`       int(10)  not null,
    `selling`      int(100) not null,
    `date`         datetime not null,
    `cashier_id`   int(10)
);

#员工信息表
create table staff
(
    `staff_id`   int(5) primary key auto_increment,
    `account`    varchar(25) UNIQUE not null,
    `password`   varchar(25)        not null,
    `staff_name` varchar(25)        not null,
    `staff_sex`  varchar(2)         not null,
    `staff_age`  int(100)           not null,
    `wages`      int,
    `phone`      varchar(11)        not null,
    `limit`      int(1) default 4   not null,
    `state`      int(1) default 0   not null
);

#仓库Warehouse
create table warehouse
(
    `commodity_id` int(5) primary key auto_increment,
    `number`       int(100) not null
);

#进货单
create table Purchase
(
    `purchase_id`      int(5) primary key auto_increment,
    `commodity_id`     int(10)  not null,
    `commodity_number` int(100) not null,
    `commodity_price`  int(100) not null,
    `staff_id`         int(5)   not null
);