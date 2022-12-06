package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//class MyRegex {
//     public static void main(String[] args) {
//         String zeroTo255
//                 = "(\\d{1,2}|(0|1)\\"
//                 + "d{2}|2[0-4]\\d|25[0-5])";
//         String regex
//                 = zeroTo255 + "\\."
//                 + zeroTo255 + "\\."
//                 + zeroTo255 + "\\."
//                 + zeroTo255;
//         Scanner scanner = new Scanner(System.in);
//         String s = scanner.next().trim();
//         Pattern pattern = Pattern.compile(regex);
//         Matcher matcher = pattern.matcher(s);
//         boolean matches = matcher.matches();
//         if(matches){
//             System.out.println("Valid");
//         }else{
//             System.out.println("Invalid");
//         }
//     }
//}


class Solution1{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class  MyRegex{
    static String pattern = "^(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(?:\\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$";
}