mysql> create database Assignment;
Query OK, 1 row affected (0.97 sec)

mysql> use Assignment;
Database changed

create table customers(AccountNumber int, CustomerFirstName varchar(255), CustomerLastName varchar(255), CustomerNumber int, OpeningDate date);
Query OK, 0 rows affected (1.23 sec)
mysql> desc customersdetails
    -> ;
+-------------------+--------------+------+-----+---------+-------+
| Field             | Type         | Null | Key | Default | Extra |
+-------------------+--------------+------+-----+---------+-------+
| AccountNumber     | int          | YES  |     | NULL    |       |
| CustomerFirstName | varchar(255) | YES  |     | NULL    |       |
| CustomerLastName  | varchar(255) | YES  |     | NULL    |       |
| CustomerNumber    | int          | YES  |     | NULL    |       |
| OpeningDate       | date         | YES  |     | NULL    |       |
+-------------------+--------------+------+-----+---------+-------+
5 rows in set (0.15 sec)
 
mysql> insert into customers(AccountNumber, CustomerFirstName, CustomerLastName, CustomerNumber, OpeningDate) Values(10, 'Naveen', 'Reddy',1 , '2020-09-28');
Query OK, 1 row affected (0.17 sec)

mysql> insert into customers(AccountNumber, CustomerFirstName, CustomerLastName, CustomerNumber, OpeningDate) Values(10, 'Naveen', 'Reddy',1 , '2020-09-28');
Query OK, 1 row affected (0.07 sec)

mysql> insert into customers(AccountNumber, CustomerFirstName, CustomerLastName, CustomerNumber, OpeningDate) Values(11, 'Nani', 'Reddy',2 , '2020-09-28');
Query OK, 1 row affected (0.09 sec)

mysql> insert into customers(AccountNumber, CustomerFirstName, CustomerLastName, CustomerNumber, OpeningDate) Values(12, 'Naga', 'sai',3 , '2020-09-28');
Query OK, 1 row affected (0.19 sec)

mysql> select * from customers;
+---------------+-------------------+------------------+----------------+-------------+
| AccountNumber | CustomerFirstName | CustomerLastName | CustomerNumber | OpeningDate |
+---------------+-------------------+------------------+----------------+-------------+
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |
|            11 | Nani              | Reddy            |              2 | 2020-09-28  |
|            12 | Naga              | sai              |              3 | 2020-09-28  |
+---------------+-------------------+------------------+----------------+-------------+
4 rows in set (0.09 sec)
mysql> select * from customers order by OpeningDate;
+---------------+-------------------+------------------+----------------+-------------+
| AccountNumber | CustomerFirstName | CustomerLastName | CustomerNumber | OpeningDate |
+---------------+-------------------+------------------+----------------+-------------+
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |
|            11 | Nani              | Reddy            |              2 | 2020-09-28  |
|            12 | Naga              | sai              |              3 | 2020-09-28  |
+---------------+-------------------+------------------+----------------+-------------+
4 rows in set (0.00 sec)
mysql> create table accounts(AccountNumber int, City varchar(45));
Query OK, 0 rows affected (0.71 sec)

mysql> desc accounts;
+---------------+-------------+------+-----+---------+-------+
| Field         | Type        | Null | Key | Default | Extra |
+---------------+-------------+------+-----+---------+-------+
| AccountNumber | int         | YES  |     | NULL    |       |
| City          | varchar(45) | YES  |     | NULL    |       |
+---------------+-------------+------+-----+---------+-------+
2 rows in set (0.00 sec)
insert into accounts(AccountNumber, City) values(102,'chennai');
Query OK, 1 row affected (0.09 sec)

mysql> insert into accounts(AccountNumber, City) values(10,'chennai');
Query OK, 1 row affected (0.24 sec)

mysql> insert into accounts(AccountNumber, City) values(11,'chennai');
Query OK, 1 row affected (0.19 sec)

mysql> insert into accounts(AccountNumber, City) values(12,'hyderabad');
Query OK, 1 row affected (0.17 sec)

