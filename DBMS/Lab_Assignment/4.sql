--1. Using CASE function, write a query that displays the grade of all employees based on the value of the column JOB_ID, 
--    using the following data:
--    Job                 Grade
--    AD_PRES             A
--    ST_MAN              B
--    IT_PROG             C
--    SA_REP              D
--    ST_CLERK            E
--    None of the above   0

SELECT job_id,
Case job_id
    When 'AD_PRES' THEN 'A'
    When 'ST_MAN' THEN 'B'
    When 'IT_PROG' THEN 'C'
    When 'SA_REP' THEN 'D'
    When 'ST_CLERK' THEN 'E'
    ELSE '0'
END AS grade
FROM employees;