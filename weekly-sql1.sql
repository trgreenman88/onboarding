create table Employees (
	worker_id int,
	first_name text,
	last_name text,
	salary int,
	joining_date timestamp,
	department text
);

create table Bonus (
	worker_ref_id int,
	bonus_date timestamp,
	bonus_amount int
)

create table Title (
	worker_ref_id int,
	worker_title text,
	affected_from timestamp
)

select * from employees;
select * from bonus;
select * from title;

--a
select first_name, last_name from public.employees where salary >= 50000 and salary <= 100000;
--b
select count(*) as no_of_workers, department from public.employees group by department order by no_of_workers desc;
--c
select * from employees inner join bonus on worker_id = bonus.worker_ref_id inner join title on worker_id = title.worker_ref_id;
--d
select * from (select row_number () over (order by salary desc) as RowNum, * from employees) as foo where RowNum = 5;

