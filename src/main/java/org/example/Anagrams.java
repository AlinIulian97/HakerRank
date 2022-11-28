package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }


    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;

        } else {
            String s = a.toLowerCase();
            String c = b.toLowerCase();
            char[] charA = s.toCharArray();
            char[] charB = c.toCharArray();
            Arrays.sort(charA);
            Arrays.sort(charB);
            return Arrays.equals(charA, charB);
        }
    }
}