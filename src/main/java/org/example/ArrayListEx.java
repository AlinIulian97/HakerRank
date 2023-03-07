package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList[] a = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            int  d = scanner.nextInt();
            a[i] = new ArrayList<>();
            for (int j=0; j<d; j++){
                a[i].add(scanner.nextInt());
            }
        }
        int q = scanner.nextInt();
        for(int i = 0 ; i<q ; i++){
            int x = scanner.nextInt();
            int y= scanner.nextInt();
            try{
                System.out.println(a[x-1].get(y-1));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
