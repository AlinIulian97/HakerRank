package org.example;

import java.util.Scanner;

public class StaticInitializerBlock {
    static int B ;
    static int H ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      B = scanner.nextInt();
      H = scanner.nextInt();
      if (B>0 && B<= 100 && H>0 && H<= 100 ){
          System.out.println(B*H);
      }else System.out.println("java.lang.Exception: Breadth and height must be positive");

    }
}
