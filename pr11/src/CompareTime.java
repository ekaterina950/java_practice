import java.util.Date;
import java.util.Scanner;

public class CompareTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time in milsec >> ");
        long userTime=scanner.nextLong();
        Date userDate=new Date(userTime); //введенное время
        Date currDate = new Date(); //текущеее время
        System.out.println((userDate.getTime()>currDate.getTime())?
                "Time entered by the user "+userDate+" later than the current "+currDate:"Time entered by the user "+userDate+" before the current "+currDate);
    }
}
