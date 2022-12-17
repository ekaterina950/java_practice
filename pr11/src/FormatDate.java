import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class FormatDate {
    public static void main(String[] args) {

        Calendar calendar=new GregorianCalendar();
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter year<<");
        int year=scanner.nextInt();
        System.out.print("Enter month<<");
        int mouth = scanner.nextInt()-1;
        System.out.print("Enter day<<");
        int day=scanner.nextInt();
        System.out.print("Enter hour<<");
        int hours=scanner.nextInt();
        System.out.print("Enter minute<<");
        int minutes=scanner.nextInt();

        calendar.set(Calendar.YEAR,year);//установка всех параметров в календарь
        calendar.set(Calendar.MONTH,mouth);
        calendar.set(Calendar.DATE,day);
        calendar.set(Calendar.HOUR,hours);
        calendar.set(Calendar.MINUTE,minutes);


        System.out.println(calendar.getTime());
    }
}
