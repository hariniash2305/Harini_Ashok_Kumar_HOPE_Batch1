public class method {

    //No parameters, no return value
    void method1() {
        int length = 5;
        int breadth = 3;
        int area = length * breadth;
        System.out.println("Method1 (no param, no return): Area = " + area);
    }

    //Parameters, no return value
    void method2(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Method2 (param, no return): Area = " + area);
    }

    //No parameters, returns value
    int method3() {
        int length = 7;
        int breadth = 4;
        return length * breadth;
    }

    //Parameters, returns value
    int method4(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        method obj = new method();

        obj.method1();
        obj.method2(6, 2);

        int result3 = obj.method3();
        System.out.println("Method3 (no param, return): Area = " + result3);

        int result4 = obj.method4(8, 5);
        System.out.println("Method4 (param, return): Area = " + result4);
    }
}