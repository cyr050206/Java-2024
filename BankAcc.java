import java.util.Scanner;
public class BankAcc {
    static int amount=0;
    static int with_amt;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            Check(amount);
        }
        catch(Exception e){
            System.out.println("Exception Occured!"+e);
        }
        while(amount!=0){
        System.out.println("Do you want  to deposit or withdraw: ");
        String choice  = sc.next();
        if(choice.equalsIgnoreCase("deposit")){
           
            System.out.println("Enter the amount to deposit: ");
            int deposit = sc.nextInt();
             deposit(deposit);
        }
        if(choice.equalsIgnoreCase("withdraw")){
            System.out.println("Enter withdraw amount: ");
            with_amt = sc.nextInt();
            withdraw(with_amt);
        }
        }
        }
        static void deposit(int deposit){
            amount+=deposit;
            System.out.println("Money has been deposited ");
            System.out.println("Current balance: "+amount);
        }
        static void withdraw(int with_amt){

            amount-=with_amt;
            
            System.out.println("Money has been withdrawn;");
            System.out.println("Current balance :"+amount);
        }
        static void Check(int amount) throws Exception{
            if(amount<0)
            throw new NoAmountException();
            else
            withdraw(with_amt);
        }
        }
class NoAmountException extends Exception{
NoAmountException(){
    super("There is no money in your account: ");

}
}
