package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TagContentExtractor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            String regEx = "<(.+)>(?<content>[.[^<>]]+)</\\1>";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(line);

            if (m.find()) {
                do {
                    System.out.println(m.group("content"));
                } while (m.find());
            } else {
                System.out.println("None");
            }

            testCases--;
        }
    }
}