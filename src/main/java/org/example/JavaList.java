package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int y ;
        int x = scanner.nextInt();
        while (x > 0) {
            y = scanner.nextInt();
            list.add(y);
            x--;
        }
        int operation = scanner.nextInt();
        while (operation > 0) {
            String choose = scanner.next();
            if (choose.equals("Insert")) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                list.add(x,y);
                operation--;
            } else if (choose.equals("Delete")) {
                x = scanner.nextInt();
                list.remove(x);
                operation--;
            }
        }
        for(int i = 0 ; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
