class Parent{
    void display(){
        System.out.println("I am inside Parent class but called by child class");
    }
}
class Child extends Parent{
    void display1(){
        System.out.println("I am in Child class");

    }
}

public class SimpleInheritance{
    public static void main(String[] args){
        System.out.println("Inside Main class");
        Child c = new Child();
        c.display();
        c.display1();
        
    }
}