

package day03.practice;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        System.out.println(e1);
        Employee e2 = new Employee(2, "suresh");
        System.out.println(e2);
    }
}
