#1.select all smartphone in the database
select * from smartphone;

#2.select all smartphone in the database with projection: name,ram size and cpu
select  name, ram, size, cpu from smartphone;

#3.select all smartphones in the database with display resolution equal to 1080x1920
select name from smartphone 
where displayresolution='1080x1920';

#4. select name of smartphones with display resolution equal to 1080x1920 and 3Gb ram;
select name from smartphone 
where displayresolution='1080x1920' and ram='3Gb';

#5.select all galaxy smartphones;
select name from smartphone
where name like 'Galaxy%';

#6 select all galaxy smartphone with dual-core cpu;
select name from smartphone
where name  like 'Galaxy%' and cpu like 'dual-core';

#7.Select all smartphones with weight less than 150 grams;
select name from smartphone 
where weight <='150 grams';

#8.Select all smartphones with weight greater than or equal 150 grams;
select name from smartphone
where weight <= '150 grams';

#9.Select all smartphones sorted by display ppi;
select name from smartphone 
where displayPpi;

#10.Select all smartphones descendant sorted by display ppi;
select name from smartphone
order by displayPpi desc;





