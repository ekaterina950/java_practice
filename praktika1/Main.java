import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*+++++++Написать программу, в результате которой массив чисел создается с
помощью инициализации (как в Си) вводится и считается
в цикле сумма элементов целочисленного массива,
а также среднее арифметическое его элементов результат
выводится на экран. Использовать цикл for.
4. Написать программу, в результате которой массив чисел
вводится пользователем с клавиатуры считается сумма элементов
целочисленного массива с помощью циклов do while, while,
 также необходимо найти максимальный и минимальный элемент в
 массиве, результат выводится на экран.
+++++5. Написать программу, в результате которой
выводятся на экран аргументы командной строки в цикле for.
+++++6. Написать программу, в результате работы которой выводятся
 на экран первые 10 чисел гармонического ряда (форматировать вывод).
+++++7. Написать программу, которая с помощью метода класса, вычисляет
факториал числа (использовать управляющую конструкцию цикла),
проверить работу метода.
*/

public class Main {
    public static int factor(int znach){
        int res = 1;
        if(znach == 0){
            return 1;
        }
        for (int i = 1;i<=znach;i++){
            res*=i;
        }
        return res;
    }
    public static void main(String[] args) {
        //ЗАДАНИЕ 3.............................................
        /*int[] Array1 = new int[10];
        Scanner cs = new Scanner(System.in);
        System.out.println("vvedite 10 chisel v massiv");
        double res = 0;
        for (int i = 0; i<10; i++){
            Array1[i] = cs.nextInt();
            res += Array1[i];
        }
        System.out.println("summa elementov " + res);
        System.out.println("arifmeticheskoe " + res/10);*/




        /*Написать программу, в результате которой массив чисел
вводится пользователем с клавиатуры считается сумма элементов
целочисленного массива с помощью циклов do while, while,
 также необходимо найти максимальный и минимальный элемент в
 массиве, результат выводится на экран.*/
        //ЗАДАНИЕ 4(1).........................................
        /*int[] Array2 = new int[10];
        Scanner cs = new Scanner(System.in);
        System.out.println("vvedite 10 chisel v massiv");
        int res = 0;
        int i = 0;
        while(i<10){
            Array2[i] = cs.nextInt();
            res += Array2[i];
            i++;
        }
        System.out.println("summa " + res);
        int k =0;
        int min = Array2[0];
        int max = Array2[0];
        while(k< Array2.length){
            if(Array2[k]< min){
                min = Array2[k];
            }
            if(Array2[k]>max){
                max = Array2[k];
            }
            k++;

        }
        System.out.println("min chislo: " + min);
        System.out.println("max chslo: " + max);*/

        //ЗАДАНИЕ 4(2)........................................
        /*int[] Array3 = new int[10];
        Scanner cs = new Scanner(System.in);
        System.out.println("vvedite 10 chisel v massiv");
        int res = 0;
        int i = 0;
        do{
            Array3[i] = cs.nextInt();
            res += Array3[i];
            i++;
        }while(i<10);
        System.out.println("summa " + res);
        int k =0;
        int min = Array3[0];
        int max = Array3[0];
        do{
            if(Array3[k]< min){
                min = Array3[k];
            }
            if(Array3[k]>max){
                max = Array3[k];
            }
            k++;

        }while(k< Array3.length);
        System.out.println("min chislo: " + min);
        System.out.println("max chslo: " + max);*/

        //ЗАДАНИЕ 5...............................................
        /* Scanner chislo = new Scanner(System.in);
        System.out.println("VVedite 10 chisel");
        int[] arr;
        arr = new int[10];
        for (int i= 0; i<10;i++)
        {
            int num = chislo.nextInt();
            arr[i] = num;
        }
        for (int i =0;i<10;i++)
        {
            System.out.print(arr[i] + " ");
        }*/


        //ЗАДАНИЕ 6.............................................
        /*for(int i = 1;i<11;i++ )
    {
        System.out.println(i + " chislo: 1/" + i);
    }*/

        //ЗАДАНИЕ 7............................................
        Scanner sc = new Scanner(System.in);
        int chislo = sc.nextInt();
        int reshenie = factor(chislo);
        System.out.println(reshenie);
    }
}