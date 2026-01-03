package Week9;
public class BankAccount
{
    int acc_number;
    String name;
    double balance;
    public BankAccount(int acc_number, String name, double balance)
    {
        this.acc_number=acc_number;
        this.name=name;
        this.balance=balance;
    }
    void deposit(double amount)
    {
        balance = balance+amount;
        System.out.println("Amount deposited in Saving Account= " + amount);
    }
    double getBalance()
    {
        return balance;
    }
}