--1. Find the highest, lowest, sum, and average salary of all employees. Label the columns Maximum, Minimum, Sum and Average 
--    respectively. Round your results to the nearest whole number.
--2. Modify the query in task_5_1 to display the minimum, maximum, sum and average salary for each job type.
--3. Write a query to display the number of people with the same job.
--4. Find the difference between the highest and lowest salaries. Label the column DIFFERENCE.
--5. Create a query to display the manager number and the salary of the lowest-paid employee for the manager. Exclude anyone
--    whose manager is not known. Exclude any groups where the minimum salary is $6,000 or less. Sort the output in descending
--    order of salary.

SELECT 
    ROUND(MAX(salary)) AS Maximum,
    ROUND(MIN(salary)) AS Minimum,
    ROUND(SUM(salary)) AS Sum,
    ROUND(AVG(salary)) AS Average
FROM employees;

SELECT job_id,
    MAX(salary) AS Maximum,
    MIN(salary) AS Minimum,
    SUM(salary) AS Sum,
    round(AVG(salary)) AS Average
FROM employees
GROUP BY job_id;

SELECT job_id,count(*) as "number"
FROM employees
GROUP BY job_id;

SELECT 
    MAX(salary) AS Maximum,
    MIN(salary) AS Minimum,
    MAX(salary)- MIN(salary) as "difference"
FROM employees;
  
SELECT manager_id, MIN(salary) AS Minimum 
FROM employees
WHERE manager_id IS NOT NULL
GROUP BY manager_id
HAVING MIN(salary) > 6000
ORDER BY MIN(salary) DESC;






