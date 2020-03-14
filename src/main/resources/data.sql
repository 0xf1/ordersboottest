insert into CUSTOMER (ADDRESS, NAME) values ('Address 1', 'customer 1');
insert into CUSTOMER (ADDRESS, NAME) values ('Address 2', 'customer 2');
insert into CUSTOMER (ADDRESS, NAME) values ('Address 3', 'customer 3');

insert into PRODUCT (NAME, PRICE) VALUES ('Product 1', 100);
insert into PRODUCT (NAME, PRICE) VALUES ('Product 2', 20);
insert into PRODUCT (NAME, PRICE) VALUES ('Product 3', 15);

insert into ORDERS (CUSTOMER_ID) values (1);
insert into ORDER_DETAILS (AMOUNT, ORDER_ID, PRICE, PRODUCT_ID, QUANTITY) values (100,0,100,1,1);
insert into ORDER_DETAILS (AMOUNT, ORDER_ID, PRICE, PRODUCT_ID, QUANTITY) values (80,0,20,2,4);


