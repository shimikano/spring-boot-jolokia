spring-boot-jolokia
===================

Steps to reproduce an invalid object name error when executing an operation in j4psh against a Spring Boot Jolokia server.

1. Compile the sources:

  ```
  mvn compile
  ```  

2. Run the server:
  
  ```
  mvn exec:java
  ```  
  
  Verify that Jolokia is running, e.g., by GETting http://localhost:8080/jolokia.

3. Launch j4psh:

  ```
  j4psh http://localhost:8080/jolokia
  ```

4. Execute a JMX operation:

  ```
  [localhost:8080] : cd java.lang
  [localhost:8080 java.lang] : cd type=Memory 
  [localhost:8080 java.lang:type=Memory] : exec gc
  java.lang.IllegalArgumentException : Invalid object name. Key properties cannot be empty
  ```
