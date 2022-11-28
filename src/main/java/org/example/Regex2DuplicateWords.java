package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2DuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        do{
            String s = scanner.nextLine();
        System.out.println(removeDuplicateWord(s));
        n--;}
        while (n>=0);
    }
    public static String removeDuplicateWord(String input){
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(
                regex,
                Pattern.CASE_INSENSITIVE);
        Matcher m =p.matcher(input);
        while (m.find()){
            input
                    =input.replaceAll(
                            m.group(),
                            m.group(1));


        }
        return input;
    }
}


// or

//    public static void main(String[] args) {
//
//        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
//        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//
//        Scanner in = new Scanner(System.in);
//        int numSentences = Integer.parseInt(in.nextLine());
//
//        while (numSentences-- > 0) {
//            String input = in.nextLine();
//
//            Matcher m = p.matcher(input);
//
//            // Check for subsequences of input that match the compiled pattern
//            while (m.find()) {
//                input = input.replaceAll(m.group(0),m.group(1));
//            }
//
//            // Prints the modified sentence.
//            System.out.println(input);
//        }
//
//        in.close();
//    }
//}