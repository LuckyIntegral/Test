create table students
(
    id bigint auto_increment primary key,
    created_data datetime null,
    updated_data datetime null,
    first_name varchar(255) null,
    last_name varchar(255) null,
    age int
);

create table departments
(
    id bigint auto_increment primary key,
    created_data datetime null,
    updated_data datetime null,
    department_type varchar(255) not null
);

create table stud_dep
(
    dep_id bigint not null,
    stud_id bigint not null,
    primary key(dep_id, stud_id),
    foreign key(dep_id) references departments(id),
    foreign key (stud_id) references students(id)
);
