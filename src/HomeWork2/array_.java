package HomeWork2;

import java.util.Scanner;

public class array_ {
    public static void main(String[] args) {
        int a;
        int e;
        System.out.println("введите размер массива");
        Scanner q = new Scanner(System.in);
        a = q.nextInt();
        int array[] = new int[a];

        for (int i = 0; i < a; i+=2) {
            System.out.println("________________________");
            System.out.println("введите значение массива");
            Scanner w = new Scanner(System.in);
            e = w.nextInt();

            array[i] = e;


            for (int j = 1; j <= 1; j++) {

                System.out.println("элемент массива: "+i+" его значение: "+ array[i]);
            }
        }
    }
}

