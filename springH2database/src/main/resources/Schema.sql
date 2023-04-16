drop table if exists Person;

create table person (
id int AUTO_INCREMENT primary key, 
fname varchar(100) not null,
lname varchar(100) not null,
email varchar(40) default null 

);