--lab 7

--using sub-queries to save queries

select salary from employees
where first_name = 'Neena';

select first_name, salary
from employees
where salary > (select salary from employees 
                where first_name = 'Neena');
                
select salary from employees 
where job_id ='IT_PROG'
order by salary;

--select first_name, salary
--from employees
--where salary > (select salary from employees 
--                where job_id ='IT_PROG');
--gives error

select first_name, salary
from employees
where salary  in(select salary from employees 
                where job_id ='IT_PROG');

select first_name, salary
from employees
where salary > all (select salary from employees 
                where job_id ='IT_PROG'); --all gives intersection of all possible outcomes
                
select first_name, salary
from employees
where salary > any (select salary from employees 
                where job_id ='IT_PROG'); --any gives union of all possible outcomes

