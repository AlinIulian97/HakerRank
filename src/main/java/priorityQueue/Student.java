package priorityQueue;

public class Student {
   private Integer id;
    private  String name;
    private Double cgpq;

    public Student(int id, String name, double cgpq) {
        this.id = id;
        this.name = name;
        this.cgpq = cgpq;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getCgpq() {
        return cgpq;
    }
}
