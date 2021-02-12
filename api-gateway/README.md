# Microservices

## What are microservices

A microservice is an **engineering approach** focused on decomposing applications into **single-function modules** with **well-defined interfaces** which are **independently deployed and operated** by small teams who own the entire lifecycle of the service.

## How Spring Cloud helps to build architecture

Spring Cloud provides a set of features to quickly build microservices. It’s very smart to know how to get them working together, can quickly setup services, with minimal configurations.

### Important components

* **service registration and discovery (Eureka)**
  * avoid hardcoded IP addresses
  * spin up multiple instances of microservices
* circuit breakers (Hystrix)
  * service is down (for example, the computer blow up!), and you want to handle the situation
* **gateways and reverse proxies (Zuul)**
  * call a service from the browser
  * provide a single entry point to the entire architecture
  * authentication, authorization
* logging and log tracing
* monitoring
* authentication
* etc.

### Extra

* **automatic API documentation with Swagger (OpenAPI implementation)**

## What we build

![Architecture](https://exampledriven.files.wordpress.com/2016/07/zuul-api-gateway.jpg)

## What to check out if you want to dig deeper

[Medium articles](https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-intro-to-microservices-part-1-c0d24cd422c3)

[Swagger Codegen tools](https://github.com/swagger-api/swagger-codegen)
