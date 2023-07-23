--1. The HR department needs a report to display the employee number, last name, salary, and salary increased by 15.5% (expressed
--    as a whole number) for each employee. Label the column New Salary.
--2. Modify your task_03_01.sql query to add a column that subtracts the old salary from the new salary. Label the column Increase.
--3. Write a query that displays the last name and the length of the last name for all employees whose name starts with letters J,
--    A or M. Give each column an appropriate label. Sort the results by the employees' last names.


select employee_id, last_name, salary, round((salary+0.155*salary),0) "New Salary"
from employees;


select employee_id, last_name, salary,round((salary+0.155*salary),0) "New Salary",round((salary+0.155*salary),0)-salary as "Increase"
from employees;


SELECT last_name AS Last_Name, LENGTH(last_name) AS Last_Name_Length
FROM employees
WHERE last_name LIKE 'J%' OR last_name LIKE 'A%' OR last_name LIKE 'M%'
ORDER BY last_name;
