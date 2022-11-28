package org.example;

import java.text.NumberFormat;
import java.util.*;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
//        getCurrencyInstance(payment , payment , payment );
        scanner.close();
        NumberFormat f1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat f2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        Locale l = new Locale("en","in");
        Currency r = Currency.getInstance(l);
        NumberFormat f = NumberFormat.getCurrencyInstance(l);


        System.out.println("US: " + f1.format(payment));
        System.out.println("India: " + f.format(payment));
        System.out.println("China: " + f2.format(payment));
        System.out.println("France: " + f3.format(payment));
    }

//    static public double getCurrencyInstance(double u , double c , double f  ) {
//        try {
//            Locale india = new Locale("en","in" );
//            Currency currency = Currency.getInstance(india);
//            NumberFormat numberFormat1 =NumberFormat.getCurrencyInstance(india);
//            if (u >= 0 && u <= Math.pow(10, 9)) {
//                NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
//                numberFormat.setCurrency(
//                        Currency.getInstance(
//                                Locale.US));
//                System.out.println("US: " + numberFormat.format(u));
//
//                numberFormat.setCurrency(
//                        Currency.getInstance(
//                                Locale.CHINA));
//                System.out.println("CHINA: " + numberFormat.format(c));
//
//                numberFormat.setCurrency(
//                        Currency.getInstance(
//                                Locale.FRANCE));
//                System.out.println("FRANTA: " + numberFormat.format(f));
//            }
//
//        } catch (Exception e) {
//            System.out.println("It s too big payment");
//        }
//        return u;
//    }

}

