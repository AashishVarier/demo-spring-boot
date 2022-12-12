# demo-spring-boot
### The application is to test out the following: (the codes are commented a bit too much) 
- Rest API
	- application programming interface (API or web API) that conforms to the constraints of REST architectural style and allows for interaction with RESTful web services. eg: POST (== create); GET(== Read); PUT(== update); DELETE(== delete)
- DB connectivity - 
	-  Used an embedded RDBMS called apache derby. This is not production ready, but can perform CRUD (Create Read Update Delete)  
- Logging 
	- SLF4J and logback are available by default in spring boot. Logback is a logging frameworks, while simple Logging Facade for Java (SLF4J) serves as a simple facade or abstraction for various logging frameworks allowing the end user to plug in the desired logging framework

- Monitoring
	- spring-boot-actuator : includes a number of additional features to help for monitor and manage your application when you push it to production. By default on /acuator/health enabled for v.2 

- TDD 
	- Junit as it is, is good for simple test.
	- To test conditions such as - network, database, timeout, or other I/O error conditions, Mockito is the tool which works well with JUnit 5.
	- Test Driven Dev for CRUD with JUnit5 + Mockito 
	  - Test if create happening
	  - Test if read happening
	  - Test if update happening
	  - Test if delete happening
	  
- pending	
	
	- Documentation {Spring REST Docs}
	- Thymeleaf


- TODO
	- changed crudServices to handle error. Need to check and rectify them
	- Add Mock test in crudServiceTest class