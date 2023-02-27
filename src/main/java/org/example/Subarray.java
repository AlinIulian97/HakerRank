package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int sumOfNeg = 0;
//        int[] arr = new int[n];
//        for (int i=0; i<n; i++) {
//            int num = scan.nextInt();
//            // get negative values for array size 1
//            if (num < 0) sumOfNeg++;
//            arr[i] = num;
//        }
//        scan.close();
//        // start getting negative sum values for array size 2
//        int subArraySize = 2;
//        for (int i=1; i<n; i++) {
//            for (int j=0; j<n-i; j++) {
//                int[] subArr = Arrays.copyOfRange(arr, j, j+subArraySize);
//                if (Arrays.stream(subArr).sum() < 0) sumOfNeg++;
//            }
//            subArraySize++;
//        }
//        System.out.println(sumOfNeg);
//    }
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int subArray = 2;
        int [] array = new int[number];
        for(int i = 0 ; i <array.length ; i++){
            int nr = scanner.nextInt();
            array[i] = nr;
            if(nr<0) count++;
        }
        scanner.close();
      for (int i = 1; i<number ; i++){
          for (int j = 0 ; j<number-i ; j++){
              int [] subArr = Arrays.copyOfRange(array, j, j+subArray);
              if(Arrays.stream(subArr).sum() < 0) count++ ;
          }
          subArray++;
      }
        System.out.println(count);
    }
}
