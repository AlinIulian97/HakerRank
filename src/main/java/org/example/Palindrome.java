package org.example;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome(1231);

    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String check = "";
        for (int i = s.length() - 1; i > -1; i--) {
            check = check + s.charAt(i);
        }
        if (check.equals(s)) {
            return true;
        }
        return false;
    }
}
