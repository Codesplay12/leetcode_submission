# Write your MySQL query statement below

select name as Customers from Customers c left outer join Orders O on c.id = O.customerId where O.id is null

