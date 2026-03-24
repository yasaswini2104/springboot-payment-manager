# 💳 Payment Manager Application (Spring Boot)

A simple Spring Boot application demonstrating **Dependency Injection concepts** such as `@Primary`, `@Qualifier`, `@Autowired`, `@Service`, and `@Value`.

---

## Features

* Multiple payment methods:

  * UPI (default using `@Primary`)
  * Net Banking (using `@Qualifier`)
  * Cards
* Centralized payment handling via `PaymentManager`
* REST API endpoint to trigger payments
* External configuration using `application.properties`

---

## Concepts Covered

* Dependency Injection (DI)
* Bean Management
* `@Primary` vs `@Qualifier`
* `@Autowired`
* `@Service` annotation
* `@Value` for configuration
* Spring Boot REST API (`@RestController`)

---

## Configuration

**application.properties**

```
payment.amount=5000
```

---

## How to Run

```bash
mvn clean spring-boot:run
```

---

## API Endpoint

```
GET http://localhost:8080/pay
```

### Response:

```
Payment Done!
```

### Console Output:

```
Default Payment (Primary - UPI) 
Paid 5000.0 using UPI

Net Banking Payment 
Paid 5000.0 using Net Banking
```

---

## Tech Stack

* Java 17+
* Spring Boot
* Maven