package HomeWork2;

import java.util.Scanner;

public class array_ {
    public static void main(String[] args) {
///////////////////////////////////////////////for\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        int a;
        //int e;
        System.out.println("введите размер массива");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        int array[] = new int[5];

       // for (int i = 0; i < a; i+=2) {
          //  System.out.println("________________________");
         //   System.out.println("введите значение массива");
         //   Scanner w = new Scanner(System.in);
         //   e = w.nextInt();

        //   array[i] = e;

        //    for (int j = 1; j <= 1; j++) {

         //       System.out.println("элемент массива: "+i+" его значение: "+ array[i]);
        //    }

////////////////////////////////////////////foreach\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

                for (int i = 0; i < a; i++) {
                    System.out.println("Введите значение массива: ");
                    array[i] = in.nextInt();
                    System.out.println();
                    System.out.println("элемент массива и его значение: "+i+" : "+array[i]);
                    System.out.println();
                }
                    System.out.println();
                    System.out.println("значения массива: ");
                 for (int t : array) {
                    System.out.print("|"+t + "|");
                }


            }


        }







