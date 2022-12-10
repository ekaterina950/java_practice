public class TestBookMagazine {
    public static void main(String[] args) {
        Printable[] printables=new Printable[5];
        printables[0]=new Book("1984");
        printables[1]=new Book("War and Peace");
        printables[2]=new Magazine("VOGUE");
        printables[3]=new Book("Pride and Prejudice");
        printables[4]=new Magazine("ElleGirl");
        Book.PrintBooks(printables); // статический метод можно вызвать без создания объекта НАЗВАНИЕКЛАССА.СТАТИЧЕСКИЙМЕТОД
        Magazine.PringMagzines(printables);

    }
}
