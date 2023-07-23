---lab 6
---joining tables(inner, outer)

--inner join
describe employees;
describe departments;

select*
from employees join departments
using(department_id);

select*
from employees e join departments d
on (e.department_id =d.department_id);

select e.first_name as "First Name", e.salary as "Salary", e.department_id as "Department ID", d.department_name as "Department Name"
from employees e join departments d
on (e.department_id = d.department_id)
where (salary>10000);

--three levels of join
describe locations;
describe regions;

select l.city, l.state_province, r.region_name
from locations l join countries c on (l.country_id = c.country_id)
join regions r on (r.region_id = c.region_id);
--where r.region_name = 'Europe';

--outer join

select * 
from employees e full outer join departments d
on (e.department_id = d.department_id);

select * 
from employees e left outer join departments d
on (e.department_id = d.department_id);

select * 
from employees e right outer join departments d
on (e.department_id = d.department_id);
