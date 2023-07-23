--lab 2
--restricting and sorting data using where <operator> condition

select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where salary < 5000;

--wrong code
select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name = neena;

--data is not found, because oracle is case sensitive for strings
select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name = 'neena';

--Correct query
select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name = 'Neena';

select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name in ('Neena', 'Lex');



--using comparision operators
-- <, <=, >, >=, <>(not equals)
--between <start_value> and <end_value> --inclusive ([a, b])
--in (v1, v2, v3, ...)
--like (pattern) -- % matches any no. of character, matches only one character
-- is null

select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where salary between 2000 and 10000; 

select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where salary not between 2000 and 10000; 

select first_name as "Name",salary as "Salary", hire_date as "Hire Date", commission_pct as "Commission %"
from employees
where commission_pct is null; 

select first_name as "Name",salary as "Salary", hire_date as "Hire Date", commission_pct as "Commission %"
from employees
where commission_pct is not null; 

select first_name||' '||last_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name like 'A%';

select first_name||' '||last_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name like '%s';

select first_name||' '||last_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name like '%Al%' or last_name like '%s%'; 

--for like % selects any character of any length
--_ selects any character of single length

select first_name||' '||last_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name like 'Alexande_';

select first_name||' '||last_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name like 'A______'; --matching no. of blank spaces

select first_name||' '||last_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name like '_arah';

select first_name||' '||last_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name like '_e%' and last_name like '_a%'; --matching no. of blank spaces

select first_name||' '||last_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name like '%e%' and last_name like '%a%';

select first_name||' '||last_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name like 'N%a';

select first_name||' '||last_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name like '%a__';


select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where salary in (2000, 30000, 4000, 299349, 1000); 

select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name in ('Neena', 'Lex', 'Bruce', 'Den', 'Luis');

select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where first_name in ('Neena', 'Lex', 'Bruce', 'Den', 'Luis') and (salary >= 9000);

select first_name as "Name",salary as "Salary", hire_date as "Hire Date", job_id as "Job"
from employees
where job_id in('SA_REP');

select first_name as "Name",salary as "Salary", hire_date as "Hire Date", job_id as "Job"
from employees
where job_id like '%MAN%'; --searching for managers

select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where hire_date = '21-Sep-05'; --DD-MON-RR


--Precedence Order (NOT, AND, OR)
--Use () to override the order

select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where (hire_date between '01-Jan-01' and '01-Jan-08') 
and 
salary > 7500; 

select first_name as "Name",salary as "Salary", hire_date as "Hire Date"
from employees
where (hire_date between '01-Jan-01' and '01-Jan-08') 
and 
salary > 7500
order by salary DESC; 

select first_name as "Name",salary as "Salary", hire_date as "Hire Date", job_id as "Job"
from employees
where (job_id like '%MAN%' or salary > 10000) and hire_date between '01-Jan-01' and '01-Jan-08'
order by employee_id;


select first_name as "Name",salary as "Salary", hire_date as "Hire Date", job_id as "Job"
from employees
where (job_id like '%MAN%' and salary > 10000) or hire_date not between '01-Jan-01' and '01-Jan-08'
order by employee_id;

select first_name as "Name",salary as "Salary", hire_date as "Hire Date", job_id as "Job"
from employees
where salary>1000
AND job_id like '%REP'
OR job_id like '%MAN'
order by employee_id;

select first_name as "Name",salary as "Salary", hire_date as "Hire Date", job_id as "Job"
from employees
where salary>1000 
AND 
(job_id like '%REP' OR job_id like '%MAN')
order by employee_id;

--Order by, by default ascending

select first_name as "Name",salary as "Salary", hire_date as "Hire Date", job_id as "Job"
from employees
order by employee_id DESC;

select first_name as "Name",salary as "Salary", hire_date as "Hire Date", department_id as "Department Id"
from employees
order by department_id DESC, salary DESC;

--using substitution variable (&)

select &first_field, salary, &third_field
from employees;

select first_name as "Name", department_id as "Department Id", job_id as "Job Id", salary as "Salary"
from employees
where &condition
order by salary DESC;

select &first_field||' '||&second_field as &new_name, &third_field, &fourth_field
from &table_name
where &condition
order by &field;



