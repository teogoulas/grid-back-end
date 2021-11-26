docker cp create_db.sql mysqlserver:/

docker exec mysqlserver /bin/sh -c 'mysql -u root -puser </create_db.sql'

docker exec -it cardlink-sqlserver rm create_db.sql
