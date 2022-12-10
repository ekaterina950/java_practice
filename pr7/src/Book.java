public class Book implements Printable {
    String name;


    public Book(String nameBook) {
        this.name = nameBook;

    }

    @Override
    public void print() {
        System.out.println("Name of book: "+name);

    }
    public static void PrintBooks(Printable[] printable){
        for(Printable a:printable ){
            if (a instanceof Book){
                a.print();

            }
        }
    }
}