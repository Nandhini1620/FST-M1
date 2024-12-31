---Activity 7
select SUM(purchase_amount) AS "sum_orders" from orders;
select AVG(purchase_amount) AS "avg_orders" from orders;
select MAX(purchase_amount) AS "max_order" from orders;
select MIN(purchase_amount) AS "min_order" from orders;
select count(salesman_id) AS "count_salesman" from orders;

