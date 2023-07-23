--Create a report that displays the employee number, last name, and salary of all employees 
--who earn more than the average salary. Sort the results in ascending order by salary. 
SELECT employee_id, last_name, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees)
ORDER BY salary ASC;


--2. Write a query that displays the employee number and last name of all employees who work 
--in a department with any employee whose last name contains a u. 
SELECT employee_id, last_name
FROM employees
WHERE department_id IN (
  SELECT department_id
  FROM employees
  WHERE last_name LIKE '%u%'
);




--3. The HR department needs a report that displays the last name, department number, job id 
--of all employees whose department location id is 1700.
SELECT department_id, last_name,job_id
from employees
where department_id in (
select department_id
from departments
where location_id=1700);



--4. Create a report for the HR department that displays the last name and salary of every 
--employee who reports to King.
SELECT employee_id,last_name, salary
FROM employees
WHERE manager_id in (
  SELECT employee_id
  FROM employees
  WHERE last_name = 'King'
);

