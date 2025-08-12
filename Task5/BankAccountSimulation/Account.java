package BankAccountSimulation;
class Account{
    int accountNo;
    String holdername;
    double balance;
    double amount;
    public Account(){}
    public Account(int accountNo, String holdername, double balance) {
        this.accountNo = accountNo;
        this.holdername = holdername;
        this.balance = balance;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public String getHoldername() {
        return holdername;
    }
    public void setHoldername(String holdername) {
        this.holdername = holdername;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return "AccountNo:"+accountNo+" AccountHolderName:"+holdername+" Balance:"+balance;
    }

    public double deposit(double amount){
           return this.balance+amount;
    }
    public double withdraw(double amount){
        return this.balance-amount;
    }

}