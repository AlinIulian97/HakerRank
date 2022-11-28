package org.example;

import java.util.Scanner;


public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.replaceAll("[ ?.@!,_']+", " ");
        s = s.replaceAll("\\s", " ");
 s = s.trim();

        String[] str = s.split(" ");

        if(s.length() > 0){
            System.out.println(str.length);
            for(String x : str){
                System.out.println(x);
            }
        } else {
            System.out.println(0);
        }
        scan.close();
    }
}


