public class Celsius implements Convertable {
    double celsius;

    public Celsius(double celsius) {
        this.celsius = celsius;
    }


    @Override
    public double toKelvin() {
        return celsius + 273.15;
    }

    @Override
    public double toFahrenheit() {
        return celsius * 1.8 + 32;
    }

    @Override
    public double toCelsius() {
        return celsius;
    }
}
