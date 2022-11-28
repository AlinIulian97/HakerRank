package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntaxChecker {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        Pattern(N);
//    }
//
//    public static void Pattern(int N) {
//        int i = 0;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            String S = scanner.next();
//            String test = "Hai.";
//            Pattern pattern = Pattern.compile(S);
//            Matcher matcher = pattern.matcher(test);
//            boolean isMatch = matcher.matches();
//            if (isMatch) {
//                System.out.println("Valid");
//            } else System.out.println("Nevalid");
//            i++;
//        }
//        while (i < N);
//    }
//}
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    String VALID = "Valid";
    String INVALID = "Invalid";
    Pattern pat;
    while(testCases>0){
        String pattern = in.nextLine().trim();
        if (!pattern.isEmpty()){
            try{
                pat = Pattern.compile(pattern);
                System.out.println(VALID);
            } catch (PatternSyntaxException e){
                System.out.println(INVALID);
            }
        }
        testCases--;
    }
}
}
