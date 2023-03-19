insert into departments values (1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'DEVELOPMENT');
insert into departments values (2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'MANAGEMENT');
insert into departments values (3, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'DESIGN');
insert into departments values (4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'SECURITY');

insert into students values (1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Mark', 'One', 18);
insert into students values (2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Jon', 'Two', 18);
insert into students values (3, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Ben', 'Thee', 18);
insert into students values (4, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Tom', 'Four', 18);
insert into students values (5, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Nick', 'Five', 18);
insert into students values (6, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Leo', 'Six', 18);
insert into students values (7, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'Noa', 'Seven', 18);

insert into stud_dep values (1, 1);
insert into stud_dep values (1, 2);
insert into stud_dep values (1, 3);
insert into stud_dep values (2, 1);
insert into stud_dep values (2, 4);
insert into stud_dep values (3, 5);
insert into stud_dep values (3, 6);
insert into stud_dep values (4, 1);
insert into stud_dep values (4, 7);
