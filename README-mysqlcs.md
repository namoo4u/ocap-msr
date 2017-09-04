

Assess Rule
make the public access to 3306 Enabled

Login Mysql Server
```
$ ssh opc@mysqlcs_ip -i publickey
$ sudo -s
$ su - oracle
$ mysql -u root --password

mysql> CREATE USER 'msrdb'@'%' IDENTIFIED BY 'KimKyudong1!';
mysql> GRANT ALL PRIVILEGES ON *.* TO 'msrdb'@'%' WITH GRANT OPTION;

``` 