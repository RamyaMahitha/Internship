package JavaConsoleCalculator;

import javax.management.RuntimeErrorException;

class  Calculator {
    public  void addition(int a, int b){
        System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
    }  
    public void subtraction(int a, int b){
        System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
    }
    public  void multiplication(int a, int b){
        System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
    } 
    public  void divison(int a, int b) {
        if(b==0){
            throw new ArithmeticException("value of b is zero");
        }
        System.out.println("Division of "+a+" and "+b+" is: "+(a/b));
    } 

    
}