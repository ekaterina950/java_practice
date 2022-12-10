import java.util.Arrays;
import java.util.Scanner;

public class TestComp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Shop compShop=new Shop();
        int numCmd = 1;
        String n1;
        String n2;

        while (numCmd != 0) {
            System.out.print("""
                    1 - add comp
                    2 - delete comp
                    3 - find comp
                    4 - information about comp
                    0 - exit
                    """);
            System.out.print("type command: ");
            numCmd = scan.nextInt();
            switch (numCmd) {
                case 1 -> {
                    System.out.println("Brands which you can choose ");
                    System.out.println(Arrays.toString(Brand.values()));
                    System.out.println("Type brand, name, price");
                    Brand brand=Brand.valueOf(scan.next());
                    String name=scan.next();

                    double price= scan.nextDouble();
                    System.out.println(" Type name of processor");
                    String nameProc= scan.next();

                    System.out.println("Type capacity of memory");

                    int capacity= scan.nextInt();
                    System.out.println("Type diagonal of monitor");
                    double diagonal= scan.nextDouble();
                    compShop.add(new Computer(brand,name, (int) price,
                            new Processor(nameProc),new Memory(capacity),
                            new Monitor(diagonal)));
                }
                case 2 -> {
                    System.out.println("name of comp which you want to find ");
                    String name= scan.next();
                    if (compShop.delete(name))
                        System.out.println("Deleted");
                    else
                        System.out.println("not found");
                }
                case 3 -> {
                    System.out.println("name of comp which you want to find ");
                    String name= scan.next();
                    compShop.findComp(name);
                }
                case 4 -> {
                    compShop.print();
                }
                default -> {
                }
            }
        }
    }
}
