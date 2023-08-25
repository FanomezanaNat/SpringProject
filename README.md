# Tuition Fee Management

This tuition fee management project is developed using the Spring Framework with the JDBC PostgreSQL driver. It allows for the management of student tuition fees by associating fees with students and providing features to add, edit, delete, and view fees.

## Prerequisites
Before getting started with this project, make sure you have the following installed:

- Java Development Kit (JDK) 17 or higher
- Apache Maven
- PostgreSQL (with the necessary database and tables)
- A Java IDE (such as IntelliJ IDEA or Eclipse)

## Project Structure

The project follows a standard Spring project structure:

- **Controller**: Contains the web controllers that handle HTTP requests and responses.
- **Database Configuration**: Stores configuration settings for the PostgreSQL database connection.
- **Entity**: Defines the data entities, such as `Fee` and `Student`, as Java classes.
- **Repository**: Contains the data access layer with repository interfaces for database operations.
- **Service**: Contains the business logic and services used by the controllers.

## Creating the Database and Tables

To set up the required database for this project and create the tables, follow these steps:

1. Ensure you have PostgreSQL installed and running.

2. Create a database named `springproject`.

3.  open the `schema.sql` file located in the `src/main/resources` directory.

4.  built the database with  `schema.sql`

5. After executing the script, the database will be configured with the necessary tables, ready to be used by the application.

Ensure that the database connection parameters in the `src/main/resources/application.properties` and
`src/main/com.hei.springproject/DatabaseConfiguration/setting.java `file match your PostgreSQL configuration.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/springproject
spring.datasource.username=your_username
spring.datasource.password=your_password
```

```java
public class Settings {
    public static  String DATABASE = "springproject";
    public static  String USERNAME = "your_username";
    public static  String PASSWORD = "your_password";
}

```
## OpenAPI Specification

The OpenAPI Specification (formerly known as Swagger) for this Spring project is located in the `src/main/specification` directory. This specification provides detailed documentation for the project's REST API endpoints.

To access and explore the API documentation:

1. Navigate to the `src/main/specification` directory in your project.

2. Open the OpenAPI Specification file, typically named `openapi.yaml` or `swagger.yaml`, using your preferred text editor or API documentation tool.

3. You can also view the API documentation using Swagger UI. Run your project and access Swagger UI at [Swagger UI Documentation](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/FanomezanaNat/SpringProject/main/src/main/specification/Tuition%20management.yaml) in a web browser.







