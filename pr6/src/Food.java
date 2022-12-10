public class Food implements Priceable {
    double Price;

    public Food(double price) {
        Price = price;
    }

    @Override
    public double getPrice() {
        return Price;
    }
}
