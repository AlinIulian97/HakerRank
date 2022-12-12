package priorityQueue;

import java.util.Comparator;

public class PrioritiesComp implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        int compCgpa = o2.getCgpq().compareTo(o1.getCgpq());
        int compName = o1.getName().compareTo(o2.getName());
        int compById = o1.getId().compareTo(o2.getId());


        return (compCgpa == 0) ? compName :
                (compName == 0) ? compById :
                        compCgpa;
    }
}
