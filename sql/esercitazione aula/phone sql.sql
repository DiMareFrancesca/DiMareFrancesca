drop database if exists Phone;
create database if not exists Phone

default character set latin1
default collate latin1_general_ci;
use Phone;

#alter database, modify chatacter latin1 in utf8
alter database Phone
default character set utf8
default collate utf8_unicode_ci;

#table creation 

drop table if  exists country;
create table country (

code varchar (2) not null,
name varchar(32) not null,
primary key (code)
);

create table opsys (

id INT(11),
description varchar(64) not null,
company varchar (64) not null,
openSource TINYINT(1) ,
primary key (id)
);


drop table if  exists brand;
create table brand (
id int (11) not null auto_increment,
name varchar (32) not null,
country varchar(2) not null,
primary key (id),
foreign key (country)  references country (code) 
);




create table smartphone (
id INT (11) not null,

name varchar (32) not null,
ram varchar(5) not null ,
cpu varchar (64) not null,
displayPpi int(11) not null,
displaysize varchar(12) not null,
displayresolution varchar (64)not null,
size varchar(64) not null ,
weight INT(4) not null,
notes varchar (1024) not null,
brand INT (11) not null,
opSys int(11) not null,
primary key (id),

foreign key (brand) references brand (id),
foreign key (opSys) references opsys (id)
);










