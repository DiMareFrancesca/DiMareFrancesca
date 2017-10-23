#1.Select name and brand of all smartphones in the database;
select s.name as smartphone_name,b.name as brand_name from smartphone as s inner join brand as b 
on s.brand=b.id;

#2.Select name and opSys of all smartphones in the database sorted by opSys, name; 
select name, opSys from smartphone
order by opSys, name;

#3.Select name and opSys of all Android smartphones in the database descendant sorted by weight;
select name,opSys from smartphone
order by weight desc;

#4.Select name, brand, country of all smartphones in the database sorted by country, brand, name;
select s.name as modello, b.name as brand, c.name as country
from smartphone as s inner join brand as b inner join country as c
on s.brand=b.id and b.country=c.code
order by c.name , b.name, s.name;
#5 Select count of smartphones in the database with 3Gb ram;
select count(id) from smartphone
where ram='3Gb';
#6 Select count of smartphones for each opSys in the database;
select count(s.id), o.description
from smartphone as s inner join opSys as o
on s.opSys= o.id
group by o.description;
#7Select count of smartphones for each country in the database;
select count(s.id), c.name as country
from smartphone as s inner join brand as b
on s.brand=b.id
inner join country as cusersmartphoneopsysbrandidsmartphone
on b.country=c.code
group by c.name;



