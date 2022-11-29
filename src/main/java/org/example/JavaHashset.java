package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {

    public static HashSet<String> hashSet = new HashSet<>();
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = scanner.nextInt();
        do {
            String a = scanner.next();
            String b = scanner.next();
            String[] pair = new String[]{a, b};
            hashSet.add(Arrays.toString(pair));
            System.out.println(hashSet.size());
            count--;
        } while (count > 0);
    }
}
