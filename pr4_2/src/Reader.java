public class Reader {
    private String fio;
    private int bilet;
    private String facultet;
    private String date;
    private long num;
    private String[] books =  {"book1","book2","book3","book4","book5","book6","book7","book8","book9","book10"};

    public Reader( String fio, int bilet, String facultet, String date, long num){
        this.fio = fio;
        this.bilet = bilet;
        this.facultet = facultet;
        this.date = date;
        this.num = num;
    }

    public void takeBook(){
        System.out.println(fio + " взял книги");
    }
    public void takeBook(int books1){
        System.out.println(fio + " взял "+ books1 + " книги");
        System.out.println(fio + " взял книги: ");
        for (int i = 0; i<books1;i++){
            System.out.println(books[i] + ", ");

        }
    }
    public void returnBook(){
        System.out.println(fio+ " вернул книги");
    }
    public void returnBook(int book){
        System.out.println(fio+" вернул "+ book + " книг");
    }
}
