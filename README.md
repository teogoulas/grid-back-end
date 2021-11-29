### Configure local environment
In the folder [dockers](./dockers) there is everything you need to run a MariaDB and deploy the application. Copy the *dockers* folder to your ubuntu vm using `scp /path/to/dockers/folder remote_user@remote_host:/path/to/remote/folder`, then connect to the vm using `ssh user@<remote_host>` and in the *dockers* folder run `docker-compose up -d`. The above command will create an empty mysql. You can see the connection details in the [docker-compose.yml](./dockers/docker-compose.yml) .

Inside the [mysql](./dockers/mysql) folder you will find [create_db.sql](./dockers/mysql/create_db.sql) script, which creates the database.
You can execute all the above scripts by running `cd mysql && sh entrypoint.sh`




