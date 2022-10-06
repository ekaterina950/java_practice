import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ЗАДАНИЕ 1..............................................
           /* int [] array = new int[10];
            for(int i =0;i< array.length;i++)
            {
                array[i] = (int)(Math.random()*20);
                System.out.print(array[i] + " ");
            }
            System.out.println("\n ");
            Arrays.sort(array);
            for(int i =0;i< array.length;i++)
            {
                System.out.print(array[i] + " ");
            }
            System.out.println("\n vtoroy metod");
            double[]array1 = new double[10];
            for(int i =0;i< array1.length;i++)
            {
                Random random = new Random();
                array1[i] = random.nextInt(10);
                System.out.print(array1[i] + " ");
            }
            Arrays.sort(array1);
            System.out.println("\n");
            for(int i =0;i< array1.length;i++)
            {
                System.out.print(array1[i] + " ");
            }*/

        //ЗАДАНИЕ 2.........................................
        /*TestCircle obj1 = new TestCircle(3);
        obj1.PrintInfo(3);
        System.out.println("Sorted array \n");
        obj1.Sorted();*/
        //ЗАДАНИЕ 3.......................................................
        /*int arr[] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 99);
            arr[i] = a;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        if (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]) {
            System.out.println("Массив строго возрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ строго возрастающей последовательностью");
        }*/
        //ЗАДАНИЕ 4...................................................................
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = 0;

        while (n <= 3) {
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n <= 3){
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int [] mas1 = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            mas1[i] = (int)(Math.random()*(n+1));
            if(mas1[i]%2 == 0){
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(mas1));
        int [] mas2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(mas1[i]%2 == 0){
                mas2[index] = mas1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));*/

        //ЗАДАНИЕ ОБОЛОЧКИ 1..............................
       /* ++1. Создайте объекты класса Double, используя методы valueOf().
        2. ++Преобразовать значение типа String к типу double. Используем
        метод Double.parseDouble().
        3. ++Преобразовать объект класса Double ко всем примитивным типам.
        4.++ Вывести значение объекта Double на консоль.
        5. Преобразовать литерал типа double к строке: String d =
                Double.toString(3.14);*/

        /*System.out.println(Double.valueOf(10));
        System.out.println(Double.parseDouble("1000"));
        System.out.println(Double.toString(3.14));

        Double b= 34.4;
        Integer a = b.intValue();
        Byte c = b.byteValue();
        Long v = b.longValue();
        System.out.println("int: "+a);
        System.out.println("byte: "+c);
        System.out.println("long: "+v);*/


        //ЗАДАНИЕ 1 в файле банк
        //ЗАДАНИЕ  2..............................
        EmployeeOutput em1 = new EmployeeOutput(4);
        em1.PrintInfo(4);

    }
}