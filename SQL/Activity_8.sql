---Activity 8

select customer_id, MAX(purchase_amount) as max_orderss from Orders GROUP BY customer_id;

select salesman_id, MAX(purchase_amount) as max_orderss from orders where order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id;

select customer_id, order_date, MAX(purchase_amount) as max_orderss from Orders 
GROUP BY customer_id, order_date
having MAX(purchase_amount) IN (2030, 3450, 5760, 6000);