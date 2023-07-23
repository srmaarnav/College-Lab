---Lab 5
--using aggregate functions
--(min, max, sum, avg, count)
--if no nvl, then we exclude null values even in the no.

select min(salary) min, max(salary) max, round(avg(salary)) mean, sum(salary) sum, count(*) total
from employees;

select avg(commission_pct) meanl, count(*)
from employees;

select round(avg(commission_pct),2) mean1, 
       round(avg(nvl(commission_pct,0)),2) mean2, count(*)
from employees;

--using groupby
select department_id, round(avg(salary),2) mean_salary, count(*)
from employees
GROUP BY department_id;

select department_id, round(avg(salary),2) mean_salary, count(*)
from employees
GROUP BY department_id
order by department_id;


--using having
--where in normal functions
--in group functions having is used
select department_id, round(avg(salary),2) mean_salary, count(*)
from employees
having avg(salary)>10000
GROUP BY department_id
order by department_id;
