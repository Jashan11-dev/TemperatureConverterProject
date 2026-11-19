# TemperatureConverterProject

COMP 3520 – Software Engineering, Assignment 3.

A Java temperature converter built with Test-Driven Development (Red–Green–Refactor) using JUnit 5 and Maven.

## Methods

| Method | Formula |
|---|---|
| `celsiusToFahrenheit(double celsius)` | F = (C × 9.0 / 5.0) + 32 |
| `fahrenheitToCelsius(double fahrenheit)` | C = (F − 32) × 5.0 / 9.0 |
| `celsiusToKelvin(double celsius)` | K = C + 273.15 |

## Running the tests

```
mvn test
```

Or open the project in IntelliJ IDEA and run `TemperatureConverterTest`.
