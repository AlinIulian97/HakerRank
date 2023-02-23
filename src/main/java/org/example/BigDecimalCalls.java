package org.example;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalCalls {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, new Comparator<Object>() {
            public int compare(Object a1, Object a2) {
                BigDecimal bigDec1 = new BigDecimal((String) a1);
                BigDecimal bigDec2 = new BigDecimal((String) a2);
                if (bigDec1.doubleValue() == bigDec2.doubleValue()) return 0;
                return bigDec2.compareTo(bigDec1);
            }
        });
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

