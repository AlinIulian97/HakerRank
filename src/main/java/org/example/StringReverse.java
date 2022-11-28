package org.example;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String index = "";
        for (int i = 0; i < A.length(); i++) {
            char x = A.charAt(i); //extracts each character
            index = x + index; //adds each character in front of the existing string
        }
        if (index.equals(A)) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }


//    OR USING A STRINGBUILDER METHODS

//Scanner sc=new Scanner(System.in);
//    String A=sc.next();
//    String rev = new StringBuilder(A).reverse().toString();
//
//    System.out.println(A.equals(rev) ? "Yes" : "No");


}

