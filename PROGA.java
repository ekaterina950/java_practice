
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PROGA {



    /*


    7. Написать программу, которая с помощью метода, вычисляет факториал числа
    (использовать управляющую конструкцию цикла), проверить работу метода.
    8. Результаты выполнения практической работы залить через IDE в свой репозитарий и продемонстрировать преподавателю.
    */

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
        public static void main(String[] args){
            //ЗАДАНИЕ 1......................................................................................
        /* int res =0;
         int res1 = 0;
         int res2 = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i =0;i< arr.length;i++)
        {
            res+=arr[i];
        }
        int j = 0;
        int k = 0;
        while (j<arr.length)
        {
            res1+= arr[j];
            j++;
        }
        do {
            res2+=arr[k];
            k++;
        }while(k< arr.length);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);*/

            //ЗДАНАИЕ 2..........................................................................

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
            //ЗАДАНИЕ 3...........................................................................



    /*for(int i = 1;i<11;i++ )
    {
        System.out.println(i + " chislo: 1/" + i);
    }*/
            //ЗАДАНИЕ 4..........................................................................
            /*int [] array = new int[10];
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
                //ЗАДАНИЕ 5.....................................................................................
                Scanner sc = new Scanner(System.in);
                int chislo = sc.nextInt();
                int reshenie = factor(chislo);
                System.out.println(reshenie);





        }

}
