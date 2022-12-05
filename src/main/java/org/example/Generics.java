package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Generics {
    public static final Scanner scanner = new Scanner(System.in);
    private static int[] T;

//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3};
//        String[] strings = new String[]{"Hello", "World"};
//        printArrays(strings[1]);
//        printArrays(strings[0]);
//        printArrays(numbers[0]);
//        printArrays(numbers[1]);
//        printArrays(numbers[2]);
//    }
//    public static <T> void printArrays(T elemente){
//        List<T> list = new ArrayList<>();
//        list.add(elemente);
//        System.out.println(list);
//        }
//    }

    public static void main(String[] args){
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add( "Hello");
        arrayList.add( "World");
        printArray(arrayList);
    }
    static <E> void printArray(List<E> e){
        e.forEach(System.out::println);
    }
}