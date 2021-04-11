`select host, user from mysql.user;`

`show tables;`

`show databases;`
#### Grant all privileges to a user from all hosts
`GRANT ALL PRIVILEGES ON database_name.* TO 'username'@'%';`
#### Switch user
`SYSTEM mysql -u user -p;`
#### Switch to a database
`use 'database_name';`

#### 
`docker exec -it todo_database mysql --password='root_password'`

#### Show info about a table
`DESCRIBE my_table;`



