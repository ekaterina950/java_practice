
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    ArrayList<Comp> array;

    int n;



    public Shop(int N){
        n= N;
        array = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int[] diagonal = new int[N]; String[] podsvetka = new String[N];

        for (int i = 0; i < N; ++i){
            System.out.println("Input size screen\n");
            diagonal[i] = in.nextInt();
        }
        podsvetka[0] = in.nextLine();
        for (int i = 0; i < N; ++i){
            System.out.println("Input color of podsvetka\n");
            podsvetka[i] = in.nextLine();
        }

        for (int i = 0; i < N; ++i){
            array.add( new Comp(diagonal[i], podsvetka[i]));
        }
    }
    public void Adder(int diagonal, String podsvetka){
        array.add( new Comp(diagonal, podsvetka));
    }
    public void Delete(int k){
        array.remove(k);
    }
    public void PrintInfo(int N){

            System.out.println( array.toString());

    }

}
