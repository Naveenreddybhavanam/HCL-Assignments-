mysql> create table People(Name varchar(255), City varchar(255), Hobby varchar(255));
Query OK, 0 rows affected (1.48 sec)

mysql> insert into People(Name,City,Hobby) values('Nani','NRT','songs');
Query OK, 1 row affected (0.16 sec)

mysql> insert into People(Name,City,Hobby) values('Naveen','NRT','songs');
Query OK, 1 row affected (0.19 sec)

mysql> insert into People(Name,City,Hobby) values('sai','GNT','Reading');
Query OK, 1 row affected (0.18 sec)

mysql> select * from People;
+--------+------+---------+
| Name   | City | Hobby   |
+--------+------+---------+
| Nani   | NRT  | songs   |
| Naveen | NRT  | songs   |
| sai    | GNT  | Reading |
+--------+------+---------+

 insert into People(Name,City,Hobby) values('sandy','chennai','Watching Tv');
Query OK, 1 row affected (0.30 sec)

mysql> select * from People;
+--------+---------+-------------+
| Name   | City    | Hobby       |
+--------+---------+-------------+
| Nani   | NRT     | songs       |
| Naveen | NRT     | songs       |
| sai    | GNT     | Reading     |
| sandy  | chennai | Watching Tv |
+--------+---------+-------------+
4 rows in set (0.00 sec)
3 rows in set (0.00 sec)

mysql> Select count(City) from People where City='Chennai';
+-------------+
| count(City) |
+-------------+
|           1 |
+-------------+
1 row in set (0.04 sec)

mysql> select count(City) AS City_Count from People where City='Chennai';
+------------+
| City_Count |
+------------+
|          1 |
+------------+
1 row in set (0.00 sec)