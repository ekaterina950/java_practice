public class Book implements Printable {
    String name;


    public Book(String nameBook) {
        this.name = nameBook;
    }

    @Override
    public void print() {
        System.out.println("Название книги: "+name);
    }
}
