# Write your MySQL query statement below
Select p.product_name, s.year, s.price from Sales s INNER JOIN Product p ON p.product_id=s.product_id