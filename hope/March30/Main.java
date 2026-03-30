@SuppressWarnings("ObsoleteAnnotationSupportedSource")
abstract class Employee {
    abstract void salary();
}

class FullTimeEmployee extends Employee {
    void salary() {
        System.out.println("Full-time salary = 50000");
    }
}

class PartTimeEmployee extends Employee {
    void salary() {
        System.out.println("Part-time salary = 10000");
    }
}

public class Main{
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        e1.salary();
        e2.salary();
    }
}