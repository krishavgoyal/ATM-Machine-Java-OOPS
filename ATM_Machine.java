import java.util.*;
class ATM{
    float Balance;
    int PIN = 1792;
    public void checkpin(){
        System.out.println("Enter your PIN:");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if (enterpin==PIN) {
            menu();
        }
        else{
            System.out.println("Invalid PIN..!!");
            checkpin();
        }

        }
        public void menu(){
            System.out.println("Enter your choice:");
            System.out.println(("1. Check A/C Balance"));
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4.Exit");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if (opt == 1) {
                checkBalance();
            }
            else if (opt == 2) {
                widthrawMoney();
            }
            else if (opt == 3) {
                depositMoney();
            }
            else if(opt == 4){
                return;
            }
            else {
                System.out.println("Please Enter a valid number");
                menu();
            }
    }
    public void checkBalance(){
        System.out.println("Balance:"+ Balance);
        menu();
    }
    public void widthrawMoney(){
        System.out.println("Enter money to be widthdrawn: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat(); 
            if (amount> Balance) {
            System.out.println("Amount is  ore than your Balance hence can't be widthdrawn");}
            else if(amount<= Balance){
                Balance = Balance - amount;
                System.out.println("Money widthdrawn Successfully");
            }
            menu();
        }
        public void depositMoney(){
            System.out.println("Enter amount to  be deposited: ");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            Balance = amount+ Balance;
            System.out.println("Money deposited successfully"); 
            menu();
        }
    }


public class ATM_Machine {
    public static void main(String[] args) {
    ATM obj = new ATM();
    obj.checkpin();        
    }
}
    

