import java.util.Arrays;
import java.util.Scanner;

public class BookTest {
    Book[] array;
    int n;
    int chislo;
    public BookTest(int N, int n) {
        chislo = N;
        this.n = n;
        array = new Book[N];
        Scanner in = new Scanner(System.in);
        String[] name = new String[N];
        int[] izdanie = new int[N];
        String[] author = new String[N];
        for (int i = 0; i < N; ++i) {
            System.out.println("Input name\n");
            name[i] = in.nextLine();
        }
        for (int i = 0; i < N; ++i) {
            System.out.println("Input author\n");
            author[i] = in.nextLine();
        }

        for (int i = 0; i < N; ++i) {
            System.out.println("Input izdanie\n");
            izdanie[i] = in.nextInt();
        }

        for (int i = 0; i < N; ++i) {
            array[i] = new Book(izdanie[i], name[i], author[i]);
        }

    }
    public Book EarliestBook(){
        int min = array[0].getIzdanie();
        Book b1 = array[0];
        for(int i = 0; i<array.length;i++){
            if(min>array[i].getIzdanie()){
                min = array[i].getIzdanie();
                b1 = array[i];
            }
        }
        return b1;

    }
    public Book LatestBook(){
        int max = array[0].getIzdanie();
        Book b2 = array[0];
        for(int i = 0; i<array.length;i++){
            if(max<array[i].getIzdanie()){
                max = array[i].getIzdanie();
                b2 = array[i];
            }
        }
        return b2;

    }
    public static void main(String[] args){
        BookTest book = new BookTest(7,3);
        System.out.println(book.LatestBook().toString());
        book.Sorted();
    }
    public void Sorted(){
        Book[] book1 = new Book[chislo];
        book1 = array;
        for(int i =0;i<chislo;i++){
            for(int k =0;k<chislo-1;k++){
                if(book1[k].getIzdanie()>book1[k+1].getIzdanie()){
                    Book temp = book1[k];
                    book1[k] = book1[k+1];
                    book1[k+1] = temp;
                }
            }
        }
        for (int p = 0;p<chislo;p++){
            if (p!=n){
                System.out.println(book1[p].toString());
            }
            else{
                System.out.println("\n\n "+ book1[p].toString());
            }
        }
    }
}
