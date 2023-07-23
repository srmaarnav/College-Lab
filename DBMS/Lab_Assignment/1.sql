--1. Determine the structure of DEPARTMENTS table and contents.
--2. Determine the structure of Employees table.
--3. The HR department wants a query to display the last name, job code, hire date and employee number for each employee, with the 
--    employee number appearing first. Provide an alias STARTDATE for the HIRE_DATE column.
--4. The HR department needs a query to display all unique job codes from the EMPLOYEES table.
--5. The HR department wants more descriptive column heading for its report on employees. Modify the Task_1_3 to Name the 
--    column heading EMP #, Employee, Job and Hire Date, respectively.
--6. The HR department has requested a report of all employees and their job IDs. Display the last name concatenated 
--    with the job ID (Separated by a comma and space) and name the column Employee and Title.

describe departments;
select * from employees;


describe employees;

select employee_id, last_name, job_id, hire_date as "STARTDATE"
from employees;

select distinct(job_id) from employees;

select employee_id as "EMP #", last_name as "Employee", job_id as "Job", hire_date as "Hire Date"
from employees;

select last_name||', '||job_id as "Employee and Title"
from employees;