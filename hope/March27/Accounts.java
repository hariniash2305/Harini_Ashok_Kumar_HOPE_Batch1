
class Details{
    String name;
    int accNo;
    int balance;
    Details(){
        name = "Harini";
        accNo = 1254;
        balance = 1000;
    }
    void display(){
        System.out.println("Name: " + name );
        System.out.println("AccNO: "+ accNo);
        System.out.println("Balance: "+balance);
}
}
class Deposit{
    
    int amount=1000;
    int deposit=500;
    Deposit(){
        amount+=deposit;
    }
    void display1(){ 
        System.out.println("Total amount after deposit: "+ (amount));
    }
}
class Withdraw{
    
    int amount=1500;
    int withdraw = 200;
    Withdraw(){
        amount-=withdraw;
    }
    void display2(){
        System.out.println("Total amount after withdraw: "+ amount);
    }
}

public class Accounts{
    public static void main(String[] args) {
        Details d = new Details();
        d.display();
        Deposit dep= new Deposit();
        dep.display1();
        Withdraw w = new Withdraw();
        w.display2();

    }
}