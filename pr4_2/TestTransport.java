public class TestTransport {
    public static void main(String[] args){
        System.out.println("\nна машине");
        Transport obj = new Car(100, 3, 5);
        obj.getPriceGoods();
        obj.getPricePass();
        obj.getTimePath();
        System.out.println("\nна самолете");
        Transport obj1 = new Plane(100, 3, 5);
        obj1.getPriceGoods();
        obj1.getPricePass();
        obj1.getTimePath();
        System.out.println("\nна поезде");
        Transport obj2 = new Train(100, 3, 5);
        obj2.getPriceGoods();
        obj2.getPricePass();
        obj2.getTimePath();
        System.out.println("\nна корабле");
        Transport obj3 = new Ship(100, 3, 5);
        obj3.getPriceGoods();
        obj3.getPricePass();
        obj3.getTimePath();
    }
}
