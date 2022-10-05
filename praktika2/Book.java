public class Book {
    private int izdanie;
    private String author;
    private String name;

    public Book(int izdanie, String name, String author){
        this.izdanie = izdanie;
        this.name = name;
        this.author = author;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getIzdanie(){
        return izdanie;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int izdanie){
        this.izdanie = izdanie;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String toString(){
        return "izdanie: " + izdanie + " author: " + author + " name: " + name;
    }
}
