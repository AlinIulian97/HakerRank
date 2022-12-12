package priorityQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Priorities {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenimente = scanner.nextInt();


        List<Student> list = new ArrayList<>();

        do {
            int id = scanner.nextInt();
            String name = scanner.next();
            double cgpa = scanner.nextDouble();
            Student student = new Student(id, name, cgpa);
            list.add(student);
            evenimente--;
        } while (evenimente > 0);
        for (int i = 0; i < list.size(); i++) System.out.println(Arrays.toString(list.toArray()));
    }
}
