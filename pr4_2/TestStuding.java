import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestStuding
{
    public static void main(String[] args)
    {
        School obj1 = new School("a1");
        University obj5 = new University("b2");
        School obj2 = new School("a2");
        University obj4 = new University("b1");
        School obj3 = new School("a3");
        University obj6 = new University("b3");
        Studing[] obj = new Studing[] {obj1, obj2, obj3, obj4, obj5, obj6};
        System.out.println("\nШкольники");
        for (int i=0; i<obj.length;i++){
            if(obj[i] instanceof School){ //Оператор instanceof нужен, чтобы проверить, был ли объект, на который ссылается переменная X, создан на основе какого-либо класса Y.
                System.out.println(obj[i].getname());
            }
        }
        System.out.println("\nСтуденты");
        for (int i=0; i<obj.length;i++){
            if(obj[i] instanceof University){
                System.out.println(obj[i].getname());
            }
        }

    }
}