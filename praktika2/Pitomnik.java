import java.util.Scanner;

public class Pitomnik {
    Dog[] array;



    public Pitomnik(int N){
        array = new Dog[N];
        Scanner in = new Scanner(System.in);
        String[] name = new String[N]; int[] age = new int[N];

        for (int i = 0; i < N; ++i){
            System.out.println("Input name\n");
            name[i] = in.nextLine();
        }

        for (int i = 0; i < N; ++i){
            System.out.println("Input years\n");
            age[i] = in.nextInt();
        }

        for (int i = 0; i < N; ++i){
            array[i] = new Dog(age[i], name[i]);
        }
    }

    public void PrintInfo(int N){
        for (int i = 0; i < N; ++i){
            System.out.println( array[i].toString());
            System.out.println( " human: " + array[i].perevodVozrast() + "\n");
        }
    }
}
