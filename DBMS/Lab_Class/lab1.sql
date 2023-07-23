--lab 1
--syntax : select c1, c2 ... from [schema.] table_name;


select * 
from employees;
--we can use hr.employees as well

select first_name, last_name, salary 
from employees;

--Arithemetic operators(/, *, +, -) (DMAS) to override use paranthesis

select first_name as Name, salary Monthly_salary, 12*salary as "Annual Salary" 
from employees;

select first_name as Name, salary "Monthly salary", 12*salary as "Annual Salary" 
from employees;

--salary + 10/100 *salary -->salary +0.1 of salary
select first_name as Name, salary "Monthly salary", salary+0.1*salary as "New Salary" 
from employees;

--only increased
select first_name as "Name", salary "Monthly salary", 0.1*salary as "Increased Salary" 
from employees;

--salary increased by 1000 and annual
select first_name as Name, salary "Monthly salary", (salary + 1000)*12 as "Increased Annual Salary" 
from employees;

--12% incremented
select first_name as Name, salary "Monthly salary", 1.12*salary as "New Salary" 
from employees;

--after 13%vat
select first_name as Name, salary "Monthly salary", 0.13*salary as "Monthly VAT", 12*0.87*salary as "Annual Salary" 
from employees;

--NULL values
describe employees;

select first_name, salary, commission_pct
from employees;

select first_name, salary, commission_pct, salary+(salary*commission_pct)as monthly_salary
from employees;

select first_name as "Name", salary as "Salary", NVL(commission_pct,0)as "Commission Percentage", 
salary+(salary*nvl(commission_pct, 0))as "Monthly Salary"
from employees;


--Concatenation using (||) -- "+" in MYSQL server
select first_name||' '||last_name as "Name", salary as "Salary"
from employees;
--putting a space as ||' '|| keeps the space between the two concatenated fields

select last_name||', '||first_name as "Full Name", salary as "Salary"
from employees;

select 'The email address of '||first_name||' is '||email as "Details"
from employees
order by salary;
--using order by is used to sort the db
--if order by not used, the db will auto sort

select department_id from employees;

select distinct(department_id) from employees;

