# Selenium WebDriver Singleton – Java

A clean and efficient **Singleton pattern** implementation for managing a single Selenium WebDriver instance across your entire test suite.

### Why Singleton?
- Prevents multiple browser windows from opening
- Saves memory and CPU
- Faster test execution (no repeated browser launch/close)
- Simple setup/teardown logic

## Features
- Thread-safe Singleton (double-checked locking)
- Automatic ChromeDriver management via WebDriverManager
- Browser maximized + useful default options
- Easy integration with TestNG / JUnit

## Tech Stack
- Java 8+
- Selenium 4.x
- WebDriverManager
- TestNG (optional)



## Project Structure
```
selenium-singleton-java/
├── src/
│   └── main/
│       └── java/
│           └── DriverManager.java      ← Singleton class
│           └── SimpleTest.java         ← Sample test class
├── pom.xml                             ← Maven dependencies
└── README.md
```

## Installation

1. **Prerequisites**
   - Java 8 or higher
   - Maven
   - IDE (IntelliJ IDEA / Eclipse recommended)

2. **Dependencies** (in `pom.xml`)
```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.25.0</version>
    </dependency>
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.9.2</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.10.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```
### How to run 
```
mvn test
```
