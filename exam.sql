--1ci  sual
SELECT COUNT(Worker_Id) AS numbersofworkers FROM Employee GROUP BY department ORDER BY numbersofworkers desc;
--2ci sual
SELECT fullname,salary FROM EmployeesDetails
FULL OUTER JOIN  Salaries ON Employees.Empld = EmployeeSalary.Empld;
--3cu sual
SELECT * from  EmployeeDetails WHERE  DateOfJoining  Between '01/01/2020 'AND '05-01-2020';
-- 4 cu sual
SELECT employee_id, first_name, last_name, salary FROM  employee  where first_name='Payam';
--5 ci sual
create table items(
    item_id serial primary key ,
    item_type varchar(30),
    item_price int
);
insert into items(item_type, item_price) values ('metal',10.99);
