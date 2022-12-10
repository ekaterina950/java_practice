public class TestPriceable {
    public static void main(String[] args) {
        Food obj1 =new Food(2000);
        Drink obj2=new Drink(150);
        System.out.println("Цена еды: "+obj1.getPrice()
                +"\nЦена напитка: "+obj2.getPrice());
    }
}
