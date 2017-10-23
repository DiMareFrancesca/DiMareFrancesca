drop database if exists Ricette;
create database if not exists Ricette

default character set latin1
default collate latin1_general_ci;
use Ricette;

#alter database, modify chatacter latin1 in utf8
alter database Ricette
default character set utf8
default collate utf8_unicode_ci;

#table creation 
drop table if  exists category;
create table category (
id INT(50) not null auto_increment,
type varchar (64) not null,
primary key (id)
);

drop table if  exists ingredient;
create table ingredient  (

id INT(60) not null auto_increment,
name varchar(64) not null,
primary key (id)
);

drop table if  exists author;
create table author  (

id INT(60) not null auto_increment,
name varchar(64) not null,
surname varchar(64) not null,
primary key (id)
);

drop table if  exists tool;
create table tool  (

id INT(60) not null auto_increment,
name varchar(64) not null,
primary key (id)
);

drop table if  exists recipe;
create table recipe (

id INT(60) not null auto_increment,
name varchar(64) not null,
time INT(120) not null,
author INT(60) not null,
category INT(60),
primary key (id),
foreign key (author) references  author(id),
foreign key (category) references category(id)
);

drop table if  exists useIngredient;
create table useIngredient  (

id INT(60) not null auto_increment,
recipe INT(60) not null,
ingredient INT(60),
amount varchar(64) not null,
primary key (id),
foreign key (ingredient) references ingredient(id),
foreign key (recipe) references recipe(id)
);

drop table if  exists useTool;
create table useTool  (

id INT(60) not null auto_increment,
recipe INT(60) not null,
tool int(60),
primary key (id),
foreign key (recipe) references recipe(id),
foreign key (tool) references tool(id)

);