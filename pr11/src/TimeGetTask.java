import java.util.Date;
import java.util.Scanner;

public class TimeGetTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of proger: ");
        String name =scanner.next();
        long gettingTime, deliveryTime;

        System.out.print("Date of start doing task: ");
        gettingTime = scanner.nextLong();
        Date gettingDate=new Date(gettingTime); // создание даты и времени с полуночи 1 янв 1970г
        // в мил сек указывать время

        System.out.print("Date of end doing task: ");
        deliveryTime = scanner.nextLong();
        Date deliveryDate = new Date(deliveryTime);

        if(gettingDate.after(deliveryDate)){
            System.out.println("Time of getting task later than ending");
        }
        else if (gettingDate.equals(deliveryDate)) {
            System.out.println(name + " get and end task at  "+gettingDate);
        }
        else{
            System.out.println(name + " get task at  "+gettingDate+" , end task at "+deliveryDate);
        }
    }
}
