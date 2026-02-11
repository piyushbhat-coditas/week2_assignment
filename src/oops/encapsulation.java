//package oops;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public void main(String[] args) {

    BankAccount account = new BankAccount();

    account.balance = 5000;    //NOT ALLOWED (encapsulation)
    account.deposit(5000);   //controlled access
//    System.out.println(account);
    System.out.println(account.getBalance());

}
