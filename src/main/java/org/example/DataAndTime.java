package org.example;

import java.util.*;

public class DataAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.println(findDay(month, day, year));
    }
    public static String findDay(int month, int day, int year) {
        // Create a new calendar
        Calendar myCal = Calendar.getInstance();
        // Set the current date using calendar fields. Note: The month indices start from 0.
        myCal.set(year, month-1, day);
        // Get the day of the week field of this calendar
        switch (myCal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.MONDAY:
                return "MONDAY";
            case Calendar.TUESDAY:
                return "TUESDAY";
            case Calendar.WEDNESDAY:
                return "WEDNESDAY";
            case Calendar.THURSDAY:
                return "THURSDAY";
            case Calendar.FRIDAY:
                return "FRIDAY";
            case Calendar.SATURDAY:
                return "SATURDAY";
            case Calendar.SUNDAY:
                return "SUNDAY";
            default:
                return "";
        }
    }
}




