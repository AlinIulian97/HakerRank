package org.example;

import java.util.Scanner;

public class SubStringComparisons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner2.nextInt();
        getSmallestAndLargest(s, k );

    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = s.substring(0,k);
        for(int i=0;i+k-1<s.length();i++){
            if(s.substring(i,i+k).compareTo(smallest) < 0){
                smallest = s.substring(i,i+k);
            }
        }
        // 'largest' must be the lexicographically largest substring of length 'k'

        largest = s.substring(0,k);
        for(int i=0;i+k-1<s.length();i++){
            if(s.substring(i,i+k).compareTo(largest) > 0){
                largest = s.substring(i,i+k);
            }
        }
        return smallest + "\n" + largest;
    }


}
