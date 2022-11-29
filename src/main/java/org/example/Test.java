package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Test {
    public static final Scanner scanner =new Scanner(System.in);

    public static boolean isBracketsPresent(String inserSrting) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < inserSrting.length(); i++) {
            char x = inserSrting.charAt(i);
            if (x == '{' || x == '[' || x == '(') {
                stack.push(x);

                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        do {
            String insert = scanner.nextLine();
           if (isBracketsPresent(insert)){
               System.out.println("true");
           }else System.out.println("false");
        }while (scanner.hasNext());
    }
}
