package org.example;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        if(S.length()>=1 && S.length()<=100){
            System.out.println(S.substring(start,end));
        }
    }
}
