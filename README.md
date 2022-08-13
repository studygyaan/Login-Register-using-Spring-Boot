# Login Register Example For Spring Boot,

### Thymeleaf, Maven or Gradle, PostgreSQL or MySQL, JPA, Spring Security, SecurityFilterChain

In this project, we are using 2 types of roles - ADMIN and USER, for adding more roles check `Role.java`

Learn to Implement this project: [Tutorial - Login Register in Spring Boot](https://studygyaan.com/spring-boot/login-register-example-using-spring-boot)

application.properties (change database settings)
```
#-------------------- server properties ---------------
server.port=8080
server.error.include-message=always

#--------------------- Logging ------------------
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type=TRACE
logging.level.org.springframework.web=DEBUG
logging.level.org.hibernate=ERROR

#--------------------- DB Connection ------------------
spring.datasource.url=jdbc:postgresql://localhost:5432/demo
spring.datasource.username=demo
spring.datasource.password=password

#--------------------JPA-ORM Properties-----------------
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true
```

Spring Security *SecurityFilterChain* : [How to Fix WebSecurityConfigurerAdapter Deprecated](https://studygyaan.com/spring-boot/solve-websecurityconfigureradapter-deprecated)
