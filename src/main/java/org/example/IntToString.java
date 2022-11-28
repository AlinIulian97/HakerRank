package org.example;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= -100 && n <= 100) {
            String s = String.valueOf(Integer.valueOf(n));
            System.out.println("Good job");
        } else System.out.println("Wrong answer");
    }
}
