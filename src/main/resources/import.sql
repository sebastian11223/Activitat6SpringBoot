-- create table COURSE;

-- alter table COURSE add id INT;
-- alter table COURSE add TITLE VARCHAR(40);

insert into COURSE (id, TITLE) values (1, 'RubyDebeSalrElTercero');
insert into COURSE (id, TITLE) values (2, 'Ange');
insert into COURSE (id, TITLE) values (3, 'Farr');
insert into COURSE (id, TITLE) values (4, 'Hanna');
insert into COURSE (id, TITLE) values (5, 'Alan');

insert into Course_Material (id, url,COURSE_ID) values (1, 'EsteEsElQueHeCambiado',3);
insert into Course_Material (id, url,COURSE_ID) values (2, 'LAPICES',2);
insert into Course_Material (id, url,COURSE_ID) values (3, 'PC',1);
insert into Course_Material (id, url,COURSE_ID) values (4, 'RATOLI',4);
insert into Course_Material (id, url,COURSE_ID) values (5, 'RATOLI',5);

