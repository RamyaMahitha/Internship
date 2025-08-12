package BankAccountSimulation;
import java.util.*;
public class Main {
    public static void main(String[] args) {
     int i=1;
     Scanner sc=new Scanner(System.in);
     while(true){
        List<String> ll=new ArrayList<>();
        System.out.println("Bank Account :"+i);
        System.out.println("enter details of bank account");
        System.out.println("enter bank Acoount No");
        int accountNo=sc.nextInt();
         System.out.println("enter holder name");
         String name=sc.next();
         System.out.println("enter initial balance");
        double balance=sc.nextDouble();
        Account a=new Account(accountNo, name, balance); 

        System.out.println("Enter the type withdraw or deposit");
        String type=sc.next();
        if(type.equalsIgnoreCase("deposit")){
          System.out.println("Enter amount to deposit");
          double amount=sc.nextDouble();
          System.out.println(a.deposit(amount));
          ll.add(amount+" is deposited into account with No:"+a.getAccountNo());

    } else if(type.equalsIgnoreCase("withdraw")){
          System.out.println("Enter amount to withdraw");
          double amount=sc.nextDouble();
          System.out.println(a.withdraw(amount));
          ll.add(amount+" is withdrawed from account with No:"+a.getAccountNo());
    }
      System.out.println("View Balance");
     System.out.println(a.getBalance()+" for account with "+a.accountNo+" number");


     System.out.println("Transaction History");
     System.out.println(ll);

     System.out.println("if you wnat to exit press ctrc+c");
     i++;
     }


    }
    
}
