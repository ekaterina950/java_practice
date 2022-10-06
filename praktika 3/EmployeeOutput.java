import java.util.Scanner;

public class EmployeeOutput {
    Employee[] array;

    public EmployeeOutput(int N) {
        array = new Employee[N];
        Scanner in = new Scanner(System.in);
        String[] name = new String[N];
        double[] salary = new double[N];
        String[] author = new String[N];
        for (int i = 0; i < N; ++i) {
            System.out.println("Input name\n");
            name[i] = in.nextLine();
        }


        for (int i = 0; i < N; ++i) {
            System.out.println("Input salary\n");
            salary[i] = in.nextInt();
        }

        for (int i = 0; i < N; ++i) {
            array[i] = new Employee(salary[i], name[i]);
        }

    }
    public void PrintInfo(int N){
        for (int i = 0; i < N; ++i){
            System.out.println( array[i].toString());

        }
    }
}
