---using case functions

select first_name as "First Name", salary as "Salary", job_id as "Job Id",
case job_id
    when'it_prog' then salary*1.1
    when'sa_rep' then salary*1.2
    when'mk_man' then salary*1.3
    else salary
end as "Updated Salary"
from employees;

select first_name as "First Name", job_id as "Job Id", salary as "Salary",
case department_id
    when 10 then salary*1.1
    when 20 then salary*1.2
    when 30 then salary*1.3
    else salary
end as "Updated Salary"
from employees;


--using decode
--decode(field, c1, r1, c3, r2, ...., resultdefault)
select first_name as "First Name", job_id as "Job Id", salary as "Salary",
DECODE(department_id, 10, salary*1.1, 20, salary*1.2, 30, salary*1.3, salary)
as "Updated Salary"
from employees;
