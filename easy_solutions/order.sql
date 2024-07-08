SELECT name as Customers
FROM Customers
Where id not in (
    SELECT customerId
    From Orders
);
