package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = "Apac hai acasa apar";
        String regex = "(Apa)[c]";
        Pattern pattern = Pattern.compile((regex));
        Matcher matcher = pattern.matcher(test);
        System.out.println(matcher);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
           test = test.replaceAll(matcher.group(), matcher.group(1));
            System.out.println(test);

        }
    }
}
