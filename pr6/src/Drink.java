public class Drink implements Priceable{
    double price;

    public Drink(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
