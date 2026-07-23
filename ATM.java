import java.util.Scanner;
public class ATM {
    private double balance;
    private int pin;

    ATM(double balance,int pin){
this.balance = balance;
this.pin = pin;

    }
   void checkBalance(){
System.out.println(balance);
    }

   void  depositeAmount(double amount){
balance  = balance + amount;
System.out.println( "Deposited amount :" + amount);
System.out.println("current balance :" + balance );
    }

    void widthdrawal(double amount){
        if(balance>=amount){

        
        balance = balance - amount; 
        System.out.println("widthdrawed"+amount );
    System.out.println(" currentbalance" + balance);
        }
        else{
            System.out.println("insufficient balance");
        }
    }
   void start() {
    Scanner sc = new Scanner(System.in);
    while(true) {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1:  checkBalance();
                   break;
            case 2: System.out.println("Enter amount to deposite :");
                     double amount1 = sc.nextInt();
                     depositeAmount(amount1);
                        break;
            case 3: System.out.println("Enter amount to widthdraw");
                        double amount2 = sc.nextInt();
                        widthdrawal(amount2);
                        break;

            case 4: System.out.println("Thankyou!!");
            return;
        }
    }
}
    public static void main(String[] args) {
        ATM atm = new ATM(70000,4321);
        atm.start();
    }
}
