create table CUSTOMER
(
	ID INTEGER identity
		primary key,
	ADDRESS VARCHAR(255),
	NAME VARCHAR(255)
);

create table ORDERS
(
	ID INTEGER identity		primary key,
	CUSTOMER_ID INTEGER
		constraint FK624GTJIN3PO807J3VIX093TLF
			references CUSTOMER
);

create table PRODUCT
(
	ID INTEGER identity
		primary key,
	NAME VARCHAR(255),
	PRICE DOUBLE
);

create table ORDER_DETAILS
(
    ID INTEGER identity
        primary key,
    AMOUNT DOUBLE not null,
    ORDER_ID INTEGER
        constraint FKJYU2QBQT8GNVNO9OE9J2S2LDK
            references ORDERS,
    PRICE DOUBLE not null,
    PRODUCT_ID INTEGER,
    QUANTITY DOUBLE not null
);

