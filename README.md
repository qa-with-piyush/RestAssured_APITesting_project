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


---

## Framework Components

### TestBase

The `TestBase` class contains common API configuration and reusable setup required by the test cases.

It helps maintain common configuration in one place instead of duplicating it across individual test classes.

---

### Rest Assured

Rest Assured is used to:

- Build and send API requests
- Handle HTTP methods
- Validate API responses
- Validate status codes
- Validate response headers
- Validate response time
- Extract data from responses

---

### TestNG

TestNG is used as the test execution framework.

The project uses:

- `@Test`
- TestNG annotations
- TestNG XML
- Assertions
- TestNG listeners

---

### Log4j2

Log4j2 is implemented for execution logging.

Logs help track:

- Test execution
- API operations
- Test status
- Errors and failures
- Debugging information

---

### ExtentReports

ExtentReports is used to generate detailed HTML execution reports.

The reports provide information about:

- Test execution status
- Passed tests
- Failed tests
- Test execution details

---

### Listeners

TestNG listeners are implemented to capture test execution events and integrate reporting functionality.

---

### Random Test Data

`RandomEmployeeGenerateUtils` is used to generate random employee/user data for API requests.

This helps avoid using the same static test data for every execution.

---

## API Authentication

Authentication is required for operations such as creating and updating users.

The authorization token is passed through an environment variable instead of hardcoding the token directly into the source code.

This helps prevent sensitive authentication information from being exposed in the source code or GitHub repository.

---

## API Validations

The framework performs validations such as:

- Response body validation
- HTTP status code validation
- Response time validation
- Response header validation
- Content type validation
- Content encoding validation
- Server information validation

---

## Maven Execution

The project uses Maven for dependency management and test execution.

To execute the complete test suite:

```bash
mvn clean test
├── testng.xml

└── README.md

Maven compiles the project and executes the TestNG test suite.

TestNG Execution

The complete test suite can also be executed using:

testng.xml

The TestNG suite contains the API test classes required for execution.

Reporting

The framework uses ExtentReports and TestNG reporting capabilities to provide execution results.

Reports help identify:

Passed tests
Failed tests
Test execution details
API validation results
Logging

Log4j2 is used for execution logging.

The logging mechanism helps track:

Test execution flow
API operations
Test results
Errors
Debugging information
Git & GitHub

Git and GitHub are used for:

Version control
Source code management
Tracking project changes
Repository management
Key Features
REST API automation using Rest Assured
CRUD API testing
GET, POST, PUT and DELETE operations
TestNG test execution
Maven dependency management
Reusable base class
TestNG listeners
Log4j2 logging
ExtentReports reporting
Random test data generation
Environment-variable based API authentication
Response body validation
Status code validation
Response header validation
Response time validation
Git and GitHub integration
Skills Demonstrated

This project demonstrates practical knowledge of:

API Testing
REST API Automation
Rest Assured
Java
TestNG
Maven
JSON
HTTP methods
API authentication
API response validation
Logging
Test reporting
Test automation framework design
Git and GitHub
Author

Piyush Bhagchandani

QA / Test Automation Engineer
