SELECT * FROM employees;
SELECT name ,email FROM  customer;
SELECT * FROM orders;
SELECT status FROM orders WHERE status='Completed';
SELECT *FROM products;
SELECT name , price FROM products WHERE category='Electronics';
SELECT * FROM sales;
SELECT SUM(revenue) AS TOTALREVENUE FROM sales;
INSERT INTO Inventory (ProductID, Quantity)
SELECT SUM (quantity) AS TOTALQUANTITY FROM inventory;
SELECT *FROM employees;
SELECT concat( firstname , '' ,lastname)FROM employees WHERE  position='Manager';
SELECT*FROM orders;
SELECT * FROM orders WHERE customerid='2';
SELECT *FROM sales;
SELECT productid,quantity FROM SALES WHERE quantity>=10;
SELECT *FROM products;
SELECT category,name FROM products ORDER BY price DESC LIMIT 1;
