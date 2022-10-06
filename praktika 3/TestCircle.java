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

            int k = (int)(Math.random()*20);
            x[i] = k;
        }

        for (int i = 0; i < n; ++i){

            int k = (int)(Math.random()*20);
            y[i] = k;
        }
        for (int i = 0; i < n; ++i){
            int k = (int)(Math.random()*20);
            radius[i] = k;
        }

        for (int i = 0; i < n; ++i){
            obj[i] = new Circle(radius[i], x[i], y[i]);
        }
    }
    public void Sorted() {
        Circle[] circle1 = new Circle[n];
        circle1 = obj;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - 1; k++) {
                if (circle1[k].getR() > circle1[k + 1].getR()) {
                    Circle temp = circle1[k];
                    circle1[k] = circle1[k + 1];
                    circle1[k + 1] = temp;
                }
            }
        }
        for (int p = 0;p<n;p++) {
            System.out.println(circle1[p].toString());
        }
    }

    public Circle Smallest(){
        double min = obj[0].getR();
        Circle b1 = obj[0];
        for(int i = 0; i<obj.length;i++){
            if(min>obj[i].getR()){
                min = obj[i].getR();
                b1 = obj[i];
            }
        }
        return b1;

    }
    public Circle Biggest(){
        double max = obj[0].getR();
        Circle b1 = obj[0];
        for(int i = 0; i<obj.length;i++){
            if(max<obj[i].getR()){
                max = obj[i].getR();
                b1 = obj[i];
            }
        }
        return b1;

    }
    public void PrintInfo(int n) {
        for (int i = 0; i < n; ++i) {
            System.out.println(obj[i]);
        }
    }
}