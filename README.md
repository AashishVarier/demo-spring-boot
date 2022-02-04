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
- pending	
	- Testing {to try out TDD with JUnit5 + Mockito }
	- Documentation {Spring REST Docs}
	- Thymeleaf
