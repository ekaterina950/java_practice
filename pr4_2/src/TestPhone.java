import java.util.Scanner;

public class TestPhone {

    public static void main(String[] args) {
        Phone apple = new Phone(789789, 500, "13pro");
        Phone huawei = new Phone(7777789, 200, "s7");
        Phone samsung = new Phone(789000089, 400, "a5");

        apple.call(" друг");

        System.out.println("номер apple: "+apple.getNum());
        System.out.println("номер huawei: "+huawei.getNum());
        System.out.println("номер samsung: "+samsung.getNum());
        samsung.call("друг", 111111);

        Scanner in = new Scanner(System.in);
        System.out.println("введте колво номеров");
        int n = in.nextInt();
        for (int i = 0;i<n;i++){
            int z= in.nextInt();
            int l=i+1;
            System.out.println("Номер " + l + " "+apple.msg(z) + "\n");
        }
    }
}
