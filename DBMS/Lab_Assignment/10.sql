--The staff in the HR department wants to hide some of the data in the EMPLOYEES table.
--They want a view called EMPLOYEES_VU based on the employee numbers, employee
--last names, and department numbers from the EMPLOYEES table. They want the heading
--for the employee name to be EMPLOYEE.
create or replace view employees_vu as
select employee_id, last_name employee, department_id
from employees;

-- 2.Confirm that the view works. Display the contents of the EMPLOYEE_VU view
select * from employees_vu;

-- 3. Using your EMPLOYEE_VU view, write a query for the HR department to display all 
--employee names and department numbers.
select employee, department_id
from employees_vu;

-- 4. Create synonyms emp for employees table
create synonym emps for employees;

-- 5. Confirm that the synonyms work. Display the contents of the emp table using recently 
-- created synonyms.
select * from emp;
