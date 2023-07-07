CREATE TABLE Sales ( ID SERIAL PRIMARY KEY, Product VARCHAR(30),Quantity INTEGER,Price DECIMAL(10, 2));
select * From Sales;
SELECT Product, SUM(Quantity) AS TotalQuantity, AVG(Price) AS AveragePrice FROM Sales GROUP BY Product;
SELECT Product,SUM(Quantity) AS TotalQuantity, AVG(Price) AS AveragePrice, MIN(Price) AS MinPrice, MAX(Price) AS MaxPrice, COUNT(*) AS ProductCount FROM Sales group by Product;
CREATE TABLE Expenses (ID serial,Category varchar(30), Amount decimal(10,2));
INSERT INTO Expenses (Category, Amount) VALUES ('Salaries',3000.00), ('Electricity',100.00), ('Rent',500),('Market',1000), ('Maintenance',450.23);
SELECT * From Expenses;
SELECT Category, SUM(Expenses.Amount) AS TotalSum, AVG(Amount) AS AverageAmount FROM Expenses GROUP BY Category;
CREATE TABLE Products (ID serial, Name varchar(30),Price decimal(10,2));
INSERT INTO Products (Name, Price)
VALUES ('Product A', 10.99 ),
       ('Product B', 25.99),
       ('Product C', 5.99);
SELECT MIN(Price) AS MinPrice,  MAX(Price) AS MaxPrice FROM Products;
CREATE TABLE Students (
  ID serial,
  First_Name varchar(30),
  Last_Name varchar (30)
);
CREATE TABLE Grades (
  ID serial,
  StudentID integer,
  Grade decimal
);
INSERT INTO Students (First_Name, Last_Name)
VALUES ('Anar', 'Mahmudov'),
       ('Resad', 'Agayev'),
       ('Nergiz', 'Celilli'),
       ('Deniz', 'Memmedova'),
       ('Asif', 'Aliyev');

INSERT INTO Grades (StudentID, Grade)
VALUES (1, 85),
       (2, 99),
       (3, 48),
       (4, 88),
       (5, 50);



 CREATE TABLE MaleStudents (
  ID serial,
  First_Name varchar(30),
  Last_Name varchar (30),
  Grade INTEGER
);

CREATE TABLE FemaleStudents (
  ID serial,
  First_Name varchar(30),
  Last_Name varchar (30),
  Grade INTEGER
);
INSERT INTO MaleStudents ( First_Name,Last_Name ,Grade )
VALUES ('Anar','Rehberov',56),
       ('Vasif','Rehberov',67),
       ('Ali','Aliyev',78),
        ('Ali','Sadigov',67);
INSERT INTO FemaleStudents( First_Name,Last_Name ,Grade )
VALUES ('Nigar','Memmedli',98),
       ('Sabina','Tanriverdiyeva',100),
       ('Aysu','Hasanli',87),
        ('Fidan','Sadigova',47);

SELECT First_Name FROM MaleStudents
EXCEPT
SELECT First_Name FROM FemaleStudents;

SELECT First_Name FROM MaleStudents
UNION
SELECT First_Name FROM FemaleStudents;

SELECT First_Name FROM MaleStudents
INTERSECT
SELECT First_Name FROM FemaleStudents;
