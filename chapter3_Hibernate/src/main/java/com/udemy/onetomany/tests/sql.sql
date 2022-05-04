create schema spring_course

create table employees (
    id         int NOT NULL auto_increment,
    name       varchar(15),
    surname    varchar(25),
    department varchar(20),
    salary     int,
    PRIMARY KEY (id)
);


CREATE TABLE departments (
     id int NOT NULL AUTO_INCREMENT,
     name varchar(15),
     max_salary int,
     min_salary int,
     PRIMARY KEY (id)
);

CREATE TABLE employees (
   id int NOT NULL AUTO_INCREMENT,
   name varchar(15),
   surname varchar(25),
   salary int,
   department_id int,
   PRIMARY KEY (id),
   FOREIGN KEY (department_id) REFERENCES departments(id)
);
