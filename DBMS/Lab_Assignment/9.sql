--The HR department wants you to create SQL statements to insert, update and delete employee
--data. As a prototype, you use the MY_EMPLOYEE Table, before giving statements to the HR
--department
--Create a table MY_EMPLOYEE table to use for lab.
--
--Field         Data type           Constraint type
--id            number (4)          PRIMARY KEY, NOT NULL
--last_name     varchar2 (25)
--first_name    varchar2 (25)       NOT NULL
--user_id       varchar2 (25)       UNIQUE
--salary        number (9,2)

create table my_employee
(id number(4) constraint my_employee_id_num not null,
last_name varchar2(25),
first_name varchar2(25) constraint fname not null,
user_id varchar2(25) constraint user_id  unique,
salary number(9, 2));

--to delete permently
DROP TABLE my_employee PURGE;


--Create an INSERT statement to add the rows of data to the my_employee table from the
--following sample data.
--ID    Last_name   First_name  UserID      Salary
--1     Patel       Ralph       Rpatel      895
--2     Dancs       Betty       Bdancs      860
--3     Biri        Ben         Bbiri       1100
--4     Newman      Chad        Cnewman     750
--5     Ropeburn    Audrey      Aropebur    1550

insert all
into my_employee (id, last_name, first_name, user_id, salary) values(1, 'Patel', 'Ralph', 'Rpatel', 895)
into my_employee (id, last_name, first_name, user_id, salary) values(2,  'Dances', 'Betty', 'Bdances', 860)
into my_employee (id, last_name, first_name, user_id, salary) values(3, 'Biri', 'Ben', 'Bbiri', 1100)
into my_employee (id, last_name, first_name, user_id, salary) values(4, 'Newman', 'Chad', 'Cnewman', 750)
into my_employee (id, last_name, first_name, user_id, salary) values(5, 'Ropeburn', 'Audrey', 'Aropeburn', 1550)
select 1 from dual;

--Confirm your addition to the table.
select * from my_employee;

--Make the data addition permanent.
commit;


 -- 5. Change the last name of employee 3 to Drexler.
 update my_employee
 set last_name = 'Drexler'
 where id =3;
 
 -- 6. Change the salary to $1,000 for all employees with a salary less than $ 900.
 update my_employee
 set salary = 1000
 where salary <900;
 
 -- 7. Delete Betty Dancs from the my_employee table
 delete 
 from my_employee
 where first_name = 'Betty';
 
 -- 8. commit all pending changes
 commit;