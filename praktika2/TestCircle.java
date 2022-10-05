import java.util.Scanner;

public class TestCircle {
    Circle[] obj;
    int n;




    public TestCircle(int n){
        this.n = n;

        obj = new Circle[n];
        Scanner in = new Scanner(System.in);
        double[] x = new double[n];
        double[] y = new double[n];
        double[] radius = new double[n];

        for (int i = 0; i < n; ++i){
            System.out.println("Input x:\n");
            x[i] = in.nextDouble();
        }

        for (int i = 0; i < n; ++i){
            System.out.println("Input y:\n");
            y[i] = in.nextDouble();
        }
        for (int i = 0; i < n; ++i){
            System.out.println("Input radius:\n");
            radius[i] = in.nextDouble();
        }

        for (int i = 0; i < n; ++i){
            obj[i] = new Circle(radius[i], x[i], y[i]);
        }
    }


    public void PrintInfo(int n) {
        for (int i = 0; i < n; ++i) {
            System.out.println(obj[i]);
        }
    }
}
