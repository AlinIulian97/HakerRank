package org.example;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long q = in.nextLong();
        long i = 1;
        while (i <= q) {
            if (q >= 0 && q <= 500) {
                long a = in.nextLong();
                long b = in.nextLong();
                long n = in.nextLong();
                if ((a >= 0 && a <= 50) && (b >= 0 && b <= 50) && (n >= 1 && n <= 15)) {
                    long count = 0;
                    while (count < n) {
                        a = (long) (a + (b * Math.pow(2, count)));
                        System.out.print(a + " ");
                        count++;
                    }
                    System.out.println();
                }
                i++;
            }
        }
    }
}