package org.example;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = n < 10 ? "Numebr este mai mic" : "Number este mai mare";
        int caut = scanner.nextInt() < 10 ? scanner.nextInt() : 20;
        System.out.println(s);
        System.out.println(caut);
    }
}
