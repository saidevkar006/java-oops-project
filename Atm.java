import java.util.*;
public class Atm {
    float balance;
    int pin=1234;

    Scanner sc=new Scanner(System.in);
   //  pin= sc.nextInt();
     //function
     Atm(){
        System.out.println("enter your pin");
        int checkpin= sc.nextInt();
        if(pin==checkpin){
            menu();
        }
        else {
            System.out.println("wrong password");
        }
    }
    public void menu(){
        System.out.println("enter your choice");
        System.out.println("Check balance");
        System.out.println("withdraw money");
        System.out.println("deposite money");
        System.out.println("EXIT");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        if(option==1){
            checkbalance();

        } else if (option==2) {
            withdraw();

        } else if (option==3) {
            deposite();

        }else if (option==4){
           System.out.println("thank you for vesting");
        }
        else {
            System.out.println("not match for option");
            menu();
        }


    }
    public void checkbalance(){
        System.out.println("your balance="+balance);
        menu();
    }
    public void withdraw(){
        System.out.println("enter your amount for withdraw");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();
        if(amount>balance){
            System.out.println("insufficent money");
        }else {
            balance=balance-amount;
        }
        checkbalance();
        menu();

    }
    public void deposite(){
        System.out.println("enter your amount for deposite");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();

            balance=balance+amount;
checkbalance();
        menu();

    }
    public static void main(String args[]){
Atm obj=new Atm();


    }

}
