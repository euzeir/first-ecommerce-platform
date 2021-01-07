CREATE TABLE user(
userId serial primary key,
userName varchar(50) not null,
userSurname varchar(50) not null,
userEmail varchar(50) not null,
userBirthday Date not null,
userCreationDate DateTime not null,
userLastModificationDate DateTime not null
);

CREATE TABLE item(
itemId serial primary key,
itemName varchar(50) not null,
itemDescription varchar(200) not null,
itemPrice int not null,
itemCategory varchar(50) not null,
itemCreationDate DateTime not null,
itemLastModificationDate DateTime not null
);

CREATE TABLE orders(
userId int not null references user(userId),
itemId int not null references item(itemId), 
itemName varchar(50) not null,
itemSubtotalPrice int not null,
itemQuantity int not null,
orderTotalPrice int not null,
orderCreationDate DateTime not null,
orderLastModificationDate DateTime not null
);

CREATE TABLE userOrders
(
    userId integer NOT NULL REFERENCES user (userId),
    orderId integer NOT NULL REFERENCES orders (orderId)
);

-- insertion
INSERT INTO user (userId,userName,userSurname,userEmail,userBirthday,userCreationDate,userLastModificationDate)
VALUES (1,'Sergio','Becker','sergio.becker@abc.it','1990-12-01','2020-04-12 22:32:22', '2021-04-22 03:32:22'),
       (2,'James','Lowrey','james.lowery@abc.it','2000-01-23','2012-12-11 21:02:12', '2020-04-12 22:32:22'),
       (3,'Gloria','Franklin','gloria.franklin@abc.it','2001-08-22','2016-12-11 21:02:12', '2020-12-11 21:02:12'),
       (4,'Lori','Vanhoose','lori.vanhoose','1999-09-12','2017-12-11 01:02:12', '2021-12-11 21:02:12');

INSERT INTO item (itemId,itemName,itemDescription,itemPrice,itemCategory,itemCreationDate,itemLastModificationDate)
VALUES (1,'Dell','Desktop Computer','2000','HW','2020-04-12 22:32:22', '2021-04-22 03:32:22'),
       (2,'Cisco','Router','100','HW','2012-12-11 21:02:12', '2020-04-12 22:32:22'),
       (3,'IntelliJ','Development IDE','200','SW','2016-12-11 21:02:12', '2020-12-11 21:02:12'),
       (4,'Python','Programming Language','0','SW','2017-12-11 01:02:12', '2021-12-11 21:02:12');

INSERT INTO orders (userId,itemId,itemName,itemSubtotalPrice,itemQuantity,orderTotalPrice, orderCreationDate, orderLastModificationDate)
VALUES (2, 3, 'Dell', '6000', '2', '6400', '2020-04-12 22:32:22', '2021-04-22 03:32:22'),
	   (2, 1, 'Cisco', '200', '2', '6400','2020-04-12 22:32:22', '2021-04-22 03:32:22');
