create database School;

create database College;

use College
create table college(id int identity(1,1),college_name varchar(100));
insert into college values('AG');
insert into college values('RVR');
insert into college values('VR');
select * from college;


use School
create table school(id int identity(1,1),scholl_name varchar(100));
insert into school values('Floora');
insert into school values('Gemini');
insert into school values('Hyd');
select * from school;


