// Existing third-party Temperature class (adaptee)
class Temperature {
    private double temperatureInFahrenheit;

    public Temperature(double temperatureInFahrenheit) {
        this.temperatureInFahrenheit = temperatureInFahrenheit;
    }

    public double getTemperatureInFahrenheit() {
        return temperatureInFahrenheit;
    }
}

// Target interface expected by the client
interface CelsiusTemperature {
    double getTemperatureInCelsius();
}

// Adapter class that composes the Temperature class
class CelsiusTemperatureAdapter implements CelsiusTemperature {
    private Temperature temperature;

    public CelsiusTemperatureAdapter(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperatureInCelsius() {
        // Convert Fahrenheit to Celsius and adapt the result
        return (temperature.getTemperatureInFahrenheit() - 32) * 5 / 9;
    }
}

// Client code using the new system with CelsiusTemperature interface
public class CompositionStyleAdapterClient {
    public static void main(String[] args) {
        // Using the existing Temperature class through the adapter
        Temperature temperatureInFahrenheit = new Temperature(32.0);
        CelsiusTemperature celsiusTemperatureAdapter = new CelsiusTemperatureAdapter(temperatureInFahrenheit);

        // Now, the existing Temperature class is used as a CelsiusTemperature
        System.out.println("Temperature in Celsius: " + celsiusTemperatureAdapter.getTemperatureInCelsius());
    }
}
