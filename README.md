Name_Search_API
==================

This is a sample Java / Maven / Spring Boot (version 2.0.0 SNAPSHOT) microservice for person search.

----------

How to run
-------------

- Clone this repository
- Make sure you are using JDK 1.8 and Maven 3.x
- You can build the project by running mvn clean package
- Once successfully built, you can run the service by one of this method:

        mvn spring-boot:run -Drun.arguments="spring.profiles.active=test"
       
Once the application runs you should see something like this:

- 2018-01-07 14:43:04.073  INFO 1768 --- [  restartedMain] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080  (http)
- 2018-01-07 14:43:04.086  INFO 1768 --- [  restartedMain] m.n.s.NameSearch.NameSearchApplication   : Started NameSearchApplication in 21.831 seconds (JVM running for 24.316)

About the service
-------------

The service is just a simple person search REST service. It uses an in-memory database (H2) to store the data. You can also do with a relational database like MySQL or PostgreSQL. If your database connection properties work, you can call a REST endpoint defined in ma.novelis.spring.NameSearch.restController.PersonRestController on port 8080. (see below)


You can use this sample service to retrieve a person from database without known his complete name. (see below)

#### <i class="icon-file"></i> Here the endpoint you can call :

Retrieve all persons whose their names contain the keyword Karim. 
http://localhost:8080/persons/Karim

----------


About Spring boot
-------------------

Spring Boot is an framework that makes it easy to create new RESTful services (among other types of applications). It provides many of the usual Spring facilities that can be configured easily usually without any XML. In addition to easy set up of Spring Controllers, Spring Data, etc.

To view your H2 in-memory datbase
-------------

The 'test' profile runs on H2 in-memory database. To view and query the database you can browse to http://localhost:8080/h2-console. Default username is 'sa' with a blank password. Make sure you disable this in your production profiles.

### Person table

| Id   | Nom     | Prénom  |
| ---- | ------- | ------- |
| 1    | Karimi  |  Khalid |
| 2    | Lassri  |  Karim  |
| 3    | Karam   |  Siham  |
