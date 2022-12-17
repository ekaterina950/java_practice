
import java.util.Scanner;
public class phoneNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона >> ");
        StringBuilder Number = new StringBuilder(scanner.next());
        if (!Number.toString().startsWith("+7")){
            //Number.deleteCharAt(0);
            //Number.insert(0,"7");
            Number.insert(0, "+"); //вставляет символы в указанное место
        }

        if (!Number.toString().startsWith("+")){
            Number.deleteCharAt(0);
            Number.insert(0,"7");
            Number.insert(0, "+");
        }

        Number.insert(5, "-");
        Number.insert(9, "-");
        System.out.println(Number);
    }
}
