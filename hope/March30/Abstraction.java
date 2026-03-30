abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Eating...");
    }
}
//you cannot create objects for abstract class

class Dog extends Animal{
    void sound(){
        System.out.println("Barks...");
    }
}

public class Abstraction{
    public static void main(String[] args){
        Animal a = new Dog();
        a.eat();
        a.sound();
    }
}
