--lab 3
--customizing output using single row function

--using case manipulation functions 
--lower
--upper 
--initcap(initial capslock)

select first_name, salary
from employees
where lower(first_name) = 'neena';

select first_name, salary
from employees
where initcap(first_name) = 'Neena';

select first_name, salary
from employees
where upper(first_name) = 'NEENA';

select Upper(last_name) as "Last Name", lower(first_name) as "First Name", salary as "Salary"
from employees ;

select initcap(first_name) as "First Name", lower(email) as "Lower Email", upper(email) as "Upper Email", initcap(email) as "Initcap Email"
from employees ;


--character manipulation funcrions
--concat
--length
--substr
--instr   -- first instance of found in the string
--lpad   -- pad, to fill the empty space inleft of the string
--rpad   -- pad, to fill the empty space inleft of the string
--replace    --for noise reduction in db
--trim

select first_name||' ' ||last_name as "Name"
from employees;

select concat(concat(first_name, ' '), last_name) as "Name"
from employees;

select length(phone_number) as "Length of Phone Number"
from employees;

select length(concat(concat(first_name, ' '), last_name)) as "Length of Name"
from employees;

select substr(concat(concat(first_name, ' '), last_name), 2, 8) as "Substr of 2, 8"
from employees;

select first_name as "First Name", instr(first_name, 'a') as "Position"
from employees;

select instr((concat(concat(first_name, ' '), last_name)), 'a') as "Position of A"
from employees;

select salary as "Salary", lpad(salary, 10, '.') as "Lpad of salary", rpad(salary, 10, '.') as "rpad of salary"
from employees;

select replace(concat(concat(first_name, ' '), last_name), ' ', ',') as "Name"
from employees;

select trim('e' from lower(first_name)) as "Name"
from employees;


--number functions
--round   --rounds value to a given no. of decimals (ROUND(45.926, 2)) gives 45.92 (completes roundoff)
--trunc   --truncated value to a given no. of decimals (TRUNC(45.926, 2)) gives 45.93 (deleting the remaining)
--mod   --returns remainder of division MOD(1600, 300) gives 100

select TRUNC(45.926, 2) as "trunc", ROUND(45.926, 2) as "round", ROUND(45.926, -1)as "-round"
from dual; -- dual is a temp db in RAM

select first_name as "Name", trunc(salary, -3) as "Monthly salary"
from employees;

select first_name as "Name", salary "Monthly salary", round(0.13*salary, 2) as "Monthly VAT", round(12*0.87*salary, 2) as "Annual Salary" 
from employees;

select first_name as "Name", salary "Monthly salary", trunc(0.13*salary, 2) as "Monthly VAT", trunc(12*0.87*salary, 2) as "Annual Salary" 
from employees;

select first_name as "Name", salary "Monthly salary", round(0.13*salary, -2) as "Monthly VAT", round(12*0.87*salary, -2) as "Annual Salary" 
from employees;

select first_name as "Name", salary "Monthly salary", trunc(0.13*salary, -2) as "Monthly VAT", trunc(12*0.87*salary, -2) as "Annual Salary" 
from employees;

select first_name as "Name", salary "Monthly salary", mod(salary, 500) as "Status"
from employees;

--working with dates

select concat(concat(first_name, ' '), last_name) as "Name", hire_date as "Hire Date"
from employees
where hire_date > '01-FEB-88';

select sysdate 
from dual;

select last_name, (SYSDATE-hire_date)/7 AS WEEKS
from employees
where department_id = 90;


