#query insert new user
insert into user (name, surname,telnumber,smartphone) values
             ('silvio','verdi','123456789',3);
select *from user;
             
#visualize user information and smartphone type
select u.name, u.surname, u.telnumber, s.name from user as u, smartphone as s where u.smartphone=s.id;

# update user information  
update user
set  name='Gragorio',surname='vaira',smartphone=10 , telnumber='321456987'
where    id=3;
update user
set  name='Angela',surname='Alighieri',smartphone=2 , telnumber='123456987'
where    id=7;
select * from user;

#update type smartphone
update smartphone 
set name='asus', ram='4Gb', opSys=3
where id=1;
select * from smartphone
where id=1;

# visualize some telephone information      
 select * from smartphone
 where name='Galaxy s4';  
 select * from smartphone
 where ram='3Gb';

