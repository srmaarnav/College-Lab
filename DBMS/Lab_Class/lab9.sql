--lab 9
--ddl : create, alter, drop, rename, truncate, comment
--dml : insert, update, delete, select

--simple

--create table table_name
--(
-- column_name column_type,
--column_name column_type
--);

create table student_info
(
sid char(6),
sname varchar2(30),
course_fee number(8),
enrollment_date date
);

select table_name from tabs;
describe student_info;


--column level constraint syntax
--create table table_name
--(
-- column_name column_type contraint  type,
--column_name column_type constraint type
--);
create table books
(
book_id number(8) Constraint bid_pk primary key,
book_name varchar2(30) Constraint bname_nn not null,
author_name varchar2(30),
book_cost number(5) Constraint bcost_chk check(book_cost>1000)
);
select table_name from tabs;
describe books;

create table customers
(
customer_id number(10),
customer_name varchar2(30) not null,
email_id varchar2(30),
issue_date date,
book_id number(8),
constraint ccid_pk primary key(customer_id),
constraint cmail_unq unique(email_id),
constraint ccidpk foreign key(book_id) references books(book_id)
);


--creates new table from reqsult of another query
--create new table as subquery
--create table<new_table_name>
--as subquery


--drop table (table_name deletes it)

create table emp as select * from employees where salary>1000;
select table_name from tabs;
describe emp;
select * from emp;
drop table emp;




--altering a table(add, rename, modify, drop, add constraint)

alter table customers
add contact_number number(10);
describe customers;


alter table customers
rename column contact_number to mobile_number;
describe customers;

alter table customers
modify mobile_number number(14);
describe customers;

alter table customers
drop column mobile_number;
describe customers;

alter table customers
rename to clients;
--renames the table




---data manipulation

select * from books;
describe books;
describe clients;
select * from clients;

--insert

--explicit insert

--insert into <table name> (f1, f2, f3, ... , fn) values(v1, v2, ...vn)

insert into clients (customer_name, customer_id, email_id)
values('Ram', 1, 'ram@email.com');

describe clients;
select * from clients;


--implicit insert
--for book_id, until we insert into books table, we get error
insert into clients values(3, 'Sita', 'sita@email.com', '01-nov-2000', null);


select * from books;
insert into books values (1, 'dmbs', 'a', 1500);
insert into clients values(2, 'Gita', 'gita@email.com', '01-dec-2000', 1);

select * from clients;