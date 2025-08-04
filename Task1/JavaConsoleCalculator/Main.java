package JavaConsoleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=0,b=0;
        Scanner sc=new Scanner(System.in);
        Calculator c=new Calculator();
        while(true){
            System.out.println("If you want to exit enter 'Exit' otherwise Enter type of calculation");
            String input=sc.next();
            String calculate=input.toLowerCase();
            if(!calculate.equalsIgnoreCase("exit")){
            System.out.println("Enter the value of a and b");
             a=sc.nextInt();
             b=sc.nextInt();
            }
            switch(calculate){
                case "addition": c.addition(a,b);
                                 break;
                case "subtraction": c.subtraction(a, b);
                                 break;
                case "multiplication": c.multiplication(a, b);
                                 break;
                case "division":
                                 try{
                                    c.divison(a, b);
                                }
                                    catch(ArithmeticException e){
                                   System.out.println("Airthmetic Exception : "+e.getMessage());
                                 }
                                  break;
                case "exit":  System.out.println("Exiting the program...");
                              System.exit(0);
                               break;
                default:System.out.println("Invalid Choice");
            }
        }
    }
    
}
