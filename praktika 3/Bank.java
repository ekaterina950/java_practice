
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите сумму покупки");
        double number = sc.nextDouble();
        System.out.println("выберите валюту\n" +
                "1. доллар\n" +
                "2. евро\n" +
                "3.рубль");
        int n = sc.nextInt();
        if(n==1){
            String k = String.format("%.2f",number/63.0);
            System.out.println("сумма покупики: " + k+"$" );
        }
        else if(n==2){
            String z = String.format("%.2f",number/70.0);
            System.out.println("сумма покупики: " + z+"€" );
        }
        else{
            System.out.println("сумма покупики: " + number+"₽" );
        }
    }

}
