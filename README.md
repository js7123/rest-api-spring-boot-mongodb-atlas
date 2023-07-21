# rest-api-spring-boot-mongodb-atlas
REST API implementation using Spring Boot with Spring Data and MongoDB Atlas.

## Prerequisites:

In order to run the application successfully, please provide in the src/main/resources/application.properties file the values corresponding to an existent MongoDB Atlas database username, password, cluster and database name. In that file, the following variables must be set:
```
spring.data.mongodb.uri=mongodb+srv://<db_username>:<db_password>@<cluster_name>.mongodb.net/<db_name>
spring.data.mongodb.database=<db_name>
```
where:

```  <db_username> ```= mongoDB Atlas username.

```  <db_password> ```= corresponding MongoDB Atlas password for the username provided.

```  <cluster_name> ```= cluster name.

```  <db_name> ```= MongoDB Atlas database name.


The MongoDB cluster is usually created prior to creating the MongoDB Atlas database. For details regarding cluster creation see "Create MongoDB Cluster" section in this [MongoDB](https://www.mongodb.com/docs/drivers/java/sync/current/quick-start/#add-mongodb-as-a-dependency) page.


