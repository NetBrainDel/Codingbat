package HomeWork3;

import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("введите размер массива: ");
        a = in.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("введите значение массива " + i + " : ");
            array[i] = in.nextInt();
        }
////////////////////////////////////////////////////////sorting\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
///////////////////////////////////////////////////////_________\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
////////////////////////////////////////////////////Selection sort\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        System.out.println("__________отсортированные значения массива размера (" + a + ") __________");
//        for (int i = 0; i < a; i++) {
//            int min1 = array[i];
//            int min2 = i;
//
//            for (int j = i + 1; j < a; j++) {
//
//                if (array[j] < min1) {
//                    min1 = array[j];
//                    min2 = j;
//                }
//            }
//
//            if (i != min2) {
//                int tmp = array[i];
//                array[i] = array[min2];
//                array[min2] = tmp;
//            }
//
//            for (int j = 0; j < 1; j++) {
//                System.out.print("|" + array[i] + "|");
//            }
//        }

/////////////////////////////////////////////////////Bubble Sort\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        boolean arr1 = false;
        int min;
        while(!arr1) {
            arr1 = true;
            for (int i = 0; i < a-1; i++) {
                if (array[i] > array[i+1]) {
                    arr1 = false;

                    min = array[i];
                    array[i] = array[i+1];
                    array[i+1] = min;
                }
            }
        }
           System.out.println("|" + Arrays.toString(array) + "|");
//////////////////////////////////////////////////////Shaker sort\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//        int leftSide = 1;
//        int rightSide = a-1;
//        while (leftSide<=rightSide) {
//            for (int i = rightSide; i >= leftSide; i--) {
//                if (array[i - 1] > array[i]) {
//                    int t = array[i];
//                    array[i] = array[i-1];
//                    array[i-1] = t;
//                }
//            }
//            leftSide++;
//            for (int i = leftSide; i <= rightSide; i++) {
//                if (array[i - 1] > array[i]) {
//                    int t = array[i];
//                    array[i] = array[i-1];
//                    array[i-1] = t;
//                }
//            }
//            rightSide--;
//        }
//        System.out.println(Arrays.toString(array));

///////////////////////////////////////////////////////Include Sort\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//        for (int left = 0; left < a; left++) {
//            int value = array[left];
//            int i = left - 1;
//            for (; i >= 0; i--) {
//                if (value < array[i]) {
//                    array[i + 1] = array[i];
//                }
//                else
//                {
//                    break;
//                }
//           }
//            array[i + 1] = value;
//        }
//        System.out.println(Arrays.toString(array));
/////////////////////////////////////////////////////////Merge Sort\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

//        public static int[] mergeSort(int[] arr) {
//            if (arr.length <= 1) {
//                return arr;
//            }
//
//            int mid = arr.length / 2;
//            int[] left = new int[mid];
//            int[] right = new int[mid + arr.length / 2];
//
//            int j = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if (i < arr.length / 2) {
//                    left[i] = arr[i];
//                } else {
//                    right[j++] = arr[i];
//                }
//            }
//            return Merge(mergeSort(left), mergeSort(right));
//        }
//        public static int[] Merge ( int[] left, int[] right){
//            int a = 0, b = 0;
//            int[] merged = new int[left.length + right.length];
//            //забиваем отсортированный массив из левой и правой частей
//            for (int i = 0; i < left.length + right.length; i++) {
//                //поочередно берем меньший член из крайних левого и правого
//                if (b < right.length && a < left.length)
//                    if (left[a] > right[b] && b < right.length)
//                        merged[i] = right[b++];
//                    else
//                        merged[i] = left[a++];
//                else if (b < right.length)
//                    merged[i] = right[b++];
//                else
//                    merged[i] = left[a++];
//            }
//            return merged;
//
//        }
/////////////////////////////////////////////////////////Quick Sort\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//        public static void quickSort(int[] array, int low, int high) {
//            if (array.length == 0)
//                return;
//
//            if (low >= high)
//                return;
//
//            int middle = low + (high - low) / 2;
//            int opora = array[middle];
//
//            int i = low, j = high;
//            while (i <= j) {
//                while (array[i] < opora) {
//                    i++;
//                }
//                while (array[j] > opora) {
//                    j--;
//                }
//                if (i <= j) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                    i++;
//                    j--;
//                }
//            }
//
//
//            if (low < j)
//                quickSort(array, low, j);
//
//            if (high > i)
//                quickSort(array, i, high);
//        }
//        public static void main(String[] args) {
//            int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
//            System.out.println("Было");
//            System.out.println(Arrays.toString(x));
//
//            int low = 0;
//            int high = x.length - 1;
//
//            quickSort(x, low, high);
//            System.out.println("Стало");
//            System.out.println(Arrays.toString(x));
//        }
////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        int n = a;

        for ( int i = 0, m = 0; i != n; i++, n = m )
        {
            for ( int j = m = i + 1; j != n; j++ )
            {
                if ( array[j] != array[i] )
                {
                    if ( m != j ) array[m] = array[j];
                    m++;
                }
            }
        }


        if ( n != a )
        {
            int[] b = new int[n];
            for ( int i = 0; i < n; i++ ) b[i] = array[i];

            array = b;
        }
        System.out.println("после удаления одинаковых значений");
        for ( int x : array ) System.out.print("|"+x + "|" );
        System.out.println();
    }
}




