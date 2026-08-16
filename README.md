\# RestAssured API Testing Automation Framework



A Java-based API automation testing framework built using \*\*Rest Assured, TestNG, Maven, Log4j2, and ExtentReports\*\*.



This project automates CRUD operations on the GoRest Users API and demonstrates API request handling, response validation, assertions, logging, reporting, random test data generation, and Maven-based execution.



\---



\##  Tech Stack



\- Java 17

\- Rest Assured 6.0.1

\- TestNG 7.12.0

\- Maven

\- Log4j2

\- ExtentReports

\- JSON Simple

\- Git \& GitHub



\---



\##  API Under Test



\*\*GoRest API\*\*



Base URL:



`https://gorest.co.in/public/v2/users`



The framework uses the `/users` endpoint to perform GET, POST, PUT, and DELETE operations.



\---



\##  Test Cases



The framework contains five main API test classes.



\### TC001 - Get All Employees



`TC001\_Get\_All\_Employees\_Data.java`



Tests the retrieval of all employee/user records.



Validations include:



\- Response body

\- Status code

\- Response time

\- Content type

\- Server type

\- Content encoding



\---



\### TC002 - Get Single Employee



`TC002\_Get\_Single\_Employee\_Record.java`



Tests retrieval of a single employee/user record.



Validations include:



\- Response body

\- Status code

\- Response time

\- Response headers



\---



\### TC003 - Create New Employee



`TC003\_Post\_New\_Record.java`



Tests creation of a new employee/user using a POST request.



Features:



\- Generates random employee name

\- Generates random employee email

\- Creates JSON request body

\- Sends authorization token through environment variable

\- Validates response

\- Validates status code

\- Validates response headers

\- Validates response time



\---



\### TC004 - Update Employee



`TC004\_Put\_Employee\_Record.java`



Tests updating an existing employee/user using a PUT request.



The test first retrieves an employee ID from the API response and then uses that ID to perform the update.



Features:



\- Generates updated random employee data

\- Creates JSON request body

\- Sends authorization token through environment variable

\- Validates response

\- Validates status code

\- Validates response headers

\- Validates response time



\---



\### TC005 - Delete Employee



`TC005\_Delete\_Employee\_Record.java`



Tests deletion of an employee/user using a DELETE request.



The test retrieves an employee ID and then performs the DELETE operation using that ID.



Validations include:



\- Response

\- Status code

\- Response time

\- Response headers



\---



\##  Project Structure



```text

RestAssured\_APITesting\_project

│

├── .mvn/

│

├── src/

│   └── test/

│       ├── java/

│       │   ├── employeeApiBase/

│       │   │   └── TestBase.java

│       │   │

│       │   ├── employeeApiTestCases/

│       │   │   ├── TC001\_Get\_All\_Employees\_Data.java

│       │   │   ├── TC002\_Get\_Single\_Employee\_Record.java

│       │   │   ├── TC003\_Post\_New\_Record.java

│       │   │   ├── TC004\_Put\_Employee\_Record.java

│       │   │   └── TC005\_Delete\_Employee\_Record.java

│       │   │

│       │   └── employeeApiUtilities/

│       │       ├── Listeners.java

│       │       └── RandomEmployeeGenerateUtils.java

│       │

│       └── resources/

│           └── log4j2.properties

│

├── Test-Documentation/

│   └── RestAssured\_API\_Test\_Cases.xlsx

│

├── .gitignore

├── pom.xml

├── testng.xml

└── README.md

