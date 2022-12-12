package org.example;

import java.util.*;


public class Sort {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int countStudents = scanner.nextInt();
        List<StudentSort> listStudent = new ArrayList<>();
        StudentSort student;

        do {
            int id = scanner.nextInt();
            String Name = scanner.next();
            float cgpa = scanner.nextFloat();
            student = new StudentSort(id, Name, cgpa);
            listStudent.add(student);
            countStudents--;
        } while (countStudents > 0);
        listStudent.sort(new CompareSGPA());
        for (StudentSort studentSort : listStudent) {
            System.out.println( studentSort.getName());
//            System.out.println(studentSort.getId() + " " + studentSort.getName() + " " + studentSort.getCgpa());
        }
    }
}

class StudentSort {
    private Integer id;
    private String name;
    private Float cgpa;

    public StudentSort(Integer id, String name, Float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public Float getCgpa() {
        return cgpa;
    }

}

class CompareSGPA implements Comparator<StudentSort> {

    @Override
    public int compare(StudentSort o1, StudentSort o2) {

        int sortByName = o1.getName().compareTo(o2.getName());
        int sortByCGPa = o2.getCgpa().compareTo(o1.getCgpa());
        int sortById = o1.getId().compareTo(o2.getId());
        return (sortByCGPa == 0) ? sortByName :
                (sortByName ==0) ? sortById : sortByCGPa;
    }
}



