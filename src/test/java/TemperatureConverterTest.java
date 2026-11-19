import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    void celsiusToFahrenheit_zeroCelsius_returns32() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.0001);
    }

    @Test
    void fahrenheitToCelsius_212Fahrenheit_returns100() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), 0.0001);
    }
}
