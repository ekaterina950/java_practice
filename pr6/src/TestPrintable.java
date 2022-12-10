public class TestPrintable {
    public static void main(String[] args) {
        Printable[] printables=new Printable[5];
        Book obj1=new Book("1984");
        Magazine obj2=new Magazine("ElleGirl");

        obj1.print();
        obj2.print();
    }
}
