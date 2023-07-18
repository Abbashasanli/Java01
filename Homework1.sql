create database lesson28;

CREATE TABLE Products (
  ProductID SERIAL PRIMARY KEY,
  Name VARCHAR(50),
  Price DECIMAL(5, 2),
  Quantity INT,
  Description VARCHAR(50),
  CategoryID INT,
  FOREIGN KEY (CategoryID) REFERENCES Categories(CategoryID)
);


CREATE TABLE Categories (
  CategoryID SERIAL PRIMARY KEY,
  Name VARCHAR(50)
);


CREATE TABLE Customers (
  CustomerID SERIAL PRIMARY KEY,
  FirstName VARCHAR(50),
  LastName VARCHAR(50),
  Address VARCHAR(50),
  Email VARCHAR(50),
  PhoneNumber VARCHAR(20)
);


CREATE TABLE Orders (
  OrderID SERIAL PRIMARY KEY,
  CustomerID INT,
  OrderDate DATE,
  FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);


CREATE TABLE OrderDetails (
  OrderDetailID SERIAL PRIMARY KEY,
  OrderID INT,
  ProductID INT,
  Quantity INT,
  FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
  FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

SELECT * FROM Products;

SELECT * FROM Categories;

SELECT * FROM Customers;

SELECT * FROM Orders;

SELECT * FROM OrderDetails;

SELECT * FROM Products WHERE ProductID = 3;

SELECT * FROM Products WHERE CategoryID = 2;

SELECT * FROM Customers WHERE CustomerID = 1;

SELECT * FROM Orders WHERE CustomerID =1;

SELECT * FROM OrderDetails WHERE OrderID = 4;

UPDATE Products SET Price = 200 WHERE ProductID = 1;

INSERT INTO Products (Name, Price, Quantity, Description, CategoryID)
VALUES ('Bike', 100, 20, 'for riding', 2);

DELETE FROM Products WHERE ProductID = 2;

