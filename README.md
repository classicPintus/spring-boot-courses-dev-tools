# spring-boot-elk
This project is to demonstrate how to check if dev tools works

## pre-requisites
- Java

## How to try it
1. Debug the application
2. Execute curl localhost:8080/dummyString
3. Change the String returned by DummyRestController::getDummyString
4. After some seconds we'll se a log that inform the application is updated
5. Execute curl localhost:8080/dummyString
6. Now you will see a different response

## If you have IntelliJ
Sometimes it doesn't works. In order to make working this solution set "Update classes and resources" in the run configuration in the "On update action"
