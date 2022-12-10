import java.util.Scanner;

public class TestConvertable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type temp in Celsius: ");
        Celsius temperature = new Celsius(scanner.nextDouble());

        System.out.println("Temp in Celsius: " + temperature.toCelsius() + " °C");
        System.out.println("Тemp in Fahrenheit: " + temperature.toFahrenheit() + " °F");
        System.out.println("Temp in Kelvin: " + temperature.toKelvin() + " K");

    }
}
