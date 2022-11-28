package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserNameRegularExpresion {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 =new Scanner(System.in);
       int count =Integer.parseInt(scanner.nextLine());
        String regex = "^[a-zA-Z][\\\\w]{7,29}$";
        String regex1 = "[a-zA-Z]";


        do {
            String userName = scanner1.next();
            System.out.println(userName.matches(regex));
            System.out.println(userName.matches(UsernameValidator.regularExpression));

            if (userName.length() < 8 || userName.length() > 30) {
                System.out.println("Invalid");
            } else if  (userName.matches(regex)) {
                System.out.println("Invalid");
            }
            String check = userName.substring(0, 1).trim();
            if (!check.matches(regex1)) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }
            count--;
        } while (count > 0);
    }
}
//    private static final Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n = Integer.parseInt(scan.nextLine());
//        while (n-- != 0) {
//            String userName = scan.nextLine();
//            if (userName.matches(UsernameValidator.regularExpression))
//                System.out.println("Valid");
//            else
//                System.out.println("Invalid");
//        }
//    }
//
    class UsernameValidator {
        public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";

    }
//}