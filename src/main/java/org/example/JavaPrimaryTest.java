package org.example;

import javax.swing.text.html.parser.Parser;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimaryTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        BigInteger x = scanner.nextBigInteger();
       if(x.isProbablePrime(100)){
           System.out.println("prime");
        }else System.out.println("not prime");
    }
}
