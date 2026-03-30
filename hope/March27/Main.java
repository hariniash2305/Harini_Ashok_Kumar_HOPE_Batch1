class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }

    void sound(String type) {
        System.out.println("Animal sound: " + type);
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void sound(int times) {
        System.out.println("Dog barks " + times + " times");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();

        a.sound();           
        a.sound("growl");   

        Dog d = new Dog();
        d.sound(10);         
    }
}