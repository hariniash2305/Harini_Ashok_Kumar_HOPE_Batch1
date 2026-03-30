interface A{
    void show();
}

interface B{
    void display();
}
class C implements A{
    public void show(){
        System.out.println("Welcome");
    }
}
public class InterfaceEg{
    public static void main(String[] args) {
        A c = new C();
        c.show();
    }
}
//during runtime its not called a class because it can instantiate but during compile time it turns it into a class by the java compiler 
