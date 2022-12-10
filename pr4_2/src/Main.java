public class Main {
    public static void main(String[] args) {
        System.out.println("Первая фигура");
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColour());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());

        System.out.println(" ");




        System.out.println(" ");

        Shape s2 = new Rectangle(1.0, 2.0, "GREEN", true);
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getColour());
        System.out.println(s2.isFilled());

        System.out.println(" ");

        System.out.println(" ");

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColour());
        System.out.println(((Square)s4).getSide());



    }

}