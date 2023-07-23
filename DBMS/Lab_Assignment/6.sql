-- Write a query for the HR department to produce the addresses of all the departments. Use 
--the LOCATIONS and COUNTRIES tables. Show the location Id, street address, city, state 
--or province and country in the output. Using inner join.


SELECT L.location_id, L.street_address, L.city, L.state_province, C.country_name
FROM LOCATIONS L JOIN COUNTRIES C ON (L.country_id = C.country_id);


--The HR department need a report of all employees. Write a query to display the last name, 
--department number, and department name for all employees.

SELECT e.last_name, e.department_id, d.department_name
FROM employees e 
JOIN departments d ON (e.department_id = d.department_id);

--The HR department needs a report of employees in Toronto. Display the last name, job, 
--department number, department name and city for all employees who work in Toronto. 

SELECT e.last_name,e.job_id, e.department_id, d.department_name, l.city
FROM employees e
JOIN departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id
WHERE l.city = 'Toronto';