mysql> select  * from accounts;
+---------------+-----------+
| AccountNumber | City      |
+---------------+-----------+
|           102 | chennai   |
|            10 | chennai   |
|            11 | chennai   |
|            11 | banglore  |
|            12 | hyderabad |
+---------------+-----------+
5 rows in set (0.00 sec)


mysql> select * from customers inner join accounts on customers.AccountNumber = accounts.AccountNumber;
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
| AccountNumber | CustomerFirstName | CustomerLastName | CustomerNumber | OpeningDate | AccountNumber | City      |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |            10 | chennai   |
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |            10 | chennai   |
|            11 | Nani              | Reddy            |              2 | 2020-09-28  |            11 | chennai   |
|            11 | Nani              | Reddy            |              2 | 2020-09-28  |            11 | banglore  |
|            12 | Naga              | sai              |              3 | 2020-09-28  |            12 | hyderabad |
|            11 | Rajesh            | Babu             |              4 | 2020-08-20  |            11 | chennai   |
|            11 | Rajesh            | Babu             |              4 | 2020-08-20  |            11 | banglore  |
|            11 | Rajesh            | Babu             |              4 | 2020-08-21  |            11 | chennai   |
|            11 | Rajesh            | Babu             |              4 | 2020-08-21  |            11 | banglore  |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
9 rows in set (0.00 sec)

mysql> select * from customers inner join accounts on customers.AccountNumber = accounts.AccountNumber order by CustomerNumber;
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
| AccountNumber | CustomerFirstName | CustomerLastName | CustomerNumber | OpeningDate | AccountNumber | City      |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |            10 | chennai   |
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |            10 | chennai   |
|            11 | Nani              | Reddy            |              2 | 2020-09-28  |            11 | chennai   |
|            11 | Nani              | Reddy            |              2 | 2020-09-28  |            11 | banglore  |
|            12 | Naga              | sai              |              3 | 2020-09-28  |            12 | hyderabad |
|            11 | Rajesh            | Babu             |              4 | 2020-08-20  |            11 | chennai   |
|            11 | Rajesh            | Babu             |              4 | 2020-08-20  |            11 | banglore  |
|            11 | Rajesh            | Babu             |              4 | 2020-08-21  |            11 | chennai   |
|            11 | Rajesh            | Babu             |              4 | 2020-08-21  |            11 | banglore  |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
9 rows in set (0.00 sec)

mysql> select * from customers inner join accounts on customers.AccountNumber = accounts.AccountNumber where OpeningDate > '2020-08-29';
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
| AccountNumber | CustomerFirstName | CustomerLastName | CustomerNumber | OpeningDate | AccountNumber | City      |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |            10 | chennai   |
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |            10 | chennai   |
|            11 | Nani              | Reddy            |              2 | 2020-09-28  |            11 | chennai   |
|            11 | Nani              | Reddy            |              2 | 2020-09-28  |            11 | banglore  |
|            12 | Naga              | sai              |              3 | 2020-09-28  |            12 | hyderabad |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
5 rows in set (0.00 sec)

mysql> select * from customers inner join accounts on customers.AccountNumber = accounts.AccountNumber where OpeningDate > '2020-08-21' order by CustomerNumber;
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
| AccountNumber | CustomerFirstName | CustomerLastName | CustomerNumber | OpeningDate | AccountNumber | City      |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |            10 | chennai   |
|            10 | Naveen            | Reddy            |              1 | 2020-09-28  |            10 | chennai   |
|            11 | Nani              | Reddy            |              2 | 2020-09-28  |            11 | chennai   |
|            11 | Nani              | Reddy            |              2 | 2020-09-28  |            11 | banglore  |
|            12 | Naga              | sai              |              3 | 2020-09-28  |            12 | hyderabad |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
5 rows in set (0.00 sec)

mysql> select count(CustomerNumber) as Count_CustomerNumber from customers where CustomerNumber not in (select CustomerNumber from accounts);
+----------------------+
| Count_CustomerNumber |
+----------------------+
|                    0 |
+----------------------+
1 row in set (0.04 sec)